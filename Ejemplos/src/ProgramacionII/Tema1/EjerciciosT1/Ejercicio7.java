/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*Escribe un programa que lea un número entero de teclado y lo descomponga
en factores primos; por ejemplo 40 = 2 * 2 * 2 * 5.*/
package ProgramacionII.Tema1.EjerciciosT1;

import ProgramacionII.utilidades.utils;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int numero = utils.leerEntero("Numero:");

        int resultado = numero;
        int i = 2;

        while (resultado != 1) {

            while (resultado % i == 0) {
                System.out.print(" " + i);
                resultado = resultado / i;

            }
            i++;
        }
        System.out.println("\n");
    }
}
