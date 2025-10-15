/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PinedaMuñoz131025;

/**
 *
 * @author alans
 */
public class ListaEnlazada {
    
    private Nodo cabeza;
    
    //METODO PARA AGREGAR UNA DATO AL FINALD DE LA LISTA
    public void agregarAlFinal(int dato){
    
        Nodo nuevoNodo = new Nodo(dato);
        
        if(cabeza == null){
            cabeza = nuevoNodo;
            
            
        }else{
        
            Nodo actual = cabeza;
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        
    }
    
    
    //METODO APRA AGREGAR DUN DATO O DATOS AL PRINCIPIO DE LA LISTA
    public void agregarAlIncio(int dato){
        
      Nodo nuevoNodo = new Nodo(dato);
      nuevoNodo.siguiente = cabeza;
      cabeza = nuevoNodo;
    }
    
    
    //METODO PARA AGREGAR DATOS EN LA LISTA 
    //(YA SEA EN LA POSICIÓN MEDIA O EN CUALQUIER OTRA POSICIÓN ADEMÁS DEL PRINCIPIO Y EL FIN)
    public void agregarEn(int posicion, int data){
        
        Nodo nuevoNodo = new Nodo(data);
        if(posicion == 0){
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        }
        
        Nodo actual = cabeza;
        for(int i = 0; i< posicion -1 && actual != null; i++){
            actual = actual.siguiente;
        }
        
        if(actual == null){
            System.out.println("Posicion fuera del rango");
        }
        
        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente = nuevoNodo;
        
    }
    
    //METODO PARA ELIMINAR LOS DATOS QUE FUERON INGRESADOS
    public void eliminar(int dato){
        if (cabeza == null){
            System.out.println("La lista esta vacia, no se pueden eliminar datos");
        }
        
        if(cabeza.data == dato){
            cabeza = cabeza.siguiente;
        }
        
        Nodo actual = cabeza;
        while(actual.siguiente != null && actual.siguiente.data != dato){
            actual = actual.siguiente;
        }
        
        if(actual.siguiente != null){
            actual.siguiente = actual.siguiente.siguiente;
        }
        
    }
    
    //METODO PARA MOSTRAR LOS DATOS QUE FUERON INGRESADOS
    public void mostrar(){
        Nodo actual = cabeza;
        while(actual != null){
            System.out.println(actual.data+" -> ");
            actual = actual.siguiente;
        }
        
        System.out.println("null");
    }
    
    
    
}
