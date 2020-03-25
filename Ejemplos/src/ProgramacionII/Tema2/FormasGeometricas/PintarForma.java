/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema2.FormasGeometricas;
//Nunca poner en una clase static

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class PintarForma {

    public static void main(String[] args) {

        //Creo un objeto para comprobar que funciona, si no podria pedir datos al usuario
        Circulo circulo = new Circulo(10, Color.AMARILLO, Color.AZUL);
        Cuadrado cuadr = new Cuadrado(20, Color.AZUL, Color.NEGRO);
        Triangulo trian = new Triangulo(5, 10, 15, 5, Color.ROJO, Color.AMARILLO);

        /*Para que se imprima por pantalla tengo que llamar al objeto
        y ponerle la funcion pintar*/
        cuadr.pintar();
        circulo.pintar();
        trian.pintar();
    }

}
