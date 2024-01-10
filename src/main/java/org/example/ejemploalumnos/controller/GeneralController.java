package org.example.ejemploalumnos.controller;

import org.example.ejemploalumnos.service.AlumnoService;
import org.example.ejemploalumnos.service.MaestroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/general")
public class GeneralController {
    @Autowired
    AlumnoService alumnoService;

    @Autowired
    MaestroService maestroService;

    @PostMapping(value = "addalumno",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addAlumno(@RequestBody String json){
        alumnoService.agregarAlumno(json);
        return ResponseEntity.ok().body("Nuevo alumno ingresado");
    }
}
