package com.autentia.service;

import com.autentia.model.Asignatura;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class AsignaturaServiceImpl implements AsignaturaService{

    @Override
    public List<Asignatura> getCalificaciones() {
        List<Asignatura> calificaciones = new ArrayList<>();
        calificaciones.add(new Asignatura("Backend", 8.5));
        calificaciones.add(new Asignatura("Frontend", 5.0));
        calificaciones.add(new Asignatura("Aplicaciones Móviles", 4.2));
        calificaciones.add(new Asignatura("Metodologías Ágiles", 6.3));
        calificaciones.add(new Asignatura("Experiencia de Usuario (UX)", 9.5));
        return calificaciones;
    }
}
