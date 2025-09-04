package com.clases;

public class Main {
    public static void main(String[] args) {
        TiendaElectronica tienda = new TiendaElectronica();

        // Crear productos
        Televisor tv1 = new Televisor("Samsung Smart TV", 500.0, 3, "55\"", "4K UHD");  // tamañoPantalla es String, no int
        ComputadoraPortatil laptop1 = new ComputadoraPortatil("Laptop Gamer", 1200.0, 2, "Asus", "16GB", "SN123456");  // memoriaRAM es String, no int
        ProductoElectrodomestico microondas = new ProductoElectrodomestico("Microondas LG", 150.0, 5);

        // Agregar al inventario
        tienda.agregarProducto(tv1);
        tienda.agregarProducto(laptop1);
        tienda.agregarProducto(microondas);

        // Mostrar inventario inicial
        System.out.println("Inventario inicial:");
        tienda.mostrarTodosLosProductos();

        // Realizar ventas
        System.out.println("Realizando ventas...");
        tienda.realizarVenta("Samsung Smart TV", 1);
        tienda.realizarVenta("Laptop Gamer", 1);
        tienda.realizarVenta("Laptop Gamer", 1);
        tienda.realizarVenta("Laptop Gamer", 1);

        // Mostrar inventario actualizado
        System.out.println("\nInventario actualizado:");
        tienda.mostrarTodosLosProductos();

        // Mostrar resumen final
        System.out.println("\n=== RESUMEN FINAL ===");
        System.out.println("Total de productos diferentes: " + tienda.getTotalProductos());
        System.out.println("=====================");
    }
}