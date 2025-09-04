# Sistema de Gestión de Tienda Electrónica

## Grupo 3
- **Andrea Correa**
- **Andrés Shranka**

---

## Descripción del Proyecto

Este proyecto implementa un sistema de gestión de inventario para una tienda de productos electrónicos desarrollado en Java. El sistema permite administrar diferentes tipos de productos, realizar ventas y mantener un control detallado del inventario disponible.

## Características Principales

El sistema maneja tres tipos de productos:
- **Televisores**: Con especificaciones como tamaño de pantalla y resolución
- **Computadoras Portátiles**: Incluyendo marca, memoria RAM y número de serie
- **Productos Electrónicos Generales**: Como microondas y otros electrodomésticos

## Funcionalidades

- Agregar productos al inventario
- Realizar ventas con validación de stock disponible
- Mostrar información detallada de todos los productos
- Control automático de cantidades disponibles
- Alertas de productos agotados
- Búsqueda de productos por nombre

## Estructura del Código

```
src/com/clases/
├── ProductoElectrodomestico.java    # Clase base para todos los productos
├── Televisor.java                   # Especialización para televisores
├── ComputadoraPortatil.java         # Especialización para laptops
├── TiendaElectronica.java          # Gestor principal del inventario
└── Main.java                       # Aplicación de demostración
```

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal
- **Programación Orientada a Objetos**: Herencia, encapsulación y polimorfismo
- **ArrayList**: Para el manejo dinámico de colecciones
- **Sobrescritura de métodos**: Para comportamientos específicos por tipo de producto

## Cómo Ejecutar

1. Compilar todos los archivos Java en el paquete `com.clases`
2. Ejecutar la clase `Main` para ver la demostración del sistema
3. El programa mostrará el inventario inicial, realizará algunas ventas de ejemplo y mostrará el estado final del inventario

## Ejemplo de Uso

El programa de demostración crea una tienda con productos iniciales, realiza varias operaciones de venta y muestra cómo el sistema maneja diferentes escenarios como productos agotados y validación de stock disponible.

---

**Desarrollado como parte del curso de Programación Orientada a Objetos**