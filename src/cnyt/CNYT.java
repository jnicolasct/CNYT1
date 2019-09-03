/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        
package cnyt;

/**
 *
 * @author jcortes
 */
public class CNYT {
    Complejo complejo1 = new Complejo(5,7);
    Complejo complejo2 = new Complejo(2,8);

    public CNYT() {
    }
    
    /*
    * Retorna la suma de dos numero complejos
    * a primero numero complejo
    * b segundo numero complejo
    */
    public Complejo sumaComp(Complejo a, Complejo b){
        double parteE = a.getEntero()+ b.getEntero();
        double parteI = a.getImaginario() + b.getImaginario();
        Complejo resultado = new Complejo(parteE,parteI);
        return resultado;
    }
    
    /*
    * Retorna la resta de dos numero complejos
    * a primero numero complejo
    * b segundo numero complejo
    */    
    public Complejo restaComp(Complejo a, Complejo b){
        double parteE = a.getEntero()- b.getEntero();
        double parteI = a.getImaginario() - b.getImaginario();
        Complejo resultado = new Complejo(parteE,parteI);
        return resultado;
    }    
    
    /*
    * Retorna el producto de dos numero complejos
    * a primero numero complejo
    * b segundo numero complejo
    */    
    public Complejo multComp(Complejo a, Complejo b){
        double parteE = (a.getEntero()* b.getEntero())+(a.getImaginario()* b.getImaginario()*-1.0);
        double parteI = (a.getEntero()* b.getImaginario())+(a.getImaginario()* b.getEntero());
        Complejo resultado = new Complejo(parteE,parteI);
        return resultado;
    }
    
    /*
    * Retorna la division de dos numero complejos
    * a divendo numero complejo
    * b divisor numero complejo
    */    
    public Complejo divComp(Complejo a, Complejo b){
        Complejo nuevo = new Complejo (b.getEntero(),(b.getImaginario()*-1));
        Complejo divisor = multComp(b,nuevo);
        Complejo dividendo = multComp(a,nuevo);
        double parteE = dividendo.getEntero() / divisor.getEntero();
        double parteI = dividendo.getImaginario() + divisor.getImaginario();
        Complejo resultado = new Complejo(parteE,parteI);
        return resultado;
    }
    
    /*
    * Retorna el modulo de un numero complejo
    * a numero complejo
    */    
    public double modulo (Complejo a){
        return a.modulo();
    }
    
    /*
    * Retorna el conjugado de un numero complejo
    * a numero complejo
    */
    public Complejo conjugado(Complejo a){
        return new Complejo(a.getEntero(),(a.getImaginario()*-1));
    }
    
    /*
    * Retorna un numero complejo dada la conversion de polar a cartesiano de un numero complejo
    * a numero complejo en forma polar
    */
    public Complejo poCar(Complejo a){
        double entero = a.getEntero()* Math.cos(a.getImaginario());
        double imaginario = a.getEntero() * Math.sin(a.getImaginario());
        return new Complejo(entero,imaginario);
    }
    
    /*
    * Retorna un numero complejo dada la conversion de cartesiano a polar de un numero complejo
    * a numero complejo en forma cartesiana
    */
    public Complejo caPol(Complejo a){
        double longitud = modulo(a);
        double angulo = Math.atan2(a.getImaginario(),a.getEntero());
        return new Complejo (longitud, angulo);
    }
    
    /*
    * Retorna la fase de un numero complejo
    * a numero complejo 
    */
    public double fase(Complejo a){
        return a.fase();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CNYT prueba = new CNYT();
        Complejo suma = prueba.sumaComp(prueba.complejo1, prueba.complejo2);
        Complejo resta = prueba.restaComp(prueba.complejo1, prueba.complejo2);
        Complejo mult = prueba.multComp(prueba.complejo1, prueba.complejo2);
        Complejo div = prueba.divComp(prueba.complejo1, prueba.complejo2);
        double modulo = prueba.modulo(prueba.complejo1);
        Complejo conjugado = prueba.conjugado(prueba.complejo1);
        Complejo capol = prueba.caPol(prueba.complejo1);
        Complejo pocar = prueba.poCar(prueba.complejo1);
        double fase = prueba.fase(prueba.complejo1);
        
        System.out.println("a: " + prueba.complejo1.getEntero() + " + " + "(" + prueba.complejo1.getImaginario() + ")i" + " b: " + prueba.complejo2.getEntero() + "´+ " + "(" + prueba.complejo2.getImaginario() + ")i");
        System.out.println(suma.getEntero() + " + " + "(" + suma.getImaginario() + ")i");
        System.out.println(resta.getEntero() + " + " + "(" + resta.getImaginario() + ")i");
        System.out.println(mult.getEntero() + " + " + "(" + mult.getImaginario() + ")i");
        System.out.println(div.getEntero() + " + " + "(" + div.getImaginario() + ")i");
        System.out.println("El modulo de a es: " + modulo);
        System.out.println(conjugado.getEntero() + " + " + "(" + conjugado.getImaginario() + ")i");
        System.out.println(capol.getEntero() + " + " + "(" + capol.getImaginario() + ")i");
        System.out.println(pocar.getEntero() + " + " + "(" + pocar.getImaginario() + ")i");
        System.out.println("La fase de a es: " + fase);
        System.out.println("cos:" + Math.cos(2.0) + "sen: " + Math.sin(2.0) + " atan2: " + Math.atan2(2.0, 2.0));
    }
    
}
