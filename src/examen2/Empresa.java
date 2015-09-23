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
public class Empresa {
    private Empleado emps[];
    private int cont;
    
    public Empresa(int max){
        emps = new Empleado[max];
        cont = 0;
    }
    
    public Empleado buscar(int c){
        for(Empleado e : emps){
            if(e!=null && e.getCodigo() == c)
                return e;
        }
        return null;
    }
    
    public void contratar(int c, String n, double s){
        if(buscar(c) == null){
            if(cont < emps.length){
                emps[cont++] = new Empleado(c,n,s);
            }
        }
    }
    
    public void registrar(int c, double v, int m){
        Empleado e = buscar(c);
        if(e != null)
            e.registrarVenta(v, m);
    }
    
    public void empleados(){
        double ventas=0;
        for(int e=0; e < cont; e++){
            emps[e].print();
            ventas += emps[e].ventas();
        }
        System.out.println("Ventas: " + ventas);
    }
    
    public double pagar(int c, int m){
        Empleado e = buscar(c);
        if(e != null)
            return e.pago(m);
        return 0; 
    }
}
