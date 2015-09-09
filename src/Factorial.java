/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Factorial {
    /*
    2 atributos enteros: Numero, facto
    */
    public int numero, facto=1;
       
    //1-constructor va recibir 1 parametro entero para asignarlo a Numero
    //2-Calculo el factorial de ese Numero y lo guardo en facto
    public Factorial(int n){
        numero = n;
        for(int x=1; x <= numero; x++){
            facto *= x;
        }
        System.out.println(numero+"! = "+facto);
    }
}
