/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*Escribe un programa que lee una cadena de caracteres de teclado e indique si
es o no palíndroma (se lee igual de izquierda a derecha que de derecha a
izquierda, sin tener en cuenta los espacios en blanco y las mayúsculas). Por
ejemplo: "dábale arroz a la zorra el abad".*/
package ProgramacionII.Tema1.EjerciciosT1;

import ProgramacionII.utilidades.utils;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        String palabra = utils.leerString();
        String resultado = "";

        //Para reemplazar los espacios por no espacio
        palabra = palabra.replace(" ", "");
        //Para reemplazar a minusculas toda la cadena
        palabra = palabra.toLowerCase();
        //Para reemplazar las vocales acentuadas
        palabra = palabra.replace('á', 'a');
        palabra = palabra.replace('é', 'e');
        palabra = palabra.replace('í', 'i');
        palabra = palabra.replace('ó', 'o');
        palabra = palabra.replace('ú', 'u');

        System.out.println("" + palabra);
        for (int i = palabra.length() - 1; i >= 0; i--) {

            resultado = resultado + palabra.charAt(i);

        }
        resultado = resultado.replace(" ", "");
        resultado = resultado.toLowerCase();
        resultado = resultado.replace('á', 'a');
        resultado = resultado.replace('é', 'e');
        resultado = resultado.replace('í', 'i');
        resultado = resultado.replace('ó', 'o');
        resultado = resultado.replace('ú', 'u');

        System.out.println("" + resultado);

        if (palabra.equals(resultado)) {
            System.out.println("La palabra es palindroma\n");
        } else {
            System.out.println("La palabra no es palindroma\n");
        }
    }
}
