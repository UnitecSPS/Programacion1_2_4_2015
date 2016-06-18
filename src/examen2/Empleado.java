/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Aula
 */
public class Empleado {
    private int codigo;
    private String nombre;
    private double salario;
    private double ventas[];
    
    public Empleado(int c, String n, double s){
        codigo = c;
        nombre = n;
        salario = s;
        ventas = new double[12];
    }
    
    public void setSalario(double s){
        salario =s;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public boolean registrarVenta(double m, int mes){
        if(mes>= 1 && mes <= 12){
            ventas[mes-1] += m;
            return true;
        }
        return false;
    }
    
    public double comision(int mes){
        if(mes >= 1 && mes <= 12){
            return ventas[mes-1] * 0.1;
        }
        return 0;
    }
    
    public double pago(int mes){
        return salario + comision(mes) - (salario*0.035);
    }
    
    public double ventas(){
        double v=0;
        for(double ven : ventas)
            v+=ven;
        return v;
    }
    
    public void print(){
        System.out.println(codigo+nombre+salario+ventas());
    }
}
