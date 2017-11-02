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
    
    
    /**
     * @param s espera uma String
     * @param c espera um valor char
     * @return int    
     * Esse Método retorna quantos caracteres(c) existem em uma string
     */
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
    
    
    /**
     * @param s espera uma String
     * @return boolean    
     * Esse Método retorna true se todos os caracteres da String forem Maiúsculas
     */
    public boolean UpperCaseBoolean(String s){
        boolean valor = false;
        int conta = 0;
        s = s.replaceAll(" ", "");
        
        for(int i = 0; i < s.length(); i++){
            
            for(char j = 'A'; j <= 'Z'; j++){
                
                if((s.toCharArray()[i] == j)){
                    
                    conta++;
                    break;
                    
                }else{
                    
                    valor = false;                    
                    
                }
                
            }
              
        }
        
        if(s.length() == conta){
        return true;    
        } else{
            
        return false;
        
        }
        
    } 
    
    /**
     * @param s espera uma String
     * @return boolean    
     * Esse Método retorna true se todos os caracteres da String forem Minúscula
     */
    public boolean LowerCaseBoolean(String s){
    
        boolean valor = false;
        int conta = 0;
        s = s.replaceAll(" ", "");
        
        for(int i = 0; i < s.length(); i++){
            
            for(char j = 'a'; j <= 'z'; j++){
                
                if((s.toCharArray()[i] == j)){
                    
                    conta++;
                    break;
                    
                }else{
                    
                    valor = false;                    
                    
                }
                
            }
              
        }
        
        if(s.length() == conta){
        return true;    
        } else{
            
        return false;
        
        }
       
    }
    
    
    
}
