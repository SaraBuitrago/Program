/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Twitter;

import java.util.Date;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public abstract class Tweet {

    private String message;
    private UserAcount sender;
    private Date time;

    public Tweet(String message, UserAcount sender) throws MessageException {
        if (message.length() > 140) {
            throw new MessageException(MessageException.EXCESO_CARACTERES);
        } else {
            this.message = message;
            this.sender = sender;
            this.time = new Date();
        }

    }

    @Override

    public String toString() {
        return "Mensaje: " + this.message + "Usuario: " + this.sender + "Tiempo: " + this.time;
    }

}
