package Controller;

import com.entity.Asignatura;
import service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaController {

    @Autowired
    private AsignaturaService servicio;

    @PostMapping
    public Asignatura guardar(@RequestBody Asignatura asignatura) {
        return servicio.guardarAsignatura(asignatura);
    }

    @GetMapping
    public List<Asignatura> listar() {
        return servicio.listarAsignaturas();
    }

    @GetMapping("/{id}")
    public Asignatura obtenerPorId(@PathVariable Long id) {
        return servicio.obtenerAsignaturaPorId(id);
    }

    @PutMapping("/{id}")
    public Asignatura actualizar(@PathVariable Long id, @RequestBody Asignatura asignatura) {
        return servicio.actualizarAsignatura(id, asignatura);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        servicio.eliminarAsignatura(id);
    }
}