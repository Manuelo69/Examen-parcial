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

import cic.ejercicio4_04.model.Director;

@RestController
@RequestMapping("/directores")
public class DirectorController {

    private List<Director> directores = new ArrayList<>();

    @GetMapping
    public List<Director> getAllDirectores() {
        return directores;
    }

    @GetMapping("/{id}")
    public Director getDirectorById(@PathVariable Long id) {
        return directores.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }

    @PostMapping
    public Director createDirector(@RequestBody Director director) {
        directores.add(director);
        return director;
    }

    @PutMapping("/{id}")
    public Director updateDirector(@PathVariable Long id, @RequestBody Director director) {
        Optional<Director> existingDirector = directores.stream().filter(d -> d.getId().equals(id)).findFirst();
        if (existingDirector.isPresent()) {
            directores.remove(existingDirector.get());
            directores.add(director);
            return director;
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteDirector(@PathVariable Long id) {
        directores.removeIf(d -> d.getId().equals(id));
    }

}
