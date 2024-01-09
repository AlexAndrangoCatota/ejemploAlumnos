package org.example.ejemploalumnos.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "Alumno", schema = "public", catalog = "AlumnosDB")
public class AlumnoEntity {
    private Integer idAlumno;
    private String nombre;
    private String apellido;
    private String maestroIdMaestro;

    @Basic
    @Column(name = "idAlumno", nullable = true)
    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Basic
    @Column(name = "Nombre", nullable = true, length = -1)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "Apellido", nullable = true, length = -1)
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Basic
    @Column(name = "Maestro_idMaestro", nullable = true, length = -1)
    public String getMaestroIdMaestro() {
        return maestroIdMaestro;
    }

    public void setMaestroIdMaestro(String maestroIdMaestro) {
        this.maestroIdMaestro = maestroIdMaestro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlumnoEntity that = (AlumnoEntity) o;
        return Objects.equals(idAlumno, that.idAlumno) && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(maestroIdMaestro, that.maestroIdMaestro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlumno, nombre, apellido, maestroIdMaestro);
    }
}
