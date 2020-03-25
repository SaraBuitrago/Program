/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Twitter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class UserAccount {

    private String alias;
    //una vez que inicialice no se puede modificar
    //No tienen setters estos atributos
    private final Email email;
    //El objeto especifico lista aunque los objetos pueden cambiar
    //No puede apuntar a otra lista pero se pueden añadir y eliminar cosas
    private final List<Tweet> tweets;
    private final List<UserAccount> followers;
    private final List<Tweet> timeline;

    //Recibe todos los valores necesarios para darle valor a los atributos
    public UserAccount(String alias, Email email) {
        this.alias = alias;
        this.email = email;
        //Cuando se pone new ArrayList crea una lista vacía
        this.tweets = new ArrayList();
        this.followers = new ArrayList();
        this.timeline = new ArrayList();
    }

    public void follow(UserAccount user2) {
        //El objeto sobre el que se ha invocado follow
        user2.addFollower(this);
    }

    public void addFollower(UserAccount usuario) {
        this.followers.add(usuario);
    }

    public void tweet(Tweet tweet1) {
        //tweet1.setSender(this);
        this.tweets.add(tweet1);
        //Recorro todos los followers y les añado ese tweet1 en su timeLine

        for (UserAccount follower : followers) {
            follower.addTimeLine(tweet1);
        }
    }

    private void addTimeLine(Tweet tweet1) {
        this.timeline.add(tweet1);
    }

    @Override

    public String toString() {//Corregir
        return "Alias: " + this.alias + "Email: " + this.email
                + "Tweet: "
                + this.tweets + "Followers: " + this.followers + "TimeLine: " + this.timeline;

    }
    /*  for(Tweet t : this.timeline){
    output += " Tweet" +t +"\n";
    }
    Son equivalentes
   for(int i = 0; i<this.timeline.size();i++){
    Tweet t = this.timeline.get(i);
     output += " Tweet" +t +"\n";

     */
}
