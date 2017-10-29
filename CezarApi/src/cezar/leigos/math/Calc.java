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
    
    
    //Essa função decrementa um determinado numero(a) 
    //durante uma quantidade(b) vezes
     public int FullDecrement(int a, int b){
    
        for(int i = 0; i < b; i++){
            
            total = total - a;
            
        }
        
        return total;
    }
    
    
    
    
}
