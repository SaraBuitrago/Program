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
public class Triangulo extends FormaGeometrica {

    private double base;
    private double altura;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado2, double lado3, Color colorLinea, Color colorForma) {
        super(colorLinea, colorForma);
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

//Crea un triangulo con la base, altura, lado2 y lado 3 indicado y los colores por defecto
    public Triangulo(double base, double altura, double lado2, double lado3) {
        this(base, altura, lado2, lado3, Color.AMARILLO, Color.NEGRO);
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return base + lado2 + lado3;
    }

    @Override
    public void pintar() {
        super.pintar();
    }

}
