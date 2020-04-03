/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Ejercicio5;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class PasswordException extends Exception {

    public static final String LONGITUD_INCORRECTA = "La longitud debe ser mayor a 8";

    public PasswordException(String mensaje) {
        super(mensaje);
    }
}
