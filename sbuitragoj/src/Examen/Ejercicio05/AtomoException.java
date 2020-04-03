/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.Ejercicio05;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class AtomoException extends Exception {

    public static final String VALOR_INFERIOR = "El valor de los elemento no puede ser neutrones < 0, protones < 1 y electrones <1";
    public static final String VALOR_ELECTRON = "El valor del electron no puede ser menor a 1";
    public static final String VALOR_PROTON = "El valor del proton no puede ser menor a 1";
    public static final String VALOR_NEUTRON = "El valor de lol nuetron no puede ser menor a 0";

    public AtomoException(String mensaje) {
        super(mensaje);
    }

}
