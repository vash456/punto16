/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punto16;

import java.util.Scanner;

/**
 *
 * @author practi25
 * punto16: Una editorial de libros y discos desea crear fichas que almacenen el título y el precio de
cada publicación. Crear la correspondiente clase (denominada Publicación) que implemente
los datos anteriores. A partir de esta clase, diseñar dos clases derivadas: Libro, con el
número de páginas, año de publicación y precio; y la clase Disco, con duración en minutos y
precio Cada una de las tres clases tendrá una función mostrar(), para visualizar sus datos.
Escribir un programa que cree instancias de las clases Libro y Disco, solicite datos al usuario
y a continuación los visualice.
 */
public class Punto16 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner lector = new Scanner(System.in);
    static Libro libro = new Libro();
    static Disco disco = new Disco();
    
    public static void main(String[] args) {
        
        int opcion;
        int opcion2;
        int opcion3;
        do{
            System.out.println("\nEscoja publicacion:");
            System.out.println("1) Libro");
            System.out.println("2) Disco");
            System.out.println("3) Salir");
            opcion = lector.nextInt();
            
            if(opcion == 1){
                do{
                    System.out.println("\nIngresar las siguientes opciones del Libro:");
                    System.out.println("1) Titulo");
                    System.out.println("2) Precio");
                    System.out.println("3) Numero de paginas");
                    System.out.println("4) Año de publicacion");
                    System.out.println("5) Mostrar");
                    System.out.println("6) Menu principal");
                    opcion2 = lector.nextInt();
                    switch(opcion2){
                        case 1: libro.settitulo();break;
                        case 2: libro.setprecio();break;
                        case 3: libro.setnum_pag();break;
                        case 4: libro.setaño_publicacion();break;
                        case 5: libro.mostrar();break;
                        default: break;
                    }
                }while(opcion2 != 6);
            }else if(opcion == 2){
                do{
                    System.out.println("\nIngresar las siguientes opciones del Disco:");
                    System.out.println("1) Titulo");
                    System.out.println("2) Precio");
                    System.out.println("3) Duracion(min)");
                    System.out.println("4) Mostrar");
                    System.out.println("5) Menu principal");
                    opcion3 = lector.nextInt();
                    switch(opcion3){
                        case 1: disco.settitulo();break;
                        case 2: disco.setprecio();break;
                        case 3: disco.setduracion_min();break;
                        case 4: disco.mostrar();break;
                        default: break;
                    }
                }while(opcion3 != 5);
            }else if(opcion == 3){
                System.out.println("\nfinalizando programa");
            }else System.out.println("\nopcion no valida");
            
        }while(opcion != 3);
        
        
    }
}
