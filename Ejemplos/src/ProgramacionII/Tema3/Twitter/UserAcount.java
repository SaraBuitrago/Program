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
public class UserAcount {

    private String alias;
    private Email email;
    private List<Tweet> tweets;
    private List<UserAcount> followers;
    private List<Tweet> timeline;

    //Recibe todos los valores necesarios para darle valor a los atributos
    public UserAcount(String alias, Email email) {
        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<Tweet>();
        this.followers = new ArrayList<UserAcount>();
        this.timeline = new ArrayList<Tweet>();
    }

    public void follow(UserAcount user2) {
        user2.addFollower(this);
    }

    public void addFollower(UserAcount usuario) {
        this.followers.add(usuario);
    }

    public void tweet(Tweet tweet1) {
        this.tweets.add(tweet1);
        for (UserAcount follower : followers) {
            follower.addTimeLine(tweet1);
        }
    }

    private void addTimeLine(Tweet tweet1) {
        this.timeline.add(tweet1);
    }

    @Override

    public String toString() {
        return "Alias: " + this.alias + "Email: " + this.email + "Tweet: " + this.tweets + "Followers: " + this.followers + "TimeLine: " + this.timeline;

    }

}
