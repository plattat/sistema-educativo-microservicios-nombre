package service;

import com.entity.Asignatura;
import java.util.List;

public interface AsignaturaService {
    Asignatura guardarAsignatura(Asignatura asignatura);
    List<Asignatura> listarAsignaturas();
    Asignatura obtenerAsignaturaPorId(Long id);
    Asignatura actualizarAsignatura(Long id, Asignatura asignatura);
    void eliminarAsignatura(Long id);
}