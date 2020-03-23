/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*Escribe un programa que calcule el mínimo y el máximo de una lista de
números enteros positivos introducidos por el usuario. La lista finalizará
cuando se introduzca un número negativo.*/
package ProgramacionII.EjerciciosT1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Ejercicio4 {

    public static void main(String[] args) throws IOException {

        int numero;

        System.out.println("Introduzca numero entero: ");
        int maximo = 0;
        int minimo = 0;

        boolean error = true;

        while (error) {
            BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
            String stringLeido = consola.readLine();
            int entero = Integer.parseInt(stringLeido);
            maximo = entero;
            minimo = entero;

            while (entero > 0) {
                try {

                    error = false;

                    if (entero > maximo) {
                        maximo = entero;
                    }
                    if (entero < minimo) {
                        minimo = entero;

                    }
                } catch (Exception e) {
                    System.out.println("Se ha producido un error.Introduzca numero entero: " + e);

                }
                System.out.println("Introduzca numero entero: ");
                entero = Integer.parseInt(stringLeido);
                consola = new BufferedReader(new InputStreamReader(System.in));
                stringLeido = consola.readLine();
            }

        }
        System.out.println("El maximo es: " + maximo);
        System.out.println("El minimo es: " + minimo);
    }
}
