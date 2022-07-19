package com.autentia.views;

import com.autentia.model.Asignatura;
import com.autentia.service.AsignaturaService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.micronaut.views.View;
import jakarta.inject.Inject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller("/")
class ViewsController {

    private final AsignaturaService asignaturaService;

    @Inject
    public ViewsController(AsignaturaService asignaturaService) {
        this.asignaturaService = asignaturaService;
    }

    @View("home")
    @Get()
    public HttpResponse<Map<String,Object>> index() {
        Map<String, Object> map =  new HashMap<>();
        List<Asignatura> calificaciones = asignaturaService.getCalificaciones();
        map.put("calificaciones",calificaciones);

        return HttpResponse.ok(map);
    }

}
