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
    
    public int cantidadLargoPalabra(int minLargo, String palabra){
        boolean esPalabra = false;
        int contador = 0 , largo = 0;
        
        for (char caracter: palabra.toCharArray()){
            if (Character.isAlphabetic(caracter)){
                esPalabra = true;
                largo++;
            }
            if (caracter == ' ' && esPalabra){
                if (largo > minLargo)
                    contador++;
                largo = 0;
                esPalabra = false;
            }
        }
        
        // Esto chekea la ultima palabra que no termina en espacio
        if (esPalabra && largo > minLargo){
            contador ++;
        }
        return contador;
    }
}
