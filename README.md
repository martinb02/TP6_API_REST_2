# TP6 API REST 2 - Trabajo practico de Api Rest

Este proyecto es una API REST sencilla desarrollada en Spring Boot para gestionar una colección de libros. Permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre la entidad `Libro`.

## Tabla de Contenidos

- [Características](#características)
- [Tecnologías Usadas](#tecnologías-usadas)
- [Requisitos Previos](#requisitos-previos)
- [Configuración](#configuración)
- [Ejecución del Proyecto](#ejecución-del-proyecto)
- [EndPoints de la API](#endpoints-de-la-api)
- [Contribución](#contribución)
- [Licencia](#licencia)

## Características

- Gestión de libros (crear, leer, actualizar y eliminar).
- Persistencia en base de datos en memoria utilizando H2.
- Soporte para la documentación de la API con Spring REST Docs.
- Auditoría de cambios en los libros utilizando Hibernate Envers.

## Tecnologías Usadas

- [Spring Boot](https://spring.io/projects/spring-boot) - Framework para el desarrollo de aplicaciones Java.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Facilita el acceso a datos en aplicaciones Java.
- [H2 Database](http://www.h2database.com/) - Base de datos en memoria para pruebas.
- [Lombok](https://projectlombok.org/) - Simplifica el código Java reduciendo la boilerplate.
- [Hibernate Envers](https://hibernate.org/orm/releases/6.4/#envers) - Soporte para la auditoría de entidades.

## Requisitos Previos

- Java 17 o superior.
- Maven 3.6 o superior.

## Configuración

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu_usuario/nombre_del_repositorio.git
   ```

2. Navega a la carpeta del proyecto:
   ```bash
   cd nombre_del_repositorio
   ```

3. Configura el archivo `application.properties` (si es necesario) en `src/main/resources` para ajustar la conexión a la base de datos.

## Ejecución del Proyecto

Para ejecutar la aplicación, puedes utilizar Maven:

```bash
mvn spring-boot:run
```

La aplicación se ejecutará en `http://localhost:9000`.

## EndPoints de la API

### Crear un nuevo libro

- **URL**: `/api/libros`
- **Método**: `POST`
- **Cuerpo de la solicitud**:
  ```json
  {
      "titulo": "Título del Libro",
      "autor": "Autor del Libro",
      "isbn": "ISBN del Libro"
  }
  ```

### Obtener un libro por ID

- **URL**: `/api/libros/{id}`
- **Método**: `GET`

### Obtener todos los libros

- **URL**: `/api/libros`
- **Método**: `GET`

### Actualizar un libro

- **URL**: `/api/libros/{id}`
- **Método**: `PUT`
- **Cuerpo de la solicitud**:
  ```json
  {
      "titulo": "Título actualizado",
      "autor": "Autor actualizado",
      "isbn": "ISBN actualizado"
  }
  ```

### Eliminar un libro

- **URL**: `/api/libros/{id}`
- **Método**: `DELETE`

