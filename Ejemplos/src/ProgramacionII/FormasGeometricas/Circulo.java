/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.FormasGeometricas;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
//Con extends : Heredas constructores y atributos que no sean privados
public class Circulo extends FormaGeometrica {

    private double radio;


    /*Constructor, se llama igual que la clase, es un metodo que recibe los parametros necesarios para crear un objeto concreto*/
 /*El nombre del constructor tiene que ser igual que el de la clase por eso tiene que coincidir las mayusculas y minusculas*/
    public Circulo(double radio, Color colorLinea, Color colorForma) {

        //Constructor del padre (FormasGeometricas) y entre parentesis pongo los parametros que tenga un determinado constructor
        super(colorLinea, colorForma);
        this.radio = radio;

    }

    /*Los constructores pueden ser llamados desde otro constructores*/
    //Crea un circulo con el radio indicado y los colores por defecto
    public Circulo(double radio) {
        //Coger las asignaciones del constructor circulo y lo pongo aquí
        //Sirve para reutilizar constructores
        this(radio, Color.NEGRO, Color.BLANCO);

    }
//Lo que empieza por @ son anotaciones. 00

    @Override
    public double getArea() {
        return Math.PI * radio * radio;

    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void pintar() {
        super.pintar();
    }

}
