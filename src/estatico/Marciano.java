/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico;

/**
 *
 * @author Aula
 */
public class Marciano {
    private String nombre;
    public static int contador=0;

    public Marciano(String nombre) {
        this.nombre = nombre;
        contador++;
    }
    
    public void atacar(){
        if(contador >= 5)
            System.out.println("Yo "+nombre+" Ataco!!");
        else
            System.out.println("Yo "+nombre+" Mejor me espero, ya que solo hay "+
                    contador+" marcianos incluyendome.");
    }
}
