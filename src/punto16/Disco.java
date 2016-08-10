/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punto16;

/**
 *
 * @author practi25
 */
public class Disco extends Publicacion{
    
    private int duracion_min;
    
    public Disco(String titulo, int precio){
        super(titulo,precio);
    }
    
    public void setduracion_min(int duracion_min){
        this.duracion_min = duracion_min;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Duracion(min): "+this.duracion_min);
    }
    
}
