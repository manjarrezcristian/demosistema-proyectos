
// package com.gestion.proyectos;

// import com.gestion.proyectos.model.embeddable.ContactoCliente;
// import com.gestion.proyectos.model.entity.Proyecto;
// import com.gestion.proyectos.model.enums.EstadoProyecto;
// import com.gestion.proyectos.model.enums.Prioridad;
// import jakarta.persistence.EntityManager;
// import jakarta.persistence.PersistenceContext;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.transaction.annotation.Transactional;

// @Configuration
// public class Bootstrap {

//     @PersistenceContext
//     private EntityManager em;

//     @Bean
//     @Transactional
//     CommandLineRunner seed() {
//         return args -> {
//             Proyecto p = new Proyecto();
//             p.setNombre("Implementación CRM");
//             p.setDescripcion("Proyecto demo de evaluación");
//             p.setEstadoProyecto(EstadoProyecto.PLANIFICACION);
//             p.setPrioridad(Prioridad.ALTA);

//             ContactoCliente c = new ContactoCliente();
//             c.setNombreRepresentante("Cliente Demo S.A.S.");
//             c.setEmailContacto("contacto@demo.com");
//             c.setTelefono("+57 3000000000");
//             p.setContactoCliente(c);

//             em.persist(p);
//         };
//     }
// }