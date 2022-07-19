package com.autentia.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Asignatura {
    String nombre;
    Double nota;

    public Asignatura(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
