
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Docente
 */
public class Estadistica {
    private double numeros[];
    
    public Estadistica(int max){
        numeros = new double[max];
    }
    
    /*
    Funcion: llenarArreglo
    No retorna nada. No recibe de parametro. 
    Simplemente llena Random todas las posiciones del
    arreglo
    */
    public void llenar(){
        Random r = new Random();
        for(int  p=0;p < numeros.length; p++){
            numeros[p] = r.nextInt(15)+1;
        }
    }
    
    public void print(){
        for(int  p=0;p < numeros.length; p++){
            System.out.print("["+numeros[p]+"]");
        }
        System.out.println("\n");
    }
    
    /**
     * Devuelva la suma de todo el arreglo
     * @return 
     */
    public double suma(){
        return 0;
    }
    
    /**
     * Retorna true si ese valor esta en el arreglo
     * guardado, si no, retorna false
     * @param valor
     * @return 
     */
    public boolean search(double valor){
        return false;
    }
    
    /**
     * Retorna el numero promedio del arreglo
     * @return 
     */
    public double promedio(){
        return 0;
    }
}
