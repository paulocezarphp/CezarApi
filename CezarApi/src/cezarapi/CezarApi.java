/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cezarapi;
import cezar.leigos.math.OddOrEven;
import cezar.leigos.string.CharCount;
import cezar.leigos.math.Calc;

/**
 *
 * @author paulo
 */
public class CezarApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Calc c = new Calc();
        
        
       System.out.println(c.Permutation(10));
       System.out.println(c.Combination(3, 10));
       System.out.println(c.Combination(4, 7));
       System.out.println(c.Arrangement(6, 12));
       
        
    }
    
}
