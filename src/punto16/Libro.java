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
public class Libro extends Publicacion{
    private Scanner lector;
    private int num_pag, año_publicacion;
    
    public void setnum_pag(){
        lector = new Scanner(System.in);
        System.out.println("Ingrese el Numero de paginas");
        this.num_pag = lector.nextInt();
    }
    
    public void setaño_publicacion(){
        lector = new Scanner(System.in);
        System.out.println("Ingrese el Año de publicacion");
        this.año_publicacion = lector.nextInt();
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Numero de paginas: "+num_pag);
        System.out.println("Año de publicacion: "+año_publicacion);
    }
    
}
