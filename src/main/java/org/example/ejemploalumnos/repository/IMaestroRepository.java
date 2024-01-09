package org.example.ejemploalumnos.repository;

import org.example.ejemploalumnos.model.MaestroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMaestroRepository extends JpaRepository<MaestroEntity, Integer> {
}
