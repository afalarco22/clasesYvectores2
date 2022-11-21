package org.example.fiesta;

public class Invitado {

    // atributos
    private String nombre;
    private String apellido;
    private String id;
    private int edad;
    private boolean aplicarCover;
    private double valorCover;

    // constructor

    public Invitado() {
    }

    public Invitado(String nombre, String apellido, String id, int edad, boolean aplicarCover, double valorCover) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
        this.aplicarCover = aplicarCover;
        this.valorCover = valorCover;
    }

    // get y set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAplicarCover() {
        return aplicarCover;
    }

    public void setAplicarCover(boolean aplicarCover) {
        this.aplicarCover = aplicarCover;
    }

    public double getValorCover() {
        return valorCover;
    }

    public void setValorCover(double valorCover) {
        this.valorCover = valorCover;
    }
}
