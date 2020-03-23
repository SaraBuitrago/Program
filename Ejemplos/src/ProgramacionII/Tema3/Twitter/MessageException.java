/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Twitter;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class MessageException extends Exception {

    public static final String EXCESO_CARACTERES = "Excede numero de caracteres";
    public String mensaje;

    public MessageException(String mensaje) {
        super();
        this.mensaje = mensaje;
    }

    @Override

    public String toString() {
        return "MessageException ERROR: " + mensaje;
    }
}
