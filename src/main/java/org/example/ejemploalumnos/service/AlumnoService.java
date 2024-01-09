package org.example.ejemploalumnos.service;

import com.google.gson.Gson;
import org.example.ejemploalumnos.model.AlumnoEntity;
import org.example.ejemploalumnos.repository.IAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    IAlumnoRepository alumnoRepository;
    Gson gson = new Gson()
            .newBuilder()
            .disableHtmlEscaping()
            .setPrettyPrinting()
            .serializeNulls()
            .create();

    public List<AlumnoEntity> getAllAlumno() {
        return alumnoRepository.findAll();
    }
    public void agregarAlumno(String jsonData){
        AlumnoEntity nuevoAlumno = gson.fromJson(jsonData, AlumnoEntity.class);
        alumnoRepository.save(nuevoAlumno);
    }
}
