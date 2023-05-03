package org.example;

public class Comida {
    private String nombre;
    private boolean procesada;

    public Comida(String Yogurth, boolean procesada) {
    }

    public Comida(String nombre) {
        this.nombre = nombre;
    }
    public Comida(boolean procesada) {
        this.procesada = procesada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isProcesada() {
        return procesada;
    }

    public void setProcesada(boolean procesada) {
        this.procesada = procesada;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                ", procesada=" + procesada +
                '}';
    }
}
