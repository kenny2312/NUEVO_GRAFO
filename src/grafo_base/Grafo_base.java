/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo_base;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class Grafo_base {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        arista_arcos  al = new  arista_arcos();
        
      al.crearEstructura();
      Lista_e ll =new Lista_e();
      
    Nodo pp = new Nodo();
      
      
        Scanner teclado = new Scanner(System.in);
        int x=0;
        do{
           
            System.out.println("1.Agregar nodo");
            System.out.println("2.listar matriz de adyacencia");
            System.out.println("3.nuevo camino");
            System.out.println("4.listar nodos");
            System.out.println("5.con quien esta conectado");
            System.out.println("6.buscar nodo");
             System.out.println("7.listar salir");
            x=teclado.nextInt();
            switch (x) {
                case 1:
/*
                    int destino=0;
                    System.out.println("ingrese nombre del nodo");
                    
                  pp.p.nombre=teclado.next();
                  System.out.println("ingrese nombre 2 del nodo");
                  pp.p.apellido=teclado.next();
                  
                   System.out.println("destino");
                 destino=teclado.nextInt();
                 
                    al.agregar(0, destino, pp);
*/
                    ll.insertar();
                    
                    
                    break;
                    case 2:
                        
                     al.listar();
                    break;
                    case 3:
                 //   al.agregar_Camino_nuevo(n, x);
                    break;
                     case 4:
                 //   al.listar_nodos();
                          ll.listar();
                    break;
                     case 6:
                    //al.listar_nodos();
                         
                         String nombre = null ; 
                         System.out.println("ingrese nombre :");
                         nombre  = teclado.next();
                         ll.buscar(nombre);
                    break;
            }
            
            
        }while(x!=6);
        
        
    }
    
    
    
    
    
    
    
}
