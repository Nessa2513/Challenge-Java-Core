package org.example;
import java.util.Scanner;
import Subs.Sub;
import Subs.SubsBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner leersub = new Scanner(System.in);
        System.out.println("¡Bienvenido a Subway!");
        System.out.println("Elija el Subway que desea llevar digitando el numero correspondiente");
        System.out.println("1. Italianissimo; 2. Pollo teriyaki; 3. Carne BBQ; 4. Atun; 5. Vegetariano");
        Integer Subelegido = leersub.nextInt();
        if(Subelegido == 1) {
            System.out.println("El Subway elegido es Italianissimo");
        }
        if(Subelegido == 2) {
            System.out.println("El Subway elegido es Pollo teriyaki");
        }
        if(Subelegido == 3) {
            System.out.println("El Subway elegido es Carne BBQ");
        }
        if(Subelegido == 4) {
            System.out.println("El Subway elegido es Atun");
        }
        if(Subelegido == 5) {
            System.out.println("El Subway elegido es Atun");
        } else {
            System.out.println("Esa opcion no se encuentra disponible");
        }
    }

    //Builder
    SubsBuilder builder = new SubsBuilder(true, true, true, false,
            "Parmesano","Mozarella", "Tomate, lechuga, pimientos", "Ranch, BBQ, Cebolla dulce",
            "Toasted", "Guacamole");

    //Sub Italianissimo = builder.

}