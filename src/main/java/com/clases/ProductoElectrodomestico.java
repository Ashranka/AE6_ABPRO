package com.clases;

public class ProductoElectrodomestico {

        protected String nombre;
        protected double precio;
        protected int cantidadDisponible;

        public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidadDisponible = cantidadDisponible;
        }

        public ProductoElectrodomestico(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidadDisponible = 0;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getCantidadDisponible() {
            return cantidadDisponible;
        }

        public void setCantidadDisponible(int cantidadDisponible) {
            this.cantidadDisponible = cantidadDisponible;
        }

        public void mostrarInformacion() {
            System.out.println("=== INFORMACIÓN DEL PRODUCTO ===");
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Cantidad Disponible: " + cantidadDisponible);
        }
}
