# Proyecto Java - Clase Product

Este proyecto es un ejercicio de programacion orientada a objetos en Java.
Se crea una clase Product con atributos, constructores, getters, setters y toString.

## Archivos

- `Product.java` - La clase con los atributos y metodos
- `Main.java` - La clase principal donde se prueba todo

## Como compilar y ejecutar

1. Abrir una terminal en la carpeta del proyecto
2. Compilar:

```bash
javac -d out src/main/java/com/example/Product.java src/main/java/com/example/Main.java
```

3. Ejecutar:

```bash
java -cp out com.example.Main
```

## Salida esperada

```
Producto 1:
ID: P001
Nombre: Keyboard
Product [ID: P001, Name: Keyboard, Price: 45.99, Stock: 100]

Producto 2:
Precio: 999.99
Stock: 30
Product [ID: P123, Name: Laptop, Price: 999.99, Stock: 30]
```