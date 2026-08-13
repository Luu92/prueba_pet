# Caso Práctico Java - API Pet

Proyecto desarrollado como parte de un caso práctico utilizando Spring Boot y Gradle.

La aplicación expone servicios REST para consultar y registrar mascotas, utilizando Swagger Petstore como API externa.

## Tecnologías utilizadas

* Java 17
* Spring Boot 3.2.7
* Gradle - Groovy
* Spring Web
* RestTemplate

## Estructura del proyecto

El proyecto está organizado en las siguientes capas:

* `controller`: Contiene los endpoints REST de la aplicación.
* `service`: Contiene la lógica de negocio.
* `client`: Contiene la comunicación con la API externa de Petstore.
* `model`: Contiene los objetos utilizados para representar los datos de entrada y salida.

## Construcción del proyecto

El proyecto utiliza Gradle Wrapper, por lo que no es necesario tener Gradle instalado localmente.

Para construir el proyecto:

Por defecto, la aplicación se ejecuta en:

```text
http://localhost:8080
```

## Endpoints

### Consultar mascota

```http
GET /api/pet/{petId}
```

Ejemplo:

```http
GET http://localhost:8080/api/pet/10
```

Respuesta:

```json
{
  "id": 10,
  "name": "doggie",
  "status": "available"
}
```

La información de la mascota es obtenida desde Swagger Petstore y posteriormente se muestra en consola antes de ser retornada por el API.
Hasta el momento los valores que se probaron fueron en rango del 10 al 100.

### Registrar mascota

```http
POST /api/pet
```

Ejemplo de body:

```json
{
  "id": 10000023,
  "status": "available",
  "name": "Solobino"
}
```

Ejemplo de respuesta:

```json
{
  "transactionId": "b1f1bab8-d86c-4360-b2de-d91e2595ee15",
  "dateCreated": "2026-08-13T17:35:42.268056",
  "status": true,
  "name": "Solobino"
}
```

## API externa

Para la consulta y registro de mascotas se utiliza Swagger Petstore.

La comunicación con el servicio externo se encuentra separada de la lógica de negocio mediante la clase cliente correspondiente.
