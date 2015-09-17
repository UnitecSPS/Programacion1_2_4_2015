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
public class BatallaGalactica {
    static Marciano marcianos[] = new Marciano[5];
    
    public static void main(String[] args) {
        
        marcianos[0] = new Marciano("Alf");
        marcianos[1] = new Marciano("Marvin");
        marcianos[2] = new Marciano("Erick");
        marcianos[3] = new Marciano("Martian");
        marcianos[4] = new Marciano("Messi");
        
        imprimir();
    }
    
    public static void imprimir(){
        for(Marciano mar : marcianos){
            if(mar != null)
                mar.atacar();
        }
        
        System.out.println("Cuantos marcianos hay: " + 
                Marciano.contador);
    }
}
