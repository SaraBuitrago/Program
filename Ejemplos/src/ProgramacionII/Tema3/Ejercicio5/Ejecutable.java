/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Ejercicio5;

import ProgramacionII.utilidades.utils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Ejecutable {

    public static void main(String[] args) {
        int numeroPassword = utils.leerEntero("Introduzca numero de contraseñas que quiere generar");
        Password[] passwords = new Password[numeroPassword];

        for (int i = 0; i < numeroPassword; i++) {
            int longitud = utils.leerEntero("Introduzca longitud contraseña");

            passwords[i] = new Password(longitud);

        }
        List<Boolean> booleanos = new ArrayList();

        for (Password password : passwords) {
            System.out.println("¿Contraseña fuerte? " + password.esFuerte());

        }

    }
}
