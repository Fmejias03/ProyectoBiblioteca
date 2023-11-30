# ProyectoBiblioteca

## Nota
 Mi Repositorio: https://github.com/Fmejias03/ProyectoBiblioteca.git
 
 ## Ejercicio
 ## Contexto del problema
En una biblioteca pública grande, existen miles de libros y cientos de lectores que buscan pedir prestados, devolver y renovar estos libros. Además, los bibliotecarios deben ser capaces de agregar nuevos libros al sistema, eliminar libros obsoletos o dañados, y realizar un seguimiento de los préstamos de libros. Para manejar estas tareas de forma eficiente y segura, necesitamos desarrollar un Sistema de Gestión de Bibliotecas (LMS por sus siglas en inglés) que use Hibernate y JPA para interactuar con una base de datos SQL y que pueda manejar solicitudes concurrentes de manera segura.

## Requisitos técnicos

1. **Diseño e implementación de un modelo de datos para la biblioteca**: Esto debe incluir clases para libros, lectores, préstamos, y cualquier otra entidad que considere necesaria.
2. **Uso de Hibernate y JPA**: Para mapear sus clases de dominio a las tablas de la base de datos.
3. **Proporcionar una API**: Que permita a los clientes (bibliotecarios y lectores) realizar las operaciones básicas de la biblioteca, como buscar libros, pedir prestados libros, devolver libros, renovar préstamos, agregar nuevos libros y eliminar libros obsoletos. Puedes consultar aquí para más detalles.
4. **Implementación del control de concurrencia**: Para evitar condiciones de carrera, por ejemplo, dos lectores que intentan pedir prestado el mismo libro al mismo tiempo.
5. **Implementación de auditoría y control de versiones**: Para realizar un seguimiento de quién hace qué y cuándo en el sistema.
6. **Uso de una caché**: Para mejorar el rendimiento de las operaciones comunes, como buscar libros.
7. **Pruebas unitarias e integración**: Para verificar el correcto funcionamiento de su aplicación.

This app was created with Bootify.io - tips on working with the code [can be found here](https://bootify.io/next-steps/).
Feel free to contact us for further questions.

## Development

When starting the application `docker compose up` is called and the app will connect to the contained services.
[Docker](https://www.docker.com/get-started/) must be available on the current system.

During development it is recommended to use the profile `local`. In IntelliJ `-Dspring.profiles.active=local` can be
added in the VM options of the Run Configuration after enabling this property in "Modify options". Create your own
`application-local.yml` file to override settings for development.

Lombok must be supported by your IDE. For IntelliJ install the Lombok plugin and enable annotation processing -
[learn more](https://bootify.io/next-steps/spring-boot-with-lombok.html).

In addition to the Spring Boot application, the DevServer must also be started. [Node.js](https://nodejs.org/) has to be
available on the system - the latest LTS version is recommended. On first usage and after updates the dependencies have to be installed:

```
npm install
```

The DevServer can now be started as follows:

```
npm run devserver
```

Using a proxy the whole application is now accessible under `localhost:8081`. All changes to the templates and JS/CSS
files are immediately visible in the browser.

## Build

The application can be built using the following command:

```
mvnw clean package
```

Node.js is automatically downloaded using the `frontend-maven-plugin` and the final JS/CSS files are integrated into the jar.

Start your application with the following command - here with the profile `production`:

```
java -Dspring.profiles.active=production -jar ./target/ProyectoBiblioteca-0.0.1-SNAPSHOT.jar
```

If required, a Docker image can be created with the Spring Boot plugin. Add `SPRING_PROFILES_ACTIVE=production` as
environment variable when running the container.

```
mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=io.bootify/proyecto-biblioteca
```

## Further readings

* [Maven docs](https://maven.apache.org/guides/index.html)  
* [Spring Boot reference](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)  
* [Spring Data JPA reference](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)  
* [Thymeleaf docs](https://www.thymeleaf.org/documentation.html)  
* [Webpack concepts](https://webpack.js.org/concepts/)  
* [npm docs](https://docs.npmjs.com/)  
* [Bootstrap docs](https://getbootstrap.com/docs/5.3/getting-started/introduction/)  
* [Htmx in a nutshell](https://htmx.org/docs/)  
* [Learn Spring Boot with Thymeleaf](https://www.wimdeblauwe.com/books/taming-thymeleaf/)  
