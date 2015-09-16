/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Empresa {
    public Empleado empleados[];
    
    public Empresa(int max){
        empleados = new Empleado[max];
    }
    
    private int proximaPosicionDisponible(){
        for(int e=0; e < empleados.length; e++){
            if(empleados[e] == null)
                return e;
        }
        return -1;
    } 
    
    public boolean contratar(int c,String n, double s){
        int pos = proximaPosicionDisponible();
        if(pos >= 0){
            empleados[pos] = new Empleado(c,n,s);
            return true;
        }
        return false;
    }
    
    public void listar(){
        for(Empleado emp : empleados){
            if(emp != null)
                emp.print();
        }
    }
    
    public static void main(String[] args) {
        Empresa apple = new Empresa(200);
        apple.contratar(1, "Messi", 100000);
        apple.contratar(2, "Neymar", 10000);
        apple.contratar(3, "Luis Suarez", 1000);
        apple.listar();
    }
}
