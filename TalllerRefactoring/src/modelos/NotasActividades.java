/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Isaac
 */
public class NotasActividades {
    private double nexamen;
    private double ntalleres;
    private double ndeberes;
    private double nlecciones;    
    private ArrayList<Paralelo> paralelos;

    private double notaInicial;
    private double notaFinal;
    private double notaTotal;
    
  
    public double calcularNota(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
            double notaFinal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                notaFinal=notaTeorico+notaPractico;
            }
        }
        return notaFinal;
    }

  
    
       public double CalcularNotaInicial(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        return calcularNota(p,nexamen,ndeberes,nlecciones,ntalleres);

    }
     
    public double CalcularNotaFinal(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        return calcularNota(p,nexamen,ndeberes,nlecciones,ntalleres);
    }
    
    public double getNotaInicial() {
        return notaInicial;
    }

    public void setNotaInicial(double notaInicial) {
        this.notaInicial = notaInicial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double getNotaTotal() {
        return notaTotal;
    }

    public void setNotaTotal(double notaTotal) {
        this.notaTotal = notaTotal;
    }
    
}
