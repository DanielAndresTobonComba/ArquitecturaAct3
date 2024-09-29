# ArquitecturaAct5

# Documentación del Proyecto: Gestión de Usuarios

## 1. Descripción del Código y su Operación
Este proyecto implementa una API REST para la gestión de usuarios. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre un conjunto de usuarios almacenados en una base de datos. El código está escrito en Java utilizando el framework Spring Boot, que facilita el desarrollo de aplicaciones web.

### Componentes Clave del Código
- **Controlador (`UsuarioController`)**: Maneja las solicitudes HTTP y coordina la interacción entre la capa de servicios y el cliente.
- **Servicio (`UsuarioService`)**: Contiene la lógica de negocio y se encarga de la manipulación de datos.
- **Repositorio (`UsuarioRepository`)**: Interactúa con la base de datos para realizar las operaciones de acceso a datos.
- **Modelo (`Usuario`)**: Representa la estructura de datos del usuario.

## 2. Montaje y Herramientas Usadas
Para montar esta aplicación, se utilizaron las siguientes herramientas y tecnologías:
- **Java**: Lenguaje de programación utilizado.
- **Spring Boot**: Framework para construir aplicaciones Java basadas en la web.
- **Maven**: Herramienta de gestión de proyectos y dependencias.
- **Insomnia**: Herramienta para probar las API.
- **Mysql**: Bases de datos para la gestion y persistencia de datos.




## 3. Aplicación y Objetivo del Ejercicio
El objetivo de este ejercicio es crear una API funcional que permita gestionar usuarios en una aplicación. Este tipo de API es fundamental en muchas aplicaciones web y móviles, donde se necesita almacenar, recuperar y manipular información de usuarios de manera eficiente.

La aplicación puede ser utilizada en sistemas de gestión, plataformas de aprendizaje, y cualquier otra solución que requiera un manejo eficiente de datos de usuarios.

## 4. Pasos para Ejecutar el Código
A continuación, se presentan los pasos para ejecutar el código de la API:

1. **Configuración del Entorno**:
   - Asegúrate de tener instalado Java JDK y Maven en tu sistema profesor.
   - Clona el repositorio del proyecto a tu máquina local.

2. **Ejecutar el Servidor**:

   - Como yo ejecute es con una extension en visual studio code (el que yo usé) capás de correr un codigo java con springboot , maven , jdk etc.
     
   - Extensiones para visual code:
      - Extension Pack for Java.
      - Extension Pack for Java Auto Config.

3. **Probar la API**:
   - Abre Postman o cualquier otra herramienta de pruebas de API.
   - Utiliza los endpoints proporcionados en la documentación para realizar las operaciones deseadas.
     
   - Usar algun sistema gestor de db como workbench("el que use") para poder hacer seguimiento de los datos y la tabla usuario, ademas de poder usar codigo sql.

4. **Interactuar con la API**:
   - Prueba cada uno de los endpoints: crear, obtener, editar y eliminar usuarios, utilizando los cuerpos JSON especificados en la documentación.

## Conclusión
Este ejercicio proporciona una base sólida para comprender cómo construir y manejar una API RESTful utilizando Spring Boot, permitiendo a los desarrolladores adquirir habilidades prácticas en el desarrollo de aplicaciones web.


# Gestión de Usuarios

Esta API permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los usuarios.

## Endpoints

### 1. Crear un Usuario
- **Método**: `POST`
- **URL**: `http://localhost:8090/usuarios/crearUsuario`
- **Cuerpo**:
```json
{
    "nombre": "Juan Pérez",
    "correo": "juan@example.com"
}
```
![crear](https://github.com/user-attachments/assets/52e7ef0e-b2d0-469d-8beb-58673d2990ee)

### 2. Obtener Todos los Usuarios
- **Método**: `GET`
- **URL**: `http://localhost:8090/usuarios/todos`
- **Cuerpo**: N/A
![todos](https://github.com/user-attachments/assets/4bc47a2c-e839-441a-bfa8-99d8dfba7cc7)

### 3. Obtener un Usuario por ID
- **Método**: `GET`
- **URL**: `http://localhost:8090/usuarios/buscar/1`
- **Cuerpo**: N/A

![buscar](https://github.com/user-attachments/assets/7612246d-becf-4eb3-859e-77de4c1bbde8)


### 4. Editar un Usuario
- **Método**: `PUT` (o `PATCH`)
- **URL**: `http://localhost:8090/usuarios/editar/1`
- **Cuerpo**:
```json
{
    "nombre": "Juan Pérez Actualizado",
    "correo": "juan_actualizado@example.com"
}
```
![editar](https://github.com/user-attachments/assets/26d331af-4d00-4531-8bee-9b57b53f1460)

### 5. Eliminar un Usuario
- **Método**: `DELETE`
- **URL**: `http://localhost:8090/usuarios/eliminar/1`
- **Cuerpo**: N/A
![eliminar](https://github.com/user-attachments/assets/a04ebfaf-0ae1-4d22-b8a2-329a2eca8082)

