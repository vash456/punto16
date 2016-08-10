/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punto16;

/**
 *
 * @author practi25
 */
public class Publicacion {
    private String titulo;
    private int precio;
    
    public Publicacion(String titulo, int precio){
        this.titulo = titulo;
        this.precio = precio;
    }
    
    public void mostrar(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Precio: "+this.precio);
    }
    
}
