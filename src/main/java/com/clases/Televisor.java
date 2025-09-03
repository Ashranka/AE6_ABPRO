package com.clases;

public class Televisor extends ProductoElectrodomestico {
    private String tamañoPantalla;
    private String resolucion;

    public Televisor(String nombre, double precio, int cantidadDisponible,
                     String tamañoPantalla, String resolucion) {
        super(nombre, precio, cantidadDisponible);
        this.tamañoPantalla = tamañoPantalla;
        this.resolucion = resolucion;
    }

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL TELEVISOR ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad Disponible: " + cantidadDisponible);
        System.out.println("Tamaño de Pantalla: " + tamañoPantalla);
        System.out.println("Resolución: " + resolucion);
    }
}
