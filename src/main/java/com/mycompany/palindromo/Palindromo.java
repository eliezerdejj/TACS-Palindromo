/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palindromo;

/**
 *
 * @author eliez
 */
public class Palindromo {
    
        public static boolean Palindromo(String palavra) {
        int meio = palavra.length() / 2;
        for (int i = 0; i < meio; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length()-1 - i)) {
                return false;
            }
        }
        return true;
    }
    
}
