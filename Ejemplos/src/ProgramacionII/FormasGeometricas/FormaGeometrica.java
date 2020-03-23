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

/*Se pone abstract porque la clase hija es la que define como es el
area y el perimetro*/

 /*FormaGeometrica es la clase padre*/
//Al poner abstract no se puede hacer nunca un new de formaGeometrica
public abstract class FormaGeometrica {
//Se pone protected para que solo las clases hijas vean este atributo

    private Color colorLinea;
    private Color colorForma;

    abstract public double getArea();

    abstract public double getPerimetro();

    /*Todos las clases tienen que tener un constructor*/
    public FormaGeometrica(Color colorLinea, Color colorForma) {
        /*Hay que inicializar todos los atributos y se hace con this.colorLinea = colorLinea*/
 /*Para acceder al atributo que se llama igual que mi variable poner siempre
        this. (Mi atributo es private Color colorLinea*/
        this.colorLinea = colorLinea;
        this.colorForma = colorForma;

    }

    /*Obtener informacion del objeto concreto
    getNombreAtributo
    Con este metodo podemos ver de que color es la linea pero no se va a poder cambiar*/
    public Color getColorLinea() {
        return this.colorLinea;
    }

    public Color getColorForma() {
        return this.colorForma;
    }

    /*Me permite cambiar el atributo de mi clase. Set no devuelve nada*/
    public void setColorLinea(Color colorLinea) {
        /*Si se llama igual que mi atributo se pone this. si se llama diferente no hace falta poner this. pero se puede poner*/
        this.colorLinea = colorLinea;
    }

    public void setColorForma(Color colorForma) {
        this.colorForma = colorForma;
    }

    public void pintar() {
        System.out.println("El area es: " + this.getArea());
        System.out.println("El perimetro es: " + this.getPerimetro());
        System.out.println("El color de la linea " + this.colorLinea);
        System.out.println("El color de la forma es: " + this.colorForma);
        System.out.println("");

    }

}
