/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Empleado {
    //1- ATRIBUTOS-----------------------------------
    
    /*FORMATO: identificador_acceso* tipo_de_dato id;*/
    public int codigo, edad;  
    public String nombre;
    public double salario;
    public Departamento depto;
    
    //2- CONSTRUCTOR-----------------------------------
    public Empleado(){
        this(-1,"fulanito");
        System.out.println("Se llamo el ()");
    }
    
    public Empleado(int codigo, String nombre){
        this(codigo,nombre,5000);
        System.out.println("Se llamo el (int-String)");
    }
    
    public Empleado(int c, String n, double s){
        System.out.println("Se llamo el (int-String-double)");
        codigo = c;
        nombre = n;
        salario = s;
        edad = 20;
        depto = new Departamento(1,"IT");
    }
    
    //3- FUNCIONES
}
