
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class EmpleadoTest {
    
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        Empleado e1=new Empleado();
        Empleado e2=new Empleado();
        
        
        e1.codigo = 1;
        e1.nombre = "Lourdes";
        e2.codigo = 2;
        e2.nombre = "Roberto";
        
        e1.depto = new Departamento();
        e1.depto.nombre = "IT";
        
        System.out.println("Codigo: "+e1.codigo+"-"+e1.nombre+"-"+
                e1.depto.nombre);
        System.out.println("Codigo: "+e2.codigo+"-"+e2.nombre);
    }
}
