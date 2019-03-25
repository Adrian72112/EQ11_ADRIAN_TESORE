/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TA3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    
    public Map<String, Integer> contarVolcalesConsonantes(String texto) {
        ArrayList<Character> vocales = new ArrayList<Character>();
        vocales.add('a');
        vocales.add('e');
        vocales.add('i');
        vocales.add('o');
        vocales.add('u');

        int v = 0;
        int c = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (Character.isAlphabetic(c)) {
                if (vocales.contains(texto.charAt(i)))
                    v ++;
            } else {
                c ++;
        }
    }

    Map<String, Integer> result = new HashMap<>();
    result.put("vocales", v);
    result.put("consonantes", c);

    return result;
}
    
    public int cantidadLargoPalabra(int minLargo, String palabra){
        boolean esPalabra = false;
        int contador = 0 , largo = 0;
        char[] hola = {};
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
