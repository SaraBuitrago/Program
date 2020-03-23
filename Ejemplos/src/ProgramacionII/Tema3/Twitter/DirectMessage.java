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
public class DirectMessage extends Tweet {

    private UserAcount receiver;

    public DirectMessage(String message, UserAcount sender, UserAcount receiver) throws MessageException {
        super(message, sender);
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return super.toString() + "Receptor: " + this.receiver;
    }
}
