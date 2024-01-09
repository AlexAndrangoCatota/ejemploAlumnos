package org.example.ejemploalumnos.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Materia", schema = "public", catalog = "AlumnosDB")
public class MateriaEntity {
    private int idMateria;
    private String descripcion;
    private String puntos;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idMateria", nullable = false)
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = -1)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "Puntos", nullable = true, length = -1)
    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MateriaEntity that = (MateriaEntity) o;
        return idMateria == that.idMateria && Objects.equals(descripcion, that.descripcion) && Objects.equals(puntos, that.puntos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMateria, descripcion, puntos);
    }
}
