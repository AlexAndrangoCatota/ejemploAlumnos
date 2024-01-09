package org.example.ejemploalumnos.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "Alumno_has_materias", schema = "public", catalog = "AlumnosDB")
public class AlumnoHasMateriasEntity {
    private Integer alumnoIdAlumno;
    private Integer materiaIdMateria;

    @Basic
    @Column(name = "Alumno_idAlumno", nullable = true)
    public Integer getAlumnoIdAlumno() {
        return alumnoIdAlumno;
    }

    public void setAlumnoIdAlumno(Integer alumnoIdAlumno) {
        this.alumnoIdAlumno = alumnoIdAlumno;
    }

    @Basic
    @Column(name = "Materia_idMateria", nullable = true)
    public Integer getMateriaIdMateria() {
        return materiaIdMateria;
    }

    public void setMateriaIdMateria(Integer materiaIdMateria) {
        this.materiaIdMateria = materiaIdMateria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlumnoHasMateriasEntity that = (AlumnoHasMateriasEntity) o;
        return Objects.equals(alumnoIdAlumno, that.alumnoIdAlumno) && Objects.equals(materiaIdMateria, that.materiaIdMateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alumnoIdAlumno, materiaIdMateria);
    }
}
