package org.example;

import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaPorTeclado = new Scanner(System.in);

        ArrayList<Jugador> jugadores=new ArrayList<Jugador>();

        System.out.println("****SELECCION COLOMBIA****");
        System.out.println("**************************");

        int seleccion = 0;

        System.out.println("Seleccion de jugadores");
        System.out.println("***********************");
        System.out.println("1. Agregar jugador");
        System.out.println("2. Buscar jugador");
        System.out.println("3. Editar informacion del jugador");
        System.out.println("4. Mostrar jugadores");
        System.out.println("5. SALIR");

        do {
            System.out.println("Digita una opcion del menu: ");
            seleccion = entradaPorTeclado.nextInt();

            switch (seleccion){

                case 1:
                    if (jugadores.size()<=22){
                        Jugador objetoJugador = new Jugador();
                        System.out.println("Ingrese el nombre del jugador: ");
                        objetoJugador.setNombres(entradaPorTeclado.next());

                        System.out.println("Ingrese los apellidos del jugador: ");
                        objetoJugador.setApellidos(entradaPorTeclado.next());

                        System.out.println("Ingrese el numero de camiseta: ");
                        objetoJugador.setNumeroCamiseta(entradaPorTeclado.next());

                        System.out.println("Ingrese la posicion del jugador: ");
                        objetoJugador.setPosicion(entradaPorTeclado.next());

                        System.out.println("Ingrese la edad: ");
                        objetoJugador.setEdad(entradaPorTeclado.nextInt());

                        System.out.println("Ingrese el equipo del jugador: ");
                        objetoJugador.setEquipo(entradaPorTeclado.next());

                        jugadores.add(objetoJugador);

                    }else{
                        System.out.println("No es permitido ingresar mas jugadores");
                    }
                    break;
                case 2:
                    System.out.println("Digite el numero de la camiseta del jugador que desea buscar: ");
                    String buscarCamiseta;
                    buscarCamiseta = entradaPorTeclado.next();
                    String nombreJugador="";

                        for (Jugador jugador : jugadores){
                            if (jugador.getNumeroCamiseta().equals(buscarCamiseta)) {
                                nombreJugador = jugador.getNombres();
                                System.out.println("El nombre del jugador con este numero de camiseta es: " + nombreJugador);
                                break;
                            }

                            if (nombreJugador.equals("")) {
                                System.out.println("Este jugador no se encuentra registrado");
                            }
                        }
                        break;
                case 3: {
                    buscarCamiseta ="";
                    System.out.println("Digite el numero de la camiseta del jugador que desea editar: ");
                    buscarCamiseta = entradaPorTeclado.next();
                    boolean editarJugador = false;

                    for (Jugador jugador : jugadores){
                        if (jugador.getNumeroCamiseta().equals(buscarCamiseta)) {
                            System.out.println("El nombre del jugador es: " + jugador.getNombres() + " Digite el nuevo nombre del jugador: ");
                            jugador.setNombres(entradaPorTeclado.next());
                            System.out.println("El nuevo nombre es: " + jugador.getNombres());
                            editarJugador = true;
                            break;
                        }
                    }
                    if (!editarJugador){
                        System.out.println("Este jugador no se encuentra registrado");
                    }
                }
                break;

                case 4:
                    System.out.println("Los jugadores soleccionados son: ");
                    for (Jugador jugador : jugadores){
                        System.out.println(jugador.getNombres() + " " + jugador.getPosicion() + "numero" + jugador.getNumeroCamiseta());

                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");

            }

        }while (seleccion !=0);



















    }
}