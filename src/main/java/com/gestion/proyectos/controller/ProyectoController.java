package com.gestion.proyectos.controller;

import com.gestion.proyectos.model.entity.Proyecto;
import com.gestion.proyectos.repository.ProyectoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController {

    private final ProyectoRepository proyectoRepository;

    public ProyectoController(ProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    // ✅ GET /api/proyectos
    @GetMapping
    public List<Proyecto> listar() {
        return proyectoRepository.findAll();
    }

    // ✅ POST /api/proyectos
    @PostMapping
    public Proyecto crear(@RequestBody Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }
}