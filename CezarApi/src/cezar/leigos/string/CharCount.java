/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cezar.leigos.string;

/**
 *
 * @author paulo
 */
public class CharCount {
    
    private int totalElement;
    private String stringElement;
    private char charElement;
    
    
    //Essa função verifica quantas vezes um determinado caracteres se repete
    //Ele espera receber no primeiro parâmetro uma string que queremos analisar
    //No segundo parâmetro analisamos um char contendo a letra que queremos contar
    public int CountElement(String s,char c){
        this.stringElement = s;
        this.charElement = c;
        
        for(int i = 0; i < s.length(); i++){
            
            if(stringElement.toCharArray()[i] == charElement){
                totalElement = totalElement + 1;
            }
            
        }
    
        return totalElement;
    }
    
    
}
