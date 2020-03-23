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
public class Retweet extends Tweet {

    private Tweet reenviado;

    public Retweet(String message, UserAcount sender, Tweet reenviado) throws MessageException {
        super(message, sender);
        this.reenviado = reenviado;

    }

    @Override

    public String toString() {
        return super.toString() + "Reenviado: " + this.reenviado;
    }
}