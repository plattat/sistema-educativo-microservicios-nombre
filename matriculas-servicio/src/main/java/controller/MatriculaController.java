package controller;

import entity.Matricula;
import service.MatriculaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    private final MatriculaService service;

    public MatriculaController(MatriculaService service) {
        this.service = service;
    }

    @PostMapping
    public Matricula crear(@RequestBody Matricula matricula) {
        return service.guardar(matricula);
    }

    @GetMapping
    public List<Matricula> listar() {
        return service.obtenerTodas();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}