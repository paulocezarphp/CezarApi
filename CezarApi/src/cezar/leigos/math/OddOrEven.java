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
public class OddOrEven {
    
    private int odd;
    private int even;
    
    
    /**
     * @param odd Espera um valor inteiro
     * Esse metodo verifica se o valor impar
     * @return boolean
     */
    public boolean OddValue(int odd){
       
        this.odd = odd;
        
        if(odd % 2 == 1){
            return true;
        } else{
            return false;
        }
        
    }
    
    /**
     * @param even espera um valor inteiro
     * Esse metodo verifica se o valor par
     * @return boolean
     */
    public boolean EvenValue(int even){
       
        this.even = even;
        
        if(even % 2 == 0){
            return true;
        } else{
            return false;
        }
        
    }
    
    
        
    
    
}
