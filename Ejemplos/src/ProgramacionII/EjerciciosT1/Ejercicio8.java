/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.EjerciciosT1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Empleando un array, escribir un programa que pida al usuario números enteros
hasta que se introduzca el número 0. A continuación, calcular la media, el
mínimo y el máximo de los datos introducidos.*/
/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Ejercicio8 {

    public static void main(String[] args) throws IOException {
        //Leer numero por teclado

        System.out.println("Introduzca numero entero: ");

        boolean error = true;

        while (error) {
            BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
            String stringLeido = consola.readLine();
            int entero = Integer.parseInt(stringLeido);

            try {

                error = false;

            } catch (Exception e) {
                System.out.println("Se ha producido un error.Introduzca numero entero: " + e);

            }
            System.out.println("Introduzca numero entero: ");
            entero = Integer.parseInt(stringLeido);
            consola = new BufferedReader(new InputStreamReader(System.in));
            stringLeido = consola.readLine();

        }
    }
}
