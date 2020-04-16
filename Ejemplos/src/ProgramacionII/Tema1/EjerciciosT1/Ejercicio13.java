/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema1.EjerciciosT1;

import ProgramacionII.utilidades.utils;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
/*Escribe un programa que acepte una cadena de caracteres (que podrá contener
cualquier carácter a excepción del retorno de carro) y que la escriba al revés.*/
public class Ejercicio13 {

    public static void main(String[] args) {

        String palabra = utils.leerString("Introduzca cadena: ");
        String resultado = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {

            resultado = resultado + palabra.charAt(i);
            System.out.println("" + resultado);

        }

    }
}
