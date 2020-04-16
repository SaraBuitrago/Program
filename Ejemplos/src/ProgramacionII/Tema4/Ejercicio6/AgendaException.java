/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema4.Ejercicio6;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class AgendaException extends Exception {

    public static final String NOMBRE_REPETIDO = "El nombre que quiere introducir ya existe";

    public AgendaException(String mensaje) {
        super(mensaje);
    }
}
