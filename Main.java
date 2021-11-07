package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String args[]) {

        Scanner leer = new Scanner( System.in );
        Random alAzar = new Random();

        int seleccion = 0;
        int mazoActual = 52;
        int accionActual = leer.nextInt();

        do {

           showMenu();

            switch (accionActual)
            {

                case 1:

                    mazoActual = 52;
                    System.out.println("El mazo se a mezclado.");
                    break;

                case 2:
                    int cartaColor = alAzar.nextInt(1)+1;

                    switch (cartaColor){

                        case 1:
                            System.out.println("Su carta es color roja.");

                            break;

                        case 2:
                            System.out.println("Su carta es color negra.");
                            break;
                    }

                    int cartaLogo = alAzar.nextInt(3)+1;

                    switch (cartaLogo){

                        case 1:
                            System.out.println("Su carta es trebol.");
                            break;

                        case 2:
                            System.out.println("Su carta es pico.");
                            break;

                        case 3:
                            System.out.println("Su carta es diamante.");
                            break;

                        case 4:
                            System.out.println("Su carta es corazon.");
                            break;
                    }

                        if(mazoActual >= 0) {

                            int numeroActual = alAzar.nextInt(52) + 1;
                            System.out.println("El numero de la carta: " + numeroActual);
                            System.out.println("================================================");

                            mazoActual--;
                            System.out.print("En el deck quedan: " + mazoActual);
                            System.out.println(" cartas. ");
                            break;
                        }

                            else {

                                throw new ArithmeticException("Ya no hay cartas");

                          }

            }


        }
        while (mazoActual > 0);

    }

    private static void showMenu() {

        Scanner leer = new Scanner( System.in );

        System.out.println("================================================");
        System.out.println("Bienvenido a poker!");
        System.out.println("Selecciona una opcion:");
        System.out.println("1.Mezclar el deck.");
        System.out.println("2.Sacar tarjeta");
        System.out.println("================================================");

          int accionActual = leer.nextInt();

        if (accionActual > 0 && accionActual < 3) {

        }
            else{

            throw new ArithmeticException("Su opcion no es valida.");

        }

        }

    }

