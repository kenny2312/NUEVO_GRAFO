/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo_base;

/**
 *
 * @author kenny
 */
public class arista_arcos {
    
   
    int destino;
   private  Nodo nodo;
   
   int matriz[][] = new int[5][5];
   Nodo lista_de_nodos []= new Nodo[5];

   
   
   
   public void crearEstructura(){
          for (int i = 0; i < 5; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                matriz[i][j]=0;
                
            }
        }
          
         
   }
   public void listar(){
       for (int i = 0; i < 5; i++) {
           
            for (int j = 0; j < matriz.length; j++) {
                
                System.out.print("|"+matriz[i][j]);    
                
            }
            System.out.println("|");
        }
   }
   int i=0;
      public void agregar_nodo() {
          /*
        for (int i = 0; i < lista_de_nodos.length; i++) {
            if (lista_de_nodos[i] == null) {
                lista_de_nodos[i] = nodo;
            }
        }
*/
          lista_de_nodos[i++] = nodo;
          
    }
    public void agregar(  int x,int destino,Nodo nodo){
     
     int interno=0;
        for (int i = 0; i < 5; i++) {
            if(interno==1){
                interno=0;
            break; 
            }
                
            if(lista_de_nodos [i]==null){
                lista_de_nodos [i]=nodo;
           

            for (int j = 0; j < matriz.length; j++) {
             
              
                    
               
               if(destino >=0 &&lista_de_nodos [destino]!=null){
                    
                  
                         matriz[i][destino]=1;
                       
                       interno=1;
                    break;
  
                }else{
                   System.out.println("nodo no conectado");
                    interno=1;
                    break;
               }
             
                }
            }
            
             }
        }
         
 
    

    public void agregar_Camino_nuevo( Nodo n , int nuevo_destino){
        
        
         for (int i = 0; i < 10; i++) {
            if(lista_de_nodos [i]==n){

            for (int j = 0; j < matriz.length; j++) {
               
                if(nuevo_destino!=0){
                    
                    
                   
                         matriz[i][destino]=1;
                    
                    
                     
                }
               
                
            }
            
             }
        }
        
       
    }
    
     public void listar_nodos(){
            
         for (int i = 0; i < lista_de_nodos.length; i++) {
             if(lista_de_nodos[i]!=null){
                   System.out.println("nodo:"+i);
             System.out.println(""+lista_de_nodos[i].p.nombre);
             System.out.println(""+lista_de_nodos[i].p.apellido);
             System.out.println("--------------------------");
             }
           
             
         }
            
        }
    
    
    
}
