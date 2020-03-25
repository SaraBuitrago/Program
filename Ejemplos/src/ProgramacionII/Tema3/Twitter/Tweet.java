/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Twitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public abstract class Tweet {

    private String message;
    private UserAccount sender;
    private Date time;
    private List<UserAccount> fav;
    private List<UserAccount> likes;

    public Tweet(String message, UserAccount sender) throws MessageException {
        if (message == null || message.isEmpty() || message.length() >= 140) {
            throw new MessageException(MessageException.EXCESO_CARACTERES);
        } else {
            this.message = message;
            this.sender = sender;
            this.time = new Date();
            this.fav = new ArrayList();
            this.likes = new ArrayList();
        }

    }

    /*  public Tweet(String mesage) throws MessageException {
        //Reutilizo el método de arriba
        this(message, null);
    }
     */
    public void addLike(UserAccount user) {

    }

    @Override

    public String toString() {
        return "Mensaje: " + this.message + "Usuario: " + this.sender + "Tiempo: " + this.time;
    }

}
