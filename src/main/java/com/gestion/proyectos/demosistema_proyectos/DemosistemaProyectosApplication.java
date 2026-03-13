package com.gestion.proyectos.demosistema_proyectos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
    
    scanBasePackages = { "com.gestion.proyectos" }
)

@EntityScan(basePackages = { "com.gestion.proyectos.sistema_proyectos.model" })

@EnableJpaRepositories(basePackages = { "com.gestion.proyectos" })
public class DemosistemaProyectosApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemosistemaProyectosApplication.class, args);
    }
}
