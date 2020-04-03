/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.Ejercicio04;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Ejercicio04 {
    /*
    a) Se crea un objeto tweet e imprime lo que hay en la clase tweet
    porque en la clase tweet hay un método llamado print()
    Imprimirá: This is a tweet

    b) Sobreescribe el objeto tweet y crea un nuevo objeto de Retweet.
    Retweet es una clase hija de tweet hereda de la clase tweet por el "extends" (jerarquía de herencia)
    NO imprime lo que hay en tweet porque no hay super.print()
    Imprimirá: This is a retweet

    c) Sobreescribe el objeto tweet y crea un nuevo objeto de DirectMessage
    Hereda de tweet
    NO imprime "This is a direct message" porque habría que pasarle como argumento un String al crear el objeto
    Imprimirá: This is a tweet


    d) Sobreescribe el objeto tweet y crea un nuevo objeto de FavouriteRetweet
    Sí compila.
    Es una clase hija de Retweet. Al tener super.print() imprime también lo que hay en retweet y lo añade al mensaje de
    FavouriteRetweet
    Imprimirá: This is a retweet
               This is a favourite retweet.
    Imprime en dos líneas por el println.




     */
}
