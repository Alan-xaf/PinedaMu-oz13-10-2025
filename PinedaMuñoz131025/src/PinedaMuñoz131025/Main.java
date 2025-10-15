/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PinedaMuñoz131025;

/**
 *
 * @author alans
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Nodo  primer_nodo = new Nodo(50);
        Nodo segundo_nodo = new Nodo(80);
        Nodo tercer_nodo = new Nodo(90);
        
        System.out.println(primer_nodo.data);
        System.out.println(segundo_nodo.data);
        System.out.println(tercer_nodo.data);


        primer_nodo.siguiente = segundo_nodo;
        segundo_nodo.siguiente = tercer_nodo;
        
        
            Nodo actual = primer_nodo; //NODO CABEZA = primer_nodo //Nodo head = primer nodo
            
            while(actual!= null){
            
                System.out.print(actual.data+" -> ");
                actual = actual.siguiente;
                
            }
            
            System.out.println("null");
            
            
            
            
            
            System.out.println();
            System.out.println("-----------------------");
            System.out.println();
            
            
            
            
            ListaEnlazada mi_lista = new ListaEnlazada();
            
            mi_lista.agregarAlIncio(10);
            mi_lista.agregarAlFinal(100);
            mi_lista.agregarEn(1, 50);
            
            mi_lista.mostrar();
        
        
    }
    
}
