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
                    tmp = tmp.siguiente;//le pones null al temporL
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

            System.out.println("" + temp.p.getNombre());

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

        System.out.println("la listar es vacia");

    }
    
    
    public void eliminar(String nombre){
        
        Nodo temp = cabecera;

        while (temp != null) {
   if (nombre.equals(temp.p.getNombre())){
       System.out.println("" + temp.p.getApellido());
       
       
       
       
   }
            

            temp = temp.siguiente;
        
      }  
    }
    public void buscar(String nombre){
        
        Nodo temp = cabecera;

        while (temp != null) {
   if (nombre.equals(temp.p.getNombre())){
       System.out.println("" + temp.p.getApellido());
       break;
   }
            

            temp = temp.siguiente;

        }
        
        
        
        
        
        
    }
   
 
        
       
         
        
    }


