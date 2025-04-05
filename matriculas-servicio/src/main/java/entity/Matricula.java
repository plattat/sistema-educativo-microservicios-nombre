package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long estudianteId;  // ID del estudiante

    private Long asignaturaId;  // ID de la materia
}