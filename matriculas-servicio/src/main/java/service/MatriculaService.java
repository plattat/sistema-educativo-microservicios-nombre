package service;

import entity.Matricula;
import repository.MatriculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    private final MatriculaRepository repository;

    public MatriculaService(MatriculaRepository repository) {
        this.repository = repository;
    }

    public Matricula guardar(Matricula matricula) {
        return repository.save(matricula);
    }

    public List<Matricula> obtenerTodas() {
        return repository.findAll();
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}