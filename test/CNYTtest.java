/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import cnyt.*;
import org.junit.*;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Before;


/**
 *
 * @author jcortes
 */
public class CNYTtest {
    CNYT prueba = new CNYT();
    
    @Test
    public void sumaCorrecta(){
        Boolean r = false;
        Complejo a = new Complejo(2,2);
        Complejo b = new Complejo(3,3);
        Complejo solucion = prueba.sumaComp(a,b);
        if (solucion.getEntero()==5.0 && solucion.getImaginario()==5.0){
            r = true;
        }
        assertTrue(r);
    }
    
    @Test
    public void restaCorrecta(){
        Boolean r = false;
        Complejo a = new Complejo(2,2);
        Complejo b = new Complejo(3,3);
        Complejo solucion = prueba.restaComp(a,b);
        if (solucion.getEntero()==-1.0 && solucion.getImaginario()==-1.0){
            r = true;
        }
        assertTrue(r);
    }
    
    @Test
    public void multCorrecta(){
        Boolean r = false;
        Complejo a = new Complejo(2,2);
        Complejo b = new Complejo(3,3);
        Complejo solucion = prueba.multComp(a,b);
        if (solucion.getEntero()==0.0 && solucion.getImaginario()==12.0){
            r = true;
        }
        assertTrue(r);
    }
    
    @Test
    public void divCorrecta(){
        Boolean r = false;
        Complejo a = new Complejo(2,2);
        Complejo b = new Complejo(3,3);
        Complejo solucion = prueba.divComp(a,b);
        if (solucion.getEntero()==(12.0/18.0) && solucion.getImaginario()==0.0){
            r = true;
        }
        assertTrue(r);
    }
    
    @Test
    public void moduloCorrecto(){
        Complejo a = new Complejo(2,2);
        double solucion = prueba.modulo(a);
        assertTrue(solucion==Math.sqrt(8.0));
    }
    
    @Test
    public void conjugadoCorrecto(){
        Complejo a = new Complejo(2,2);
        Complejo solucion = prueba.conjugado(a);
        assertTrue(solucion.getImaginario() == (a.getImaginario()*-1) && solucion.getEntero()== a.getEntero());
    }
    
    @Test
    public void polarACartesianoCorrecto(){
        Boolean r = false;
        Complejo a = new Complejo(2,2);
        Complejo solucion = prueba.poCar(a);
        if (solucion.getEntero()==Math.cos(2.0)*2 && solucion.getImaginario()==Math.sin(2.0)*2){
            r = true;
        }
        assertTrue(r);
    }
    
    @Test
    public void CartesianoApolarCorrecto(){
        Boolean r = false;
        Complejo a = new Complejo(2,2);
        Complejo solucion = prueba.caPol(a);
        if (solucion.getEntero()== Math.sqrt(8.0) && solucion.getImaginario()== Math.atan2(a.getImaginario(),a.getEntero())){
            r = true;
        }
        assertTrue(r);
    }  
    
     @Test
    public void faseCorrecta(){
        Complejo a = new Complejo(2,2);
        double solucion = prueba.fase(a);
        assertTrue(solucion == Math.atan2(2.0,2.0));
    }    
    
}
