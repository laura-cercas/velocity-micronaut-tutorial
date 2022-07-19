package com.autentia.service;

import com.autentia.model.Asignatura;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


class AsignaturaServiceImplTest {

    private static final AsignaturaServiceImpl asignaturaServiceSut = new AsignaturaServiceImpl();

    @Test
    void shouldReturnCalificaciones() {
        List<Asignatura> expectedResult = mockCalificaciones();
        List<Asignatura> calificaciones = asignaturaServiceSut.getCalificaciones();
        assertThat(calificaciones.size()).isEqualTo(expectedResult.size());
    }

    private List<Asignatura> mockCalificaciones(){
        List<Asignatura> calificaciones = new ArrayList<>();
        calificaciones.add(new Asignatura("Backend", 8.5));
        calificaciones.add(new Asignatura("Frontend", 5.0));
        calificaciones.add(new Asignatura("Aplicaciones Móviles", 4.2));
        calificaciones.add(new Asignatura("Metodologías Ágiles", 6.3));
        calificaciones.add(new Asignatura("Experiencia de Usuario (UX)", 9.5));
        return calificaciones;
    }

}