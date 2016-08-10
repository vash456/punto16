/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punto16;

/**
 *
 * @author practi25
 */
public class Libro extends Publicacion{
    
    private int num_pag, año_publicacion;
    
    public Libro(String titulo, int precio){
        super(titulo,precio);
    }
    
    public void setnum_pag(int num_pag){
        this.num_pag = num_pag;
    }
    public void setaño_publicacion(int año_publicacion){
        this.año_publicacion = año_publicacion;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Numero de paginas: "+this.num_pag);
        System.out.println("Año de publicacion: "+this.año_publicacion);
    }
    
}
