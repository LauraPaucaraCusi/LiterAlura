package com.literalura.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Libro {
    @Id
    private Long id;
    private String titulo;

    public Libro() {}
    public Libro(Long id, String titulo) { this.id = id; this.titulo = titulo; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
}
