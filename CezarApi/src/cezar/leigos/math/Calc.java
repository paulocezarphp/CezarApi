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
    
    //Essa função incrementa um determinado numero(a) 
    //durante uma quantidade(b) vezes
    public int FullIncrement(int a, int b){
    
        for(int i = 0; i < b; i++){
            
            total = total + a;
            
        }
        
        return total;
    }
    
    
    //Esse metodo decrementa um determinado numero(a) 
    //durante uma quantidade(b) vezes
     public int FullDecrement(int a, int b){
    
        for(int i = 0; i < b; i++){
            
            total = total - a;
            
        }
        
        return total;
    }
    
     
    // Esse metodo calcula a permutação de um determinado valor(a)
    // Ele espera um valor inteiro 
    public int Permutation(int a){
                    
        for(int i = a - 1; i > 1; i--){
            
            a = a * i;
            
        }
        
        return a;
    }
    
    public int Combination(int p, int n){
       
        int c1 = Permutation(n);        
        int c2 = Permutation(p) * Permutation(n - p);
        int total = c1 / c2;       
        
        return total;
    }
    
    
    public int Arrangement(int p, int n){
    
        int a1 = Permutation(n);
        int a2 = Permutation(n - p);
        int total = a1 / a2;
        
        return total;
    }

    
    
}
