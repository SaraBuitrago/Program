/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema1.EjerciciosT1;

/*Escribe un programa que visualice por pantalla la tabla de multiplicar de los
10 primeros números naturales.*/
/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        for (int numero = 1; numero <= 10; numero++) {
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println("  " + resultado);

            }

        }
    }
}
