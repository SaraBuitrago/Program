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

    private UserAccount receiver;

    public DirectMessage(String message, UserAccount sender, UserAccount receiver) throws MessageException {
        //Utilizo el constructor del padre
        super(message, sender);
        //Añado el atributo que no está en el padre
        this.receiver = receiver;
    }

    public DirectMessage(String message, UserAccount receiver) throws MessageException {
        //Del constructor DirectMessage(String message, UserAccount sender, UserAccount receiver)
        //Pongo null sender.
        //Reutilizo el constructor con this();
        this(message, null, receiver);

    }

    @Override
    public String toString() {
        return super.toString() + "Receptor: " + this.receiver;
    }
}
