package com.entity;

import jakarta.persistence.*;

@Entity
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
	public Object getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDescripcion() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setNombre(Object nombre2) {
		// TODO Auto-generated method stub
		
	}
	public void setDescripcion(Object descripcion2) {
		// TODO Auto-generated method stub
		
	}

    // Getters y Setters
}