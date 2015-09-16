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
public class Banco {
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria(1, "Mr Bean", "VIP");
        System.out.println(cb.codigo+"-"+cb.nombre+"-"+cb.tipo+
                cb.tasa+" Lps."+cb.saldo);
    }
}
