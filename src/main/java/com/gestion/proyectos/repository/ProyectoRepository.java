package com.gestion.proyectos.repository;

import com.gestion.proyectos.model.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
}
