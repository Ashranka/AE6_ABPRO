package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
    private ArrayList<ProductoElectrodomestico> listaDeProductos;



    public TiendaElectronica() {
        this.listaDeProductos = new ArrayList<>();
    }

    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
        System.out.println("Producto agregado exitosamente: " + producto.getNombre());
    }

    public void mostrarTodosLosProductos() {
        System.out.println("\n" + "===================");
        System.out.println("  INVENTARI COMPLETO DE LA TIENDA");
        System.out.println("\n" + "===================");

        if (listaDeProductos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        for (int i = 0; i < listaDeProductos.size(); i++) {
            System.out.println("\n--- Producto #" + (i + 1) + " ---");
            listaDeProductos.get(i).mostrarInformacion();
        }
        System.out.println("\n" + "===================");
    }

    public ProductoElectrodomestico buscarProductoPorNombre(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null; //devuevlo nulo pedro podria ser el elemento vqcxio
    }

    public void realizarVenta(String nombreProducto, int cantidad) {
        ProductoElectrodomestico producto = buscarProductoPorNombre(nombreProducto);

        if (producto == null) {
            System.out.println(" Producto no encontrado: " + nombreProducto);
            return;
        }

        if (producto.getCantidadDisponible() == 0) {
            System.out.println(" Producto agotado: " + nombreProducto);
            return;
        }

        if (producto.getCantidadDisponible() < cantidad) {
            System.out.println(" No hay suficiente stock. Disponible: " +
                    producto.getCantidadDisponible() + ", Solicitado: " + cantidad);
            return;
        }

        producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
        double totalVenta = producto.getPrecio() * cantidad;

        System.out.println(" Venta realizada exitosamente!");
        System.out.println("   Producto: " + nombreProducto);
        System.out.println("   Cantidad vendida: " + cantidad);
        System.out.println("   Total: $" + totalVenta);
        System.out.println("   Stock restante: " + producto.getCantidadDisponible());
    }

    // veo la cantidad de productos que hay en la tienda
    public int getTotalProductos() {
        return listaDeProductos.size();
    }}
