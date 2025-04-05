package service;

import com.entity.Asignatura;
import repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {

    @Autowired
    private AsignaturaRepository repo;

    @Override
    public Asignatura guardarAsignatura(Asignatura asignatura) {
        return repo.save(asignatura);
    }

    @Override
    public List<Asignatura> listarAsignaturas() {
        return repo.findAll();
    }

    @Override
    public Asignatura obtenerAsignaturaPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Asignatura actualizarAsignatura(Long id, Asignatura asignatura) {
        Optional<Asignatura> existente = repo.findById(id);
        if (existente.isPresent()) {
            Asignatura a = existente.get();
            a.setNombre(asignatura.getNombre());
            a.setDescripcion(asignatura.getDescripcion());
            return repo.save(a);
        }
        return null;
    }

    @Override
    public void eliminarAsignatura(Long id) {
        repo.deleteById(id);
    }
}