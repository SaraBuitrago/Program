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

    private Tweet retweet;

    public Retweet(String message, UserAccount sender, Tweet retweet) throws MessageException {
        //Constructor del padre
        super(message, sender);
        this.retweet = retweet;

    }

    public Retweet(String message, Tweet retweet) throws MessageException {
        //Reutilizo el constructor Retweet(String message, UserAccount sender, Tweet retweet)
        this(message, null, retweet);

    }

    @Override

    public String toString() {
        return super.toString() + "Reenviado: " + this.retweet;
    }
}
