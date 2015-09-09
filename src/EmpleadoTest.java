
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
        Empleado e2=new Empleado(1,"Delia");
        Empleado e3=new Empleado(2,"Martin",15000);
        
        //e1 = new Empleado(3,"Jose");
        
        System.out.println("Codigo: "+e1.codigo+"-"+e1.nombre+"-Lps."+
                e1.salario+"-"+e1.depto.nombre);
        System.out.println("Codigo: "+e2.codigo+"-"+e2.nombre+"-Lps."+
                e2.salario+"-"+e2.depto.nombre);
        System.out.println("Codigo: "+e3.codigo+"-"+e3.nombre+"-Lps."+
                e3.salario+"-"+e3.depto.nombre);
    }
}
