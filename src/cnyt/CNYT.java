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

    public ArrayList<Complejo> getVector1() {
        return vector1;
    }

    public void setVector1(ArrayList<Complejo> vector1) {
        this.vector1 = vector1;
    }

    public ArrayList<Complejo> getVector2() {
        return vector2;
    }

    public void setVector2(ArrayList<Complejo> vector2) {
        this.vector2 = vector2;
    }

    public ArrayList<ArrayList<Complejo>> getMatriz1() {
        return matriz1;
    }

    public void setMatriz1(ArrayList<ArrayList<Complejo>> matriz1) {
        this.matriz1 = matriz1;
    }

    public ArrayList<ArrayList<Complejo>> getMatriz2() {
        return matriz2;
    }

    public void setMatriz2(ArrayList<ArrayList<Complejo>> matriz2) {
        this.matriz2 = matriz2;
    }

    public Complejo getComplejo1() {
        return complejo1;
    }

    public void setComplejo1(Complejo complejo1) {
        this.complejo1 = complejo1;
    }

    public Complejo getComplejo2() {
        return complejo2;
    }

    public void setComplejo2(Complejo complejo2) {
        this.complejo2 = complejo2;
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
    
    /*
    * Retorna el vector dado una suma de dos vectores
    * vec1 primer vector complejo
    * vec2 segundo vector complejo
    */
    public ArrayList<Complejo> sumaVec(ArrayList<Complejo> vec1, ArrayList<Complejo>vec2){
        ArrayList<Complejo> respuesta = new ArrayList<Complejo>();
        for (int i=0;i<vec1.size();i++){
            respuesta.add(sumaComp(vec1.get(i), vec2.get(i)));
        }
        return respuesta;
    }
    
    /*
    * Retorna la inversa de un vector 
    * vec1 vector  a invertir
    */
    public ArrayList<Complejo> inversaVec(ArrayList<Complejo> vec1){
        ArrayList<Complejo> respuesta = new ArrayList<Complejo>();
        for (int i=0;i<vec1.size();i++){
            Complejo z = new Complejo(vec1.get(i).getEntero()*-1, vec1.get(i).getImaginario()*-1);
            respuesta.add(z);
        }
        return respuesta;
    }
    
    /*
    * Retorna el vector de un producto entre un vector y un escalar
    * vec1 vector complejo
    * a escalar complejo
    */
    public ArrayList<Complejo> multEscaVec(ArrayList<Complejo> vec1, Complejo a){
        ArrayList<Complejo> respuesta = new ArrayList<Complejo>();
        for (int i=0;i<vec1.size();i++){
            Complejo z = multComp(a, vec1.get(i));
            respuesta.add(z);
        }
        return respuesta;
    }
    
    /*
    * Retorna la suma de dos matrices 
    * mat1 primer matriz compleja
    * mat2 segunda matriz compleja
    */
    public ArrayList<ArrayList<Complejo>> sumaMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        ArrayList<Complejo> tmp = new ArrayList<Complejo>();
        for (int i=0;i<mat1.size();i++){
            tmp = new ArrayList<Complejo>();
            for (int j=0;j<mat1.get(1).size();j++){
            Complejo z = sumaComp(mat1.get(i).get(j), mat2.get(i).get(j));
            tmp.add(z);
            }
        respuesta.add(tmp);
        }
        return respuesta;
    }
    
    /*
    * Retorna la inversa de una matriz
    * mat1 matriz compleja a invertir
    */
    public ArrayList<ArrayList<Complejo>> inversaMat(ArrayList<ArrayList<Complejo>> mat1){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        ArrayList<Complejo> tmp = new ArrayList<Complejo>();
        for (int i=0;i<mat1.size();i++){
            tmp = new ArrayList<Complejo>();
            for (int j=0;j<mat1.get(1).size();j++){
            Complejo z = new Complejo (mat1.get(i).get(j).getEntero()*-1, mat1.get(i).get(j).getImaginario()*-1);
            tmp.add(z);
            }
        respuesta.add(tmp);
        }
        return respuesta;
    }
    
    
    /*
    * Retorna la multiplicacion de una matriz y un escalar 
    * mat1 matriz compleja
    * a escalar complejo
    */
    public ArrayList<ArrayList<Complejo>> multEscaMat(ArrayList<ArrayList<Complejo>> mat1, Complejo a){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        ArrayList<Complejo> tmp = new ArrayList<Complejo>();
        for (int i=0;i<mat1.size();i++){
            tmp = new ArrayList<Complejo>();
            for (int j=0;j<mat1.get(1).size();j++){
            Complejo z = multComp(mat1.get(i).get(j),a);
            tmp.add(z);
            }
        respuesta.add(tmp);
        }
        return respuesta;
    }
    
    /*
    * Retorna la transpuesta de una matriz
    * mat1 matriz compleja a transponer
    */
    public ArrayList<ArrayList<Complejo>> transpuestaMat(ArrayList<ArrayList<Complejo>> mat1){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        ArrayList<Complejo> tmp = new ArrayList<Complejo>();
        for (int i=0;i<mat1.size();i++){
            tmp = new ArrayList<Complejo>();
            for (int j=0;j<mat1.get(1).size();j++){
                tmp.add(mat1.get(j).get(i));
            }
        respuesta.add(tmp);
        }
        return respuesta;
    }
    
    /*
    * Retorna el  conjugado de una matriz
    * mat1 matriz compleja a conjugar
    */
    public ArrayList<ArrayList<Complejo>> conjugadoMat(ArrayList<ArrayList<Complejo>> mat1){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        ArrayList<Complejo> tmp = new ArrayList<Complejo>();
        for (int i=0;i<mat1.size();i++){
            tmp = new ArrayList<Complejo>();
            for (int j=0;j<mat1.get(1).size();j++){
            Complejo z = conjugado(mat1.get(i).get(j));
            tmp.add(z);
            }
        respuesta.add(tmp);
        }
        return respuesta;
    }
    
    /*
    * Retorna la adjunta de una matriz
    * mat1 matriz compleja
    */
    public ArrayList<ArrayList<Complejo>> adjuntaMat(ArrayList<ArrayList<Complejo>> mat1){
        ArrayList<ArrayList<Complejo>> res = transpuestaMat(mat1);
        ArrayList<ArrayList<Complejo>> respuesta = conjugadoMat(res);
        return respuesta;
    }
    
    /*
    * Retorna la accion de una matriz sobre un vector
    * mat1 matriz compleja
    * vec1 vector complejo
    */
    public ArrayList<Complejo> accionMatVec(ArrayList<ArrayList<Complejo>> mat1, ArrayList<Complejo> vec1 ){
        ArrayList<Complejo> respuesta = new ArrayList<Complejo>();
        Complejo suma = new Complejo(0,0);
        for (int i=0;i<mat1.size();i++){
            suma = new Complejo(0,0);
            for (int j=0;j<mat1.get(1).size();j++){
               suma = sumaComp(suma, multComp(mat1.get(i).get(j), vec1.get(j)));
            }
            respuesta.add(suma);
        }
        return respuesta;
    }
    
    /*
    * Retorna la norma de una matriz
    * mat1 matriz compleja
    */
    public Complejo normaMat(ArrayList<ArrayList<Complejo>> mat1){
        Complejo respuesta;
        Complejo suma = new Complejo(0,0);
        for (int i=0;i<mat1.size();i++){
            for (int j=0;j<mat1.get(1).size();j++){
            suma = sumaComp(suma, multComp(mat1.get(i).get(j), mat1.get(i).get(j)));
            }
        }
        if (suma.getEntero()<0){
            suma.setEntero(suma.getEntero()*-1);
        }
        if (suma.getImaginario()<0){
            suma.setImaginario(suma.getImaginario()*-1);
        }
        respuesta = new Complejo(Math.sqrt(suma.getEntero()), Math.sqrt(suma.getImaginario()));
        return respuesta;
    }
    
    /*
    * Retorna la distancia entre dos matrices
    * mat1 primer matriz compleja
    * mat2 segunda matriz compleja
    */
    public Complejo distMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2){
        ArrayList<ArrayList<Complejo>> nv1 = inversaMat(mat2);
        ArrayList<ArrayList<Complejo>> nv2 = sumaMat(mat1,nv1);
        Complejo respuesta = normaMat(nv2);
        return respuesta;
    }
    
    /*
    * Retorna la multiplicacion de dos matrices
    * mat1 primer matriz compleja
    * mat2 segunda matriz compleja
    */
    public ArrayList<ArrayList<Complejo>> multMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2){
        ArrayList<ArrayList<Complejo>> respuesta = new ArrayList<ArrayList<Complejo>>();
        ArrayList<Complejo> tmp = new ArrayList<Complejo>();
        Complejo suma;
        for (int i=0;i<mat1.size();i++){
            tmp = new ArrayList<Complejo>();
            for (int j=0;j<mat1.get(1).size();j++){
                suma = new Complejo(0,0);
                for (int k=0;k<mat1.get(1).size();k++){
                suma= sumaComp(suma, multComp(mat1.get(i).get(k), mat2.get(k).get(j)));
                }
                tmp.add(suma);
            }
            respuesta.add(tmp);
        }
        return respuesta;
    }
    
    /*
    * Retorna si dos matrices son iguales
    * mat1 primer matriz compleja
    * mat2 segunda matriz complejo
    */
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
    
    /*
    * Retorna si dos vectores son iguales
    * vec1 primer vector complejo
    * vec2 segundo vector complejo
    */
    public boolean igualesVec(ArrayList<Complejo> vec1, ArrayList<Complejo> vec2){
        
        for (int i=0;i<vec1.size();i++){
            if (vec1.get(i).getEntero()!= vec2.get(i).getEntero() || vec1.get(i).getImaginario()!= vec2.get(i).getImaginario() ){
                    return false;
            }
        }
        return true;
    }
    
    /*
    * Retorna si una matriz es unitaria
    * mat1 matriz compleja a verificar
    */
    public boolean unitariaMat(ArrayList<ArrayList<Complejo>> mat1){
        ArrayList<ArrayList<Complejo>> adjunta = adjuntaMat(mat1);
        ArrayList<ArrayList<Complejo>> res1 = multMat(mat1, adjunta);
        ArrayList<ArrayList<Complejo>> res2 = multMat(adjunta,mat1);
        return igualesMat(res1,res2);
    }
    
    /*
    * Retorna si una matriz es hermitiana
    * mat1 matriz compleja a verificar
    */
    public boolean hermitianMat(ArrayList<ArrayList<Complejo>> mat1){
        ArrayList<ArrayList<Complejo>> adjunta = adjuntaMat(mat1);
        return igualesMat(mat1,adjunta);
    }    
    
    /*
    * Retorna el producto tensor de dos matrices
    * mat1 primer matriz compleja
    * mat2 segunda matriz compleja
    */
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
