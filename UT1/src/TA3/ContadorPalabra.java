/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TA3;

/**
 *
 * @author adriantesore
 */
public class ContadorPalabra {
    
    public int contadorPalabras(String palabra){
        boolean esPalabra = false;
        int contador = 0;
        for (char caracter: palabra.toCharArray()){
            if (Character.isAlphabetic(caracter)){
                esPalabra = true;
            }
            if (caracter == ' ' && esPalabra){
                contador++;
                esPalabra = false;
            }
        }
        if (esPalabra){
            contador ++;
        }
        return contador;
    }
}
