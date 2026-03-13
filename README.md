# Sistema de Proyectos – Spring Boot + JPA + PostgreSQL

Proyecto backend desarrollado con Spring Boot que implementa un modelo de datos usando:
- Herencia (`@MappedSuperclass`)
- Composición (`@Embeddable`)
- Enumeraciones (`@Enumerated`)
- Persistencia con PostgreSQL (Neon)

---

## Requisitos
- Java 21
- Maven
- PostgreSQL (Neon)

---

## Configuración

Crear un archivo `.env` (o `.env.properties`) en la raíz del proyecto:

```env
DB_URL=jdbc:postgresql://<HOST_NEON>:5432/neondb?sslmode=require
DB_USERNAME=<USUARIO_NEON>
DB_PASSWORD=<PASSWORD_NEON>