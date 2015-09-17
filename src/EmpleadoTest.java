
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
        
        e1.setNombre("Mr Bean");
        e2.setEdad(21);
        e3.setSalario(25000);
        
        System.out.println("Codigo: "+e1.getCodigo()+"-"+e1.getNombre()+"-Lps."+
                e1.getSalario()+"-"+e1.getDepartamento().getNombre());
        e2.print();
        e3.print();
        
        //test el atributo estatico 
        System.out.println("Version: " + Empleado.VERSION);
        e1.VERSION = 5;
        System.out.println("Version: " + Empleado.VERSION);
        System.out.println("Version: " + e1.VERSION);
        System.out.println("Version: " + e2.VERSION);
        System.out.println("Version: " + e3.VERSION);
        Empleado.VERSION = 10;
        System.out.println("Version: " + e1.VERSION);
    }
}
