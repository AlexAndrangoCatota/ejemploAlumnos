package org.example.ejemploalumnos.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Maestro", schema = "public", catalog = "AlumnosDB")
public class MaestroEntity {
    private int idMaestro;
    private String nombre;
    private String apellido;
    private String titulo;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idMaestro", nullable = false)
    public int getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(int idMaestro) {
        this.idMaestro = idMaestro;
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
    @Column(name = "Titulo", nullable = true, length = -1)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaestroEntity that = (MaestroEntity) o;
        return idMaestro == that.idMaestro && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(titulo, that.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMaestro, nombre, apellido, titulo);
    }
}
