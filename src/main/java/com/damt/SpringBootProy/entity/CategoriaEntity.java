package com.damt.SpringBootProy.entity;

import jakarta.persistence.*;

@Entity
@Table(name="categorias")
public class CategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(name = "nombre_categoria")
    private String nombreCategoria;

    public CategoriaEntity() {
    }

    public CategoriaEntity(int id, String nombreCategoria) {
        this.id = id;
        this.nombreCategoria = nombreCategoria;
    }

    public CategoriaEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return "CategoriaEntity{" +
                "id=" + id +
                ", nombreCategoria='" + nombreCategoria + '\'' +
                '}';
    }
}
