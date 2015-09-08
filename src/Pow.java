/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Pow {
    /*
    3 atributos enteros: base, exponente, potencia
    */
    public int base, exponente, potencia;
    //constructor
    //FORMATO: public NombreDeClase(parametros){}
    
    /**
     * Constructor de Pow
     * @param b Base
     * @param e Exponente
     */
    public Pow(int b,int e){
        //codificar aca instrucciones iniciales al momento de crear el 
        //objeto
        
        //asignarle valores constantes a base y exponente
        base = b;
        exponente = e;
        //Utilizar Math.pow para asignarle valor a potencia
        potencia = (int)Math.pow(base, exponente);
    }  
  
    
}
