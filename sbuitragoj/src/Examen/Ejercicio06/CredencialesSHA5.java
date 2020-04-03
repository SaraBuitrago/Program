/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.Ejercicio06;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class CredencialesSHA5 extends Credenciales {

    private String sha5;

    public CredencialesSHA5(int longitud, Calidad calidad, String contraseña, String sha5) {
        super(longitud, calidad, contraseña);
        this.sha5 = sha5;
    }

    public void setPassword(String sha5) {
        super.setPassword(sha5);

    }

    @Override

    public String toString() {
        return super.toString() + "Sha5: " + this.sha5;
    }
}
