/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TA2;
import java.util.*;
/**
 *
 * @author adriantesore
 */
public class Nodo implements INodo {
    
    Comparable etiqueta;
    public Producto carga;
    public INodo prox;
    
    public Nodo(){
        prox = null;
    }
    
    public Nodo (Producto carga, Nodo prox){
        this.carga = carga;
        this.prox = prox;
    }
    
    public String toString(){
        return this.carga + "";
    }

    @Override
    public Producto getDato() {
        return this.carga; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDato(Producto dato) {
        this.carga = dato; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSiguiente(INodo nodo) {
        this.prox = nodo; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public INodo getSiguiente() {
        return this.prox; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimir() {
        System.out.println(this.carga); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirEtiqueta() {
        System.out.println(this.etiqueta); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(INodo unNodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparable getEtiqueta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Comparable etiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
