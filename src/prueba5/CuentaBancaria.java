/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba5;

/**
 *
 * @author Aula
 */
public class CuentaBancaria {
    public int codigo;
    public String nombre, tipo;
    public double saldo, tasa;
    
    public CuentaBancaria(int c, String n, String t){
        codigo = c;
        nombre = n;
        tipo = t.toUpperCase();
        saldo = 500;
        switch(tipo){
            case "NORMAL":
                tasa = 0.02;
                break;
            case "VIP":
                tasa = 0.05;
                break;
            default:
                tasa = 0;
        }
    }
}
