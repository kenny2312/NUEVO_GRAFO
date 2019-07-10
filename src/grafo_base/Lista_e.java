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

    Nodo cabecera;
    Nodo ultimo;

    public void add(Nodo newNodo) {
        Nodo tmp = cabecera;

        if (tmp == null) {
            cabecera = newNodo;

            cabecera.siguiente = null;
        } else {
            if (cabecera.siguiente == null) {

                cabecera.siguiente = newNodo;
            } else {
                while (tmp.siguiente != null) {
                    System.out.println("entro");
                    tmp = tmp.siguiente;
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

}
