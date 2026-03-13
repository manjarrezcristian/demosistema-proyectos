package com.gestion.proyectos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.proyectos.sistema_proyectos.model.entity.Proyecto;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
}
