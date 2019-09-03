package cnyt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcortes
 */
public class Complejo {
    
    double entero;
    double imaginario;

    public Complejo(double entero, double imaginario) {
        this.entero = entero;
        this.imaginario = imaginario;
    }

    public Complejo(double entero) {
        this.entero = entero;
        this.imaginario = 0.0;
    }
    
    public double getEntero() {
        return entero;
    }

    public void setEntero(double entero) {
        this.entero = entero;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
    /*
    * Retorna el modulo del numero complejo 
    */
    public double modulo(){
        return Math.sqrt((entero * entero) + (imaginario * imaginario));
    }
    
    /*
    * Retorna la fase del numero complejo 
    */
    public double fase(){
        return Math.atan2(imaginario, entero);
    }
    
    
}
