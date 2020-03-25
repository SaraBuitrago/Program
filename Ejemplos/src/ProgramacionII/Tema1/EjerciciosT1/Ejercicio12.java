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
public class Ejercicio12 {

    public static void main(String[] args) {

        String frase = utils.leerString();
        int vocal = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                vocal++;
            }
        }

        System.out.println("El numero de vocales es: " + vocal);

    }

}
