package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int suma, resta, div, mult, mod;

        System.out.print("Escriba el primer numero: ");
             int num = leer.nextInt();

        System.out.print("Escriba el segundo numero: ");
            int num2 = leer.nextInt();

        suma = num + num2;
        resta = num - num2;
        div = num / num2;
        mult = num * num2;
        mod = num %  num2;

        System.out.println("X = " +num);
        System.out.println("Y = " +num2);
        System.out.println("Suma = " +suma);
        System.out.println("Resta = " +resta);
        System.out.println("Division = " +div);
        System.out.println("Multiplicacion = " +mult);
        System.out.println("Modulo = " +mod);

    }
}


