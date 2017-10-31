/*
 * @author Paulo Cezar
 * @version 0.4
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
