package org.example.clases;

public class Jugador {

    private String nombres;
    private String apellidos;
    private String numeroCamiseta;
    private String posicion;
    private int edad;
    private String equipo;

    public Jugador() {
    }

    public Jugador(String nombres, String apellidos, String numeroCamiseta, String posicion, int edad, String equipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
        this.edad = edad;
        this.equipo = equipo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(String numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;


    }
}
