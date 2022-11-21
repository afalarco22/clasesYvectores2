package org.example;

import org.example.fiesta.Costo;
import org.example.fiesta.Invitado;
import org.example.fiesta.Lugar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<Invitado> invitados = new ArrayList<Invitado>();
        Costo registrarCosto = new Costo();
        Lugar registrarLugar = new Lugar();


        int opcion;

        do {
            System.out.println("Ingrese una opción: ");
            System.out.println("0. para salir");
            System.out.println("1. Registrar lugar");
            System.out.println("2. Registrar los costos");
            System.out.println("3. Ingresar in invitado de la fiesta");
            System.out.println("4. Mostrar lista de invitados");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:

                    System.out.print("Ingrese el nombre del lugar: ");
                    registrarLugar.setNombreLugar(leer.next());
                    System.out.print("Ingrese la direccion del lugar: ");
                    registrarLugar.setDireccion(leer.next());
                    System.out.print("Ingrese el aforo del lugar: ");
                    registrarLugar.setAforo(leer.nextInt());

                    break;
                case 2:

                    System.out.print("Ingrese el costo del lugar: ");
                    registrarCosto.setCostoLugar(leer.nextDouble());
                    System.out.print("Ingrese el costo de las bebidas: ");
                    registrarCosto.setCostoBebidas(leer.nextDouble());
                    System.out.print("Ingrese el costo de los alimentos");
                    registrarCosto.setCostoAlimentos(leer.nextDouble());
                    System.out.print("Ingrese el costo de los equipos: ");
                    registrarCosto.setCostoEquipos(leer.nextDouble());
                    break;

                case 3:
                    if(registrarLugar.getAforo() >= 1){
                        registrarLugar.setAforo(registrarLugar.getAforo() - 1);
                        Invitado registrarInvitado = new Invitado();
                        System.out.print("Ingrese le nombre del invitado: ");
                        registrarInvitado.setNombre(leer.next());
                        System.out.print("Ingrese el apellido del invitado: ");
                        registrarInvitado.setApellido(leer.next());
                        System.out.print("Ingrese la edad del invitado: ");
                        registrarInvitado.setEdad(leer.nextInt());
                        System.out.print("Ingrese la identificacion del invitado: ");
                        registrarInvitado.setId(leer.next());
                        System.out.println("¿Aplica cover?: ");
                        registrarInvitado.setAplicarCover(leer.nextBoolean());
                        if(registrarInvitado.isAplicarCover()){
                            registrarInvitado.setValorCover(50000);
                        }else{
                            registrarInvitado.setValorCover(0);
                        }
                        
                        // Una vez agregados los atributos del invitado se 
                        invitados.add(registrarInvitado);
                        
                    }else{
                        System.out.println("No ha registrado el lugar");

                    }
                    break;
                    
                case 4:
                    System.out.println("Datos de los invitados: ");
                    System.out.println("*********************************");
                    for (Invitado invitado:invitados){
                        System.out.println("Nombre: " + invitado.getNombre());
                        System.out.println("Apellido: " + invitado.getApellido());
                        System.out.println("Identificacion: " + invitado.getId());
                        System.out.println("¿Aplico cover?: " + invitado.isAplicarCover());
                        System.out.println("Nombre: " + invitado.getNombre());

                        if(invitado.isAplicarCover()){
                            System.out.println("Valor del cover es: " + invitado.getValorCover());
                        }else{
                            System.out.println("No paga entrada");
                        }
                        System.out.println("*********************************");
                    }

                default:break;


            }// fin switch



        }while (opcion !=0);





    }
}