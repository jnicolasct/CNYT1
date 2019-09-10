/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        
package cnyt;

import java.util.ArrayList;

/**
 *
 * @author jcortes
 */
public class CNYT {
    Complejo complejo1 = new Complejo(5,7);
    Complejo complejo2 = new Complejo(2,8);
    ArrayList<Complejo> vector1 = new ArrayList<Complejo>();
    ArrayList<Complejo> vector2 = new ArrayList<Complejo>();
    ArrayList<ArrayList<Complejo>> matriz1 = new ArrayList<ArrayList<Complejo>>();
    ArrayList<ArrayList<Complejo>> matriz2 = new ArrayList<ArrayList<Complejo>>();
    public CNYT() {
        Complejo a = new Complejo(1,5);
        Complejo b = new Complejo(7,9);
        Complejo c = new Complejo(8,9);
        Complejo d = new Complejo(0,2);
        Complejo e = new Complejo(4,3);
        Complejo f = new Complejo(5,8);
        Complejo g = new Complejo(0,9);
        Complejo h = new Complejo(2,4);
        Complejo l = new Complejo(3,8);
        Complejo m = new Complejo(1,0);
        Complejo n = new Complejo(9,2);
        Complejo o = new Complejo(8,5);
        Complejo p = new Complejo(3,2);
        Complejo q = new Complejo(6,5);
        Complejo r = new Complejo(9,7);
        Complejo s = new Complejo(8,5);
        ArrayList<Complejo> t = new ArrayList<Complejo>();
        ArrayList<Complejo> u = new ArrayList<Complejo>();
        ArrayList<Complejo> v = new ArrayList<Complejo>();
        ArrayList<Complejo> w = new ArrayList<Complejo>();
    
        vector1.add(complejo1);
        vector1.add(a);
        vector1.add(b);
        vector2.add(complejo2);
        vector2.add(c);
        vector2.add(d);
        t.add(e);
        t.add(f);
        t.add(g);
        u.add(h);
        u.add(l);
        u.add(m);
        v.add(n);
        v.add(o);
        v.add(p);
        w.add(q);
        w.add(r);
        w.add(s);
        matriz1.add(vector1);
        matriz1.add(t);
        matriz1.add(u);
        matriz2.add(vector2);
        matriz2.add(v);
        matriz2.add(w);
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
    
    public ArrayList<Complejo> sumaVec(ArrayList<Complejo> vec1, ArrayList<Complejo>vec2){
        ArrayList<Complejo> respuesta = new ArrayList<Complejo>();
        for (int i=0;i<vec1.size();i++){
            respuesta.add(sumaComp(vec1.get(i), vec2.get(i)));
        }
        return respuesta;
    }
    
    public ArrayList<Complejo> inversaVec(ArrayList<Complejo> vec1){
        ArrayList<Complejo> respuesta = new ArrayList<Complejo>();
        for (int i=0;i<vec1.size();i++){
            Complejo z = new Complejo(vec1.get(i).getEntero()*-1, vec1.get(i).getImaginario()*-1);
            respuesta.add(z);
        }
        return respuesta;
    }
    
    public ArrayList<Complejo> multEscaVec(ArrayList<Complejo> vec1, Complejo a){
        ArrayList<Complejo> respuesta = new ArrayList<Complejo>();
        for (int i=0;i<vec1.size();i++){
            Complejo z = multComp(a, vec1.get(i));
            respuesta.add(z);
        }
        return respuesta;
    }
    
    public ArrayList<ArrayList<Complejo>> sumaMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        for (int i=0;i<mat1.size();i++){
            for (int j=0;j<mat1.get(1).size();j++){
            Complejo z = sumaComp(mat1.get(i).get(j), mat2.get(i).get(j));
            respuesta.get(i).add(j,z);
            }
        }
        return respuesta;
    }
    
    public ArrayList<ArrayList<Complejo>> inversaMat(ArrayList<ArrayList<Complejo>> mat1){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        for (int i=0;i<mat1.size();i++){
            for (int j=0;j<mat1.get(1).size();j++){
            Complejo z = new Complejo (mat1.get(i).get(j).getEntero()*-1, mat1.get(i).get(j).getImaginario()*-1);
            respuesta.get(i).add(j,z);
            }
        }
        return respuesta;
    }

    public ArrayList<ArrayList<Complejo>> multEscaMat(ArrayList<ArrayList<Complejo>> mat1, Complejo a){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        for (int i=0;i<mat1.size();i++){
            for (int j=0;j<mat1.get(1).size();j++){
            Complejo z = multComp(mat1.get(i).get(j),a);
            respuesta.get(i).add(j,z);
            }
        }
        return respuesta;
    }
    
    
    public ArrayList<ArrayList<Complejo>> transpuestaMat(ArrayList<ArrayList<Complejo>> mat1){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        for (int i=0;i<mat1.size();i++){
            for (int j=0;j<mat1.get(1).size();j++){
                respuesta.get(i).add(j,mat1.get(j).get(i));
            }
        }
        return respuesta;
    }
    
