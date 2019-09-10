/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import cnyt.*;
import java.util.ArrayList;
import org.junit.*;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.After;
import static org.junit.Assert.assertFalse;
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
    
    @Test
    public void sumVecCorrecta(){
        ArrayList<Complejo> res = new ArrayList<Complejo>();
        res.add(new Complejo(7,15));
        res.add(new Complejo(9,14));
        res.add(new Complejo(7,11));
        ArrayList<Complejo> dada = prueba.sumaVec(prueba.getVector1(), prueba.getVector2());
        assertTrue(prueba.igualesVec(res,dada));
    } 
    @Test
    public void inversaVecCorrecta(){
        ArrayList<Complejo> res = new ArrayList<Complejo>();
        res.add(new Complejo(-5,-7));
        res.add(new Complejo(-1,-5));
        res.add(new Complejo(-7,-9));
        ArrayList<Complejo> dada = prueba.inversaVec(prueba.getVector1());
        assertTrue(prueba.igualesVec(res,dada));
    } 
    
    @Test
    public void multEscaVecCorrecta(){
        ArrayList<Complejo> res = new ArrayList<Complejo>();
        res.add(new Complejo(-24,70));
        res.add(new Complejo(-30,32));
        res.add(new Complejo(-28,94));
        ArrayList<Complejo> dada = prueba.multEscaVec(prueba.getVector1(), prueba.getComplejo1());
        assertTrue(prueba.igualesVec(res,dada));
    }
    
    @Test
    public void sumMatCorrecta(){
        ArrayList<Complejo> temp1 = new ArrayList<Complejo>();
        ArrayList<Complejo> temp2 = new ArrayList<Complejo>();
        ArrayList<Complejo> temp3 = new ArrayList<Complejo>();
        ArrayList<ArrayList<Complejo>> res = new ArrayList<ArrayList<Complejo>>();
        temp1.add(new Complejo(7,15));
        temp1.add(new Complejo(9,14));
        temp1.add(new Complejo(7,11));
        temp2.add(new Complejo(13,5));
        temp2.add(new Complejo(13,13));
        temp2.add(new Complejo(3,11));
        temp3.add(new Complejo(8,9));
        temp3.add(new Complejo(12,15));
        temp3.add(new Complejo(9,5));
        res.add(temp1);
        res.add(temp2);
        res.add(temp3);
        ArrayList<ArrayList<Complejo>> dada = prueba.sumaMat(prueba.getMatriz1(), prueba.getMatriz2());
        assertTrue(prueba.igualesMat(res,dada));
    }
    
    @Test
    public void inversaMatCorrecta(){
        ArrayList<Complejo> temp1 = new ArrayList<Complejo>();
        ArrayList<Complejo> temp2 = new ArrayList<Complejo>();
        ArrayList<Complejo> temp3 = new ArrayList<Complejo>();
        ArrayList<ArrayList<Complejo>> res = new ArrayList<ArrayList<Complejo>>();
        temp1.add(new Complejo(-5,-7));
        temp1.add(new Complejo(-1,-5));
        temp1.add(new Complejo(-7,-9));
        temp2.add(new Complejo(-4,-3));
        temp2.add(new Complejo(-5,-8));
        temp2.add(new Complejo(0,-9));
        temp3.add(new Complejo(-2,-4));
        temp3.add(new Complejo(-3,-8));
        temp3.add(new Complejo(-1,0));
        res.add(temp1);
        res.add(temp2);
        res.add(temp3);
        ArrayList<ArrayList<Complejo>> dada = prueba.inversaMat(prueba.getMatriz1());
        assertTrue(prueba.igualesMat(res,dada));
    }
    
        @Test
    public void multEscMatCorrecta(){
        ArrayList<Complejo> temp1 = new ArrayList<Complejo>();
        ArrayList<Complejo> temp2 = new ArrayList<Complejo>();
        ArrayList<Complejo> temp3 = new ArrayList<Complejo>();
        ArrayList<ArrayList<Complejo>> res = new ArrayList<ArrayList<Complejo>>();
        temp1.add(new Complejo(-24,70));
        temp1.add(new Complejo(-30,32));
        temp1.add(new Complejo(-28,94));
        temp2.add(new Complejo(-1,43));
        temp2.add(new Complejo(-31,75));
        temp2.add(new Complejo(-63,45));
        temp3.add(new Complejo(-18,34));
        temp3.add(new Complejo(-41,61));
        temp3.add(new Complejo(5,7));
        res.add(temp1);
        res.add(temp2);
        res.add(temp3);
        ArrayList<ArrayList<Complejo>> dada = prueba.multEscaMat(prueba.getMatriz1(), prueba.getComplejo1());
        assertTrue(prueba.igualesMat(res,dada));
    }
    
    @Test
    public void transpuestaMatCorrecta(){
        ArrayList<Complejo> temp1 = new ArrayList<Complejo>();
        ArrayList<Complejo> temp2 = new ArrayList<Complejo>();
        ArrayList<Complejo> temp3 = new ArrayList<Complejo>();
        ArrayList<ArrayList<Complejo>> res = new ArrayList<ArrayList<Complejo>>();
        temp1.add(new Complejo(5,7));
        temp1.add(new Complejo(4,3));
        temp1.add(new Complejo(2,4));
        temp2.add(new Complejo(1,5));
        temp2.add(new Complejo(5,8));
        temp2.add(new Complejo(3,8));
        temp3.add(new Complejo(7,9));
        temp3.add(new Complejo(0,9));
        temp3.add(new Complejo(1,0));
        res.add(temp1);
        res.add(temp2);
        res.add(temp3);
        ArrayList<ArrayList<Complejo>> dada = prueba.transpuestaMat(prueba.getMatriz1());
        assertTrue(prueba.igualesMat(res,dada));
    }
    
    @Test
    public void conjugadoMatCorrecta(){
        ArrayList<Complejo> temp1 = new ArrayList<Complejo>();
        ArrayList<Complejo> temp2 = new ArrayList<Complejo>();
        ArrayList<Complejo> temp3 = new ArrayList<Complejo>();
        ArrayList<ArrayList<Complejo>> res = new ArrayList<ArrayList<Complejo>>();
        temp1.add(new Complejo(5,-7));
        temp1.add(new Complejo(1,-5));
        temp1.add(new Complejo(7,-9));
        temp2.add(new Complejo(4,-3));
        temp2.add(new Complejo(5,-8));
        temp2.add(new Complejo(0,-9));
        temp3.add(new Complejo(2,-4));
        temp3.add(new Complejo(3,-8));
        temp3.add(new Complejo(1,0));
        res.add(temp1);
        res.add(temp2);
        res.add(temp3);
        ArrayList<ArrayList<Complejo>> dada = prueba.conjugadoMat(prueba.getMatriz1());
        assertTrue(prueba.igualesMat(res,dada));
    }
    
        @Test
    public void adjuntaMatCorrecta(){
        ArrayList<Complejo> temp1 = new ArrayList<Complejo>();
        ArrayList<Complejo> temp2 = new ArrayList<Complejo>();
        ArrayList<Complejo> temp3 = new ArrayList<Complejo>();
        ArrayList<ArrayList<Complejo>> res = new ArrayList<ArrayList<Complejo>>();
        temp1.add(new Complejo(5,-7));
        temp1.add(new Complejo(4,-3));
        temp1.add(new Complejo(2,-4));
        temp2.add(new Complejo(1,-5));
        temp2.add(new Complejo(5,-8));
        temp2.add(new Complejo(3,-8));
        temp3.add(new Complejo(7,-9));
        temp3.add(new Complejo(0,-9));
        temp3.add(new Complejo(1,0));
        res.add(temp1);
        res.add(temp2);
        res.add(temp3);
        ArrayList<ArrayList<Complejo>> dada = prueba.adjuntaMat(prueba.getMatriz1());
        assertTrue(prueba.igualesMat(res,dada));
    }
    
    @Test
    public void acccionMatVecCorrecta(){
        ArrayList<Complejo> res = new ArrayList<Complejo>();
        res.add(new Complejo(-80,206));
        res.add(new Complejo(-117,139));
        res.add(new Complejo(-48,66));
        ArrayList<Complejo> dada = prueba.accionMatVec(prueba.getMatriz1(),prueba.getVector1());
        assertTrue(prueba.igualesVec(res,dada));
    }
    
    @Test
    public void normaMatCorrecta(){
        Complejo dado= prueba.normaMat(prueba.getMatriz1());
        Complejo resp = new Complejo(Math.sqrt(259.0), Math.sqrt(374.0));
        assertTrue(dado.getEntero()== resp.getEntero() && dado.getImaginario()== resp.getImaginario());
    }
    
    @Test
    public void distMatCorrecta(){
        Complejo dado= prueba.distMat(prueba.getMatriz1(),prueba.getMatriz2());
        Complejo resp = new Complejo(Math.sqrt(99.0), Math.sqrt(144.0));
        assertTrue(dado.getEntero()== resp.getEntero() && dado.getImaginario()== resp.getImaginario());
    }
    
    @Test
    public void unitariaMatCorrecta(){
        assertFalse(prueba.unitariaMat(prueba.getMatriz1()));
    }
    
    @Test
    public void hermitianMatCorrecta(){
        assertFalse(prueba.hermitianMat(prueba.getMatriz1()));
    }
    
    /*@Test
    public void productoTensorMatCorrecta(){
        Complejo e = new Complejo(1,0);
        Complejo f = new Complejo(2,0);
        Complejo g = new Complejo(0,0);
        Complejo h = new Complejo(1,0);
        Complejo l = new Complejo(3,0);
        Complejo m = new Complejo(2,0);
        Complejo n = new Complejo(-1,0);
        Complejo o = new Complejo(0,0);
        ArrayList<ArrayList<Complejo>> matriz1 = new ArrayList<ArrayList<Complejo>>();
        ArrayList<ArrayList<Complejo>> resultado = new ArrayList<ArrayList<Complejo>>();
        ArrayList<ArrayList<Complejo>> matriz2 = new ArrayList<ArrayList<Complejo>>();
        ArrayList<Complejo> t = new ArrayList<Complejo>();
        ArrayList<Complejo> u = new ArrayList<Complejo>();
        ArrayList<Complejo> v = new ArrayList<Complejo>();
        ArrayList<Complejo> w = new ArrayList<Complejo>();
        t.add(e);
        t.add(f);
        u.add(g);
        u.add(h);
        v.add(l);
        v.add(m);
        w.add(n);
        w.add(o);
        matriz1.add(t);
        matriz1.add(u);
        matriz2.add(v);
        matriz2.add(w);
        
        Complejo aa = new Complejo(3,0);Complejo aaa = new Complejo(2,0);Complejo aaaa = new Complejo(6,0);Complejo aaaaa = new Complejo(4,0);
        Complejo bb = new Complejo(-1,0);Complejo bbb = new Complejo(0,0);Complejo bbbb = new Complejo(-2,0);Complejo bbbbb = new Complejo(0,0);
        Complejo cc = new Complejo(0,0);Complejo ccc = new Complejo(0,0);Complejo cccc = new Complejo(3,0);Complejo ccccc = new Complejo(2,0);
        Complejo dd = new Complejo(0,0);Complejo ddd = new Complejo(0,0);Complejo dddd = new Complejo(-1,0);Complejo ddddd = new Complejo(0,0);

        ArrayList<Complejo> qq = new ArrayList<Complejo>();
        ArrayList<Complejo> rr = new ArrayList<Complejo>();
        ArrayList<Complejo> ss = new ArrayList<Complejo>();
        ArrayList<Complejo> tt = new ArrayList<Complejo>();
        
        qq.add(aa);qq.add(aaa);qq.add(aaaa);qq.add(aaaaa);
        rr.add(bb);rr.add(bbb);rr.add(bbbb);rr.add(bbbbb);
        ss.add(cc);ss.add(ccc);ss.add(cccc);ss.add(ccccc);
        tt.add(dd);tt.add(ddd);tt.add(dddd);tt.add(ddddd);
        
        resultado.add(qq);
        resultado.add(rr);
        resultado.add(ss);
        resultado.add(tt);
        ArrayList<ArrayList<Complejo>> dado = prueba.productoTensorMat(matriz1, matriz2);
        assertTrue(prueba.igualesMat(resultado, dado));
    }*/

    
    
    
    
    
    
    
}
