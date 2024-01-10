package org.example.ejemploalumnos.service;

import com.google.gson.Gson;
import org.example.ejemploalumnos.model.MaestroEntity;
import org.example.ejemploalumnos.repository.IMaestroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaestroService {
    @Autowired
    IMaestroRepository maestroRepository;

    Gson gson = new Gson()
            .newBuilder()
            .disableHtmlEscaping()
            .setPrettyPrinting()
            .serializeNulls()
            .create();

    public List<MaestroEntity> getAllAlumnoEntity(){
        return maestroRepository.findAll();
    }
    public void addMaestro (String jsonMaestro){
        MaestroEntity newMaestro = gson.fromJson(jsonMaestro, MaestroEntity.class);
        maestroRepository.save(newMaestro);
    }
}
