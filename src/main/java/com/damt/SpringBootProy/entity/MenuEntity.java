package com.damt.SpringBootProy.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "menu")
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(name = "nombre_menu", nullable = false)
    private String nombreMenu;
    @Column(name = "personas_menu", nullable = false)
    private String personasMenu;
    @ManyToOne(targetEntity = CategoriaEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "categoria_menu", referencedColumnName = "id")
    private CategoriaEntity categoria_menu;

    public MenuEntity() {
    }

    public MenuEntity(int id, String nombreMenu, String personasMenu, CategoriaEntity categoria_menu) {
        this.id = id;
        this.nombreMenu = nombreMenu;
        this.personasMenu = personasMenu;
        this.categoria_menu = categoria_menu;
    }

    public MenuEntity(String nombreMenu, String personasMenu, CategoriaEntity categoria_menu) {
        this.nombreMenu = nombreMenu;
        this.personasMenu = personasMenu;
        this.categoria_menu = categoria_menu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public String getPersonasMenu() {
        return personasMenu;
    }

    public void setPersonasMenu(String personasMenu) {
        this.personasMenu = personasMenu;
    }

    public CategoriaEntity getCategoria_menu() {
        return categoria_menu;
    }

    public void setCategoria_menu(CategoriaEntity categoria_menu) {
        this.categoria_menu = categoria_menu;
    }

    @Override
    public String toString() {
        return "MenuEntity{" +
                "id=" + id +
                ", nombreMenu='" + nombreMenu + '\'' +
                ", personasMenu='" + personasMenu + '\'' +
                ", categoria_menu=" + categoria_menu +
                '}';
    }
}