    public ArrayList<ArrayList<Complejo>> conjugadoMat(ArrayList<ArrayList<Complejo>> mat1){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        for (int i=0;i<mat1.size();i++){
            for (int j=0;j<mat1.get(1).size();j++){
            Complejo z = conjugado(mat1.get(i).get(j));
            respuesta.get(i).add(j,z);
            }
        }
        return respuesta;
    }
    
    public ArrayList<ArrayList<Complejo>> adjuntaMat(ArrayList<ArrayList<Complejo>> mat1){
        ArrayList<ArrayList<Complejo>> res = transpuestaMat(mat1);
        ArrayList<ArrayList<Complejo>> respuesta = conjugadoMat(res);
        return respuesta;
    }
    
    public ArrayList<Complejo> accionMatVec(ArrayList<ArrayList<Complejo>> mat1, ArrayList<Complejo> vec1 ){
        ArrayList<Complejo> respuesta = new ArrayList<Complejo>();
        Complejo suma = new Complejo(0,0);
        for (int i=0;i<mat1.size();i++){
            for (int j=0;j<mat1.get(1).size();j++){
            suma = sumaComp(suma, multComp(mat1.get(i).get(j), vec1.get(j)));
            }
            respuesta.add(suma);
        }
        return respuesta;
    }
    
    public double normaMat(ArrayList<ArrayList<Complejo>> mat1){
        double respuesta = 0;
        /*
        Complejo suma = new Complejo(0,0);
        for (int i=0;i<mat1.size();i++){
            for (int j=0;j<mat1.get(1).size();j++){
            suma = sumaComp(suma, multComp(mat1.get(i).get(j), vec1.get(j)));
            }
            respuesta.add(suma);
        }*/
        return respuesta;
    }
    
    public double distMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2){
        double respuesta = 0;
        /*
        Complejo suma = new Complejo(0,0);
        for (int i=0;i<mat1.size();i++){
            for (int j=0;j<mat1.get(1).size();j++){
            suma = sumaComp(suma, multComp(mat1.get(i).get(j), vec1.get(j)));
            }
            respuesta.add(suma);
        }*/
        return respuesta;
    }
    
    public ArrayList<ArrayList<Complejo>> multMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        Complejo suma;
        for (int i=0;i<mat1.size();i++){
            for (int j=0;j<mat1.get(1).size();j++){
                suma = new Complejo(0,0);
                for (int k=0;k<mat1.get(1).size();k++){
                suma= sumaComp(suma, multComp(mat1.get(i).get(k), mat2.get(k).get(j)));
                }
                respuesta.get(i).add(j, suma);
            }
        }
        return respuesta;
    }
    
    public boolean igualesMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2){
        for (int i=0;i<mat1.size();i++){
            for (int j=0;j<mat1.get(1).size();j++){
                if (mat1.get(i).get(j).getEntero()!= mat2.get(i).get(j).getEntero() || mat1.get(i).get(j).getImaginario()!= mat2.get(i).get(j).getImaginario() ){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean unitariaMat(ArrayList<ArrayList<Complejo>> mat1){
        ArrayList<ArrayList<Complejo>> adjunta = adjuntaMat(mat1);
        ArrayList<ArrayList<Complejo>> res1 = multMat(mat1, adjunta);
        ArrayList<ArrayList<Complejo>> res2 = multMat(adjunta,mat1);
        return igualesMat(res1,res2);
    }
    

    public boolean hermitianMat(ArrayList<ArrayList<Complejo>> mat1){
        ArrayList<ArrayList<Complejo>> adjunta = adjuntaMat(mat1);
        return igualesMat(mat1,adjunta);
    }    
    
    
    public ArrayList<ArrayList<Complejo>> productoTensorMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        for (int i=0;i<mat1.size();i++){
            for (int j=0;j<mat1.get(1).size();j++){
                for (int k=0;k<mat2.size();k++){
                    for (int z=0; z<mat2.get(1).size(); z++){
                        respuesta.get((i*mat2.size())+k).add(((j*mat2.get(1).size())+z), multComp(mat1.get(i).get(j), mat2.get(k).get(z)));
                    }
                }
            }
        }
        return respuesta;
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
        System.out.println("Suma: " + suma.getEntero() + " + " + "(" + suma.getImaginario() + ")i");
        System.out.println("Resta: " + resta.getEntero() + " + " + "(" + resta.getImaginario() + ")i");
        System.out.println("Producto: " + mult.getEntero() + " + " + "(" + mult.getImaginario() + ")i");
        System.out.println("Division: " + div.getEntero() + " + " + "(" + div.getImaginario() + ")i");
        System.out.println("El modulo de a es: " + modulo);
        System.out.println("Conjugado de a: " + conjugado.getEntero() + " + " + "(" + conjugado.getImaginario() + ")i");
        System.out.println("Conversion de cartesiano a polar de a: " + capol.getEntero() + " + " + "(" + capol.getImaginario() + ")i");
        System.out.println("Conversion de polar a cartesiano de a: " + pocar.getEntero() + " + " + "(" + pocar.getImaginario() + ")i");
        System.out.println("La fase de a es: " + fase);
    }
    
}
