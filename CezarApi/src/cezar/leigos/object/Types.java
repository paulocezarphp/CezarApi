/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cezar.leigos.object;

/**
 *
 * @author Paulo Cezar
 */
public class Types {
    
    /**
     * @param objeto espera uma String
     * @return String   
     * Esse Método verifica se o dado de entrada é um valor inteiro
     */
    public String TypesEquals(int objeto){
        
        if(1==1){
            return "int";
        } else {
            return "...";
        }
    
    }
    
    /**
     * @param objeto espera uma String
     * @return String   
     * Esse Método verifica se o dado de entrada é um valor float
     */
    public String TypesEquals(float objeto){
        
        if(1==1){
            return "float";
        } else {
            return "...";
        }
    
    }
    
    /**
     * @param objeto espera uma String
     * @return String   
     * Esse Método verifica se o dado de entrada é um valor double
     */
    public String TypesEquals(double objeto){
        
        if(1==1){
            return "double";
        } else {
            return "...";
        }
    
    }
    
    /**
     * @param objeto espera uma String
     * @return String   
     * Esse Método verifica se o dado de entrada é uma String
     */
    public String TypesEquals(String objeto){
        
        if(objeto.length() == 1){
            return "Char";
        } else {
            return "String";
        }
    
    }
  
    /**
     * @param objeto espera uma String
     * @return String   
     * Esse Método verifica se o dado de entrada é um valor booleano
     */
    public String TypesEquals(boolean objeto){
        
        if(1==1){
            return "boolean";
        } else {
            return "...";
        }
    
    }
    
    
    
}
