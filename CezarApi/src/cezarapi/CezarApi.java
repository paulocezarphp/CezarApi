/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cezarapi;
import cezar.leigos.math.OddOrEven;
import cezar.leigos.string.CharCount;

/**
 *
 * @author paulo
 */
public class CezarApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OddOrEven impar = new OddOrEven();
        CharCount conta = new CharCount();
        
        
        System.out.println(conta.CountElement("paulo cezar maciel de souza",'e'));
        
    }
    
}
