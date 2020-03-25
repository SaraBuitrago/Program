/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Ejercicio4.DNI;

import java.util.Random;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class NewClass {

    public static void main(String[] args) {
        // String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(99999999);
        System.out.println("El numero aleatorio es: " + numero);

        System.out.println(numero + "La letra es: " + calcularLetra(numero));

    }
}
