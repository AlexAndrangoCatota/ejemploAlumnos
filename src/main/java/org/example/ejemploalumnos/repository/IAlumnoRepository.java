package org.example.ejemploalumnos.repository;

import org.example.ejemploalumnos.model.AlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<AlumnoEntity, Integer> {
}
