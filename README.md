# API de Fibonacci - Documentación

Esta es una API REST simple desarrollada en Spring Boot que permite calcular el valor de Fibonacci correspondiente a un índice dado. La API acepta un valor entero no negativo como entrada y devuelve el número de Fibonacci correspondiente.

## Tecnologías Utilizadas

-Java
-Spring Boot
-Spring Web

## Cómo Usar la API

Para calcular el número de Fibonacci para un índice específico, realiza una solicitud GET a la siguiente URL

http://localhost:8080/fibonacci/{n}

Donde {n} es el índice deseado.

## Decisiones Técnicas

**Lenguaje de Programación:** Se eligió Java debido a su robustez y popularidad en el desarrollo de aplicaciones empresariales.

**Framework:** Se utilizó Spring Boot para simplificar la configuración y el desarrollo rápido de la API REST.

**Algoritmo:** Se implementó un algoritmo iterativo para calcular el número de Fibonacci. Esto permite manejar números grandes de manera eficiente y evita desbordamientos de enteros.

**Manejo de Excepciones:** Se agregó manejo de excepciones para detectar índices negativos y números de Fibonacci extremadamente grandes.

**Validación de Entrada:** Se validó que el índice sea un número no negativo.

## Posibles Optimizaciones Futuras

**Memorización:** Para mejorar el rendimiento en cálculos repetitivos, se podría implementar la memorización (almacenamiento en caché) de resultados previamente calculados.

**Documentación de Swagger:** Agregar documentación utilizando Swagger para describir la API y facilitar su consumo por parte de los usuarios.

**Manejo de Errores Personalizados:** Personalizar las respuestas de error para proporcionar mensajes de error más descriptivos y amigables para el cliente.

**Seguridad:** Implementar autenticación y autorización si la API se utiliza en un entorno donde se requiera acceso restringido.