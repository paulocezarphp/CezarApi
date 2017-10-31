/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cezar.leigos.math;

/**
 *
 * @author paulo
 */
public class Calc {
    
    
    private int total;
    
    
    /**
     * @param a espera um valor inteiro
     * @param b espera um valor inteiro
     * Esse Método incrementa uma determinado valor(a)
     * em uma quantida(b) vezes
     * @return int    
     */
    public int FullIncrement(int a, int b){
    
        for(int i = 0; i < b; i++){
            
            total = total + a;
            
        }
        
        return total;
    }
    
    
    /**
     * @param a espera um valor inteiro
     * @param b espera um valor inteiro
     * Esse Método decrementa uma determinado valor(a)
     * em uma quantida(b) vezes
     * @return int    
     */
     public int FullDecrement(int a, int b){
    
        for(int i = 0; i < b; i++){
            
            total = total - a;
            
        }
        
        return total;
    }
    
     
    /**
     * @param a espera um valor inteiro
     * @return int    
     * Esse Método retorna o valor(a) permutado
     */
    public int Permutation(int a){
                    
        for(int i = a - 1; i > 1; i--){
            
            a = a * i;
            
        }
        
        return a;
    }
    
    /**
     * @param p espera um valor inteiro
     * @param n espera um valor inteiro
     * @return int    
     * Esse Método retorna o valor da combinação onde
     */
    public int Combination(int p, int n){
       
        int c1 = Permutation(n);        
        int c2 = Permutation(p) * Permutation(n - p);
        int total = c1 / c2;       
        
        return total;
    }
    
    /**
     * @param p espera um valor inteiro
     * @param n espera um valor inteiro
     * @return int    
     * Esse Método retorna o valor de um arranjo
     */
    public int Arrangement(int p, int n){
    
        int a1 = Permutation(n);
        int a2 = Permutation(n - p);
        int total = a1 / a2;
        
        return total;
    }

    
    
}
