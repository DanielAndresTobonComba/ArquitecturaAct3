# ArquitecturaAct5


# API de Gestión de Usuarios

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

### 2. Obtener Todos los Usuarios
- **Método**: `GET`
- **URL**: `http://localhost:8090/usuarios/todos`
- **Cuerpo**: N/A

### 3. Obtener un Usuario por ID
- **Método**: `GET`
- **URL**: `http://localhost:8090/usuarios/buscar/1`
- **Cuerpo**: N/A



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

### 6. Eliminar un Usuario
- **Método**: `DELETE`
- **URL**: `http://localhost:8090/usuarios/eliminar/1`
- **Cuerpo**: N/A

