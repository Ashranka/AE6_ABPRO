package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
    private String marca;
    private String memoriaRAM;
    private String numeroSerie;

    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible,
                               String marca, String memoriaRAM, String numeroSerie) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DE LA COMPUTADORA PORTÁTIL ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad Disponible: " + cantidadDisponible);
        System.out.println("Marca: " + marca);
        System.out.println("Memoria RAM: " + memoriaRAM);
        System.out.println("Número de Serie: " + numeroSerie);
    }
}