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
public class Percentage {
    
    
    /**
     * @param a Espera um valor float
     * @param b Espera um valor float
     * Esse método verifica qual a porcentagem do valor (a) em relação ao valor (b)
     * O primeiro parametro esperar receber a porcentagem e o segundo é o valor total
     * @return float
     */
    public float PercentageOf(float a, float b){
        float valor;
        
        if(a <= 100){
            valor = (a / 100) * b;     
        } else{
            valor = 0;
        }
             
        return valor;
    }
    
    
    /**
     * @param a Espera um valor float
     * @param b Espera um valor float
     * Esse método verifica qual a porcentagem de um determinado valor (a) em relação ao valor (b)
     * O primeiro parametro espera receber um valor menor do que o valor de b
     * @return float
     */
    public float PercentageValue(float a, float b){
        float valor;
        
        if(a <= b){
           valor = (a / b) * 100;
        } else{
           valor = 0; 
        }
        
        
        return valor;
    }
    
}
