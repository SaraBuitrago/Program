/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.EjerciciosT1;

/*Escribe un programa que muestre por pantalla la lista de los 100 primeros
números primos.*/
/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int primo = 0;
        int contador = 0;
        int numero = 1;
        while (primo < 100) {

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contador++;

                }

            }
            if (contador == 2) {
                System.out.println("Primo: " + numero);
                primo++;
            }
            contador = 0;

            numero++;
        }

    }
}
