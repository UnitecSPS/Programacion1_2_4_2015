
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Matematica {
    //mundo exterior-----------------------
    public static void main(String[] args) {
        Random rd = new Random();
        
        //Declarar e instanciar un objeto de Pow
        int base = rd.nextInt(9)+1;
        int expo = rd.nextInt(9)+1;
        Pow pow = new Pow(base,expo);
        //imprimir los 3 valores
        System.out.println(pow.base+"^"+pow.exponente+"="+pow.potencia);
        
        //Declarar e instanciar un objeto Factorial
        //Impriminan el numero con su factorial
        int num = rd.nextInt(9)+1;
        Factorial fact = new Factorial(num);
        
    }
}
