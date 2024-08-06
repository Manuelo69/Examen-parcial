package cic.ejercicio4_04.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cic.ejercicio4_04.model.Pelicula;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    private List<Pelicula> peliculas = new ArrayList<>();

    @GetMapping
    public List<Pelicula> getAllPeliculas() {
        return peliculas;
    }

    @GetMapping("/{id}")
    public Pelicula getPeliculaById(@PathVariable Long id) {
        return peliculas.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @PostMapping
    public Pelicula createPelicula(@RequestBody Pelicula pelicula) {
        peliculas.add(pelicula);
        return pelicula;
    }

    @PutMapping("/{id}")
    public Pelicula updatePelicula(@PathVariable Long id, @RequestBody Pelicula pelicula) {
        Optional<Pelicula> existingPelicula = peliculas.stream().filter(p -> p.getId().equals(id)).findFirst();
        if (existingPelicula.isPresent()) {
            peliculas.remove(existingPelicula.get());
            peliculas.add(pelicula);
            return pelicula;
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletePelicula(@PathVariable Long id) {
        peliculas.removeIf(p -> p.getId().equals(id));
    }

}
