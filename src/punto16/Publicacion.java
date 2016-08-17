/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punto16;

import java.util.Scanner;

/**
 *
 * @author practi25
 * 
 * 
 */
public class Publicacion {
    private String titulo;
    private String precio;
    private Scanner lector;
    
    public void settitulo(){
        lector = new Scanner(System.in);
        System.out.println("Ingrese titulo");
        this.titulo = lector.nextLine();
    }
    
    public void setprecio(){
        lector = new Scanner(System.in);
        System.out.println("Ingrese Precio");
        this.precio = lector.next();
    }
    
    public void mostrar(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Precio: "+this.precio);
    }
    
}
