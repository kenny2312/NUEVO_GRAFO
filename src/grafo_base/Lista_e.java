/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo_base;

import java.util.Scanner;

/**
 *
 * @author Keny
 */
public class Lista_e {

    Nodo cabecera; //NODO CABECERA
 int c=0;
    public void add(Nodo newNodo) {
        Nodo tmp = cabecera; // Declaramos un nodo temporal que va a se igual a la cabecera 

        if (tmp == null) { //Conidicion para saber si en la cabecera hay o no un nodo ingresado
            cabecera = newNodo; // Si aes asi 

           // cabecera.siguiente = null;
        } else {
            if (cabecera.siguiente == null) {

                cabecera.siguiente = newNodo;
            } else {
                while (tmp.siguiente != null) {
                    System.out.println("entro");
                    tmp = tmp.siguiente;//le pones null al temporL final
                    c++;
                }
                System.out.println("salio");
                tmp.siguiente = newNodo;
                
            }
        }

    }

    

    public void listar() {
        Nodo temp = cabecera;

        while (temp != null) {
            System.out.print("Nodo -->");
            System.out.println("" + temp.p.getNombre());
            System.out.println("");
            temp = temp.siguiente;

        }

    }

    Scanner ns = new Scanner(System.in);

    public void insertar() {
        Nodo nodo = new Nodo();
        String nombre;
        String apellido;
        System.out.println("ingrese nombre");
        nombre = ns.next();
        System.out.println("ingrese apellido");
        apellido = ns.next();
        nodo.p.setNombre(nombre);
        nodo.p.setApellido(apellido);

        add(nodo);

    }

    public void Es_vacia() {
     Nodo tmp = cabecera;
         if(tmp==null){
             System.out.println("la listar es vacia");
         }
        

    }
    
    
    public void eliminar(String nombre){
        
     boolean encontrado=false;
     if(cabecera.p.getNombre().compareTo(nombre)==0){
         cabecera= cabecera.siguiente;
         encontrado=true;
     }else{
         Nodo tmp,ant;
         ant=cabecera;
         tmp=cabecera.siguiente;
         
         while(tmp!=null &&tmp.p.getNombre().compareTo(nombre)!=0){
             ant=ant.siguiente;
             tmp=tmp.siguiente;
             encontrado=true;
             
             
         }
         if(tmp!=null){
             ant.siguiente=tmp.siguiente;
             encontrado=true;
             if(tmp.siguiente==null){
                 encontrado=true;
                 tmp=ant;
             }
         }
         //cebolla
     }
     
    }
    public void buscar(String nombre){
        
        Nodo temp = cabecera;

        while (temp != null) {
   if (nombre.equals(temp.p.getNombre())){
       System.out.println("Apellido: -->" + temp.p.getApellido());
       break;
   }
            

            temp = temp.siguiente;

        }
        
        
        
        
        
        
    }
   
 
        
       
         
        
    }


