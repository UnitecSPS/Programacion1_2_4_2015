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
    private int codigo, edad;  
    private String nombre;
    private double salario;
    private Departamento depto;
    
    //2- CONSTRUCTOR-----------------------------------
    public Empleado(){
        this(-1,"fulanito");
        System.out.println("Se llamo el ()");
    }
    
    public Empleado(int codigo, String nombre){
        this(codigo,nombre,5000);
        System.out.println("Se llamo el (int-String)");
    }
    
    //3- FUNCIONES
    public Empleado(int c, String n, double s){
        System.out.println("Se llamo el (int-String-double)");
        codigo = c;
        nombre = n;
        salario = s;
        edad = 20;
        depto = new Departamento(1,"IT");
    }
    
    //3- FUNCIONES
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setEdad(int e){
        edad = e;
    }
    
    public void setDepartamento(Departamento d){
        depto = d;
    }
    
    public void setSalario(double s){
        salario = s;
    }
    
    /*
    FORMATO:
       return EXPR;
    
    REGLAS DE GOCHEZ:
        1- SIEMPRE retornar de acuerdo al tipo
        2- SIEMPRE retornar algo
        3- NUNCA poner codigos inmediatamente despues
           de un return
    */
    public int getCodigo(){
        return codigo;
    } 
    
    public int getEdad(){
        if( edad < 0 )
            return 0;
        return edad;
        
    }

    public String getNombre(){
        return nombre;
    }
    
    public Departamento getDepartamento(){
        return depto;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void print(){
         System.out.println("Codigo: "+codigo+"-"+nombre+"-Lps."+
                salario+"-"+depto.getNombre());
       
    }
    
    public double pago(){
        return salario - (salario*0.035);
    }
}
