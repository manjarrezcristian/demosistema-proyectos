package com.gestion.proyectos.demosistema_proyectos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
    // Dile a Spring dónde escanear componentes (@Service, @Controller, etc.)
    scanBasePackages = { "com.gestion.proyectos" }
)
// Dile a Spring dónde están las entidades JPA y embeddables
@EntityScan(basePackages = { "com.gestion.proyectos.model" })
// Si luego agregas repositorios, que los busque aquí también
@EnableJpaRepositories(basePackages = { "com.gestion.proyectos" })
public class DemosistemaProyectosApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemosistemaProyectosApplication.class, args);
    }
}
