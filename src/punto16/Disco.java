/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punto16;

import java.util.Scanner;

/**
 *
 * @author practi25
 */
public class Disco extends Publicacion{
    private Scanner lector;
    private String duracion_min;
    
    public void setduracion_min(){
        lector = new Scanner(System.in);
        System.out.println("Ingrese la Duracion(min)");
        duracion_min = lector.next();
    }
    
    //mostrar disco
    public void mostrar(){
        super.mostrar();
        System.out.println("Duracion(min): "+duracion_min);
    }
    
}
