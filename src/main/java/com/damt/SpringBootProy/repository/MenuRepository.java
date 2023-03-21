package com.damt.SpringBootProy.repository;

import com.damt.SpringBootProy.entity.CategoriaEntity;
import com.damt.SpringBootProy.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {

    MenuEntity saveAndFlush(MenuEntity nuevoRegistro);

}
