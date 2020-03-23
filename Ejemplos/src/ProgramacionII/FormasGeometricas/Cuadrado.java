/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.FormasGeometricas;
//Los nombres de una clase siempre mayusculas
//Nombres variables siempre en minuscula
//Los metodos en minuscula
//CONSTANTE TODO EN MAYUSCULAS

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Cuadrado extends FormaGeometrica {

    private double lado;

    public Cuadrado(double lado, Color colorLinea, Color colorForma) {
        super(colorLinea, colorForma);
        this.lado = lado;
    }

    public Cuadrado(double lado) {

        this(lado, Color.AMARILLO, Color.BLANCO);
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    @Override
    public void pintar() {
        super.pintar();
    }

}
