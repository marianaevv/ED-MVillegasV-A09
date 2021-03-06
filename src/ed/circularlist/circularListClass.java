/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.circularlist;

/**
 *
 * @author Mariana Villegas
 */
public class circularListClass<T> {

    nodeClass pivot;

    public circularListClass() {
        pivot = null;
    }

    public void insert(T d) {
        nodeClass node = new nodeClass(d);
        if (!isEmpty()) {//Si no esta vacia
            //Insertamos nodo al inicio y recorremos el primero
            node.next = pivot;
            findLast().next = node;
            pivot = node;
            /* while(pivot.next != null){
             pivot = pivot.next;
         }
         pivot.next = node;*/

        } else {
            pivot = node;
            node.next = pivot;
        }
    }

    private boolean isEmpty() {
        return pivot == null;
    }

    private nodeClass findLast() {
        nodeClass aux = pivot;
        do {
            aux = aux.next;
        } while (aux.next != pivot);
        return aux;
    }

    public void showList() {
nodeClass aux;//declaramos dos variables auxiliares tipo nodeDL para guardar los valores de nuestros nodos
            aux = pivot;// aux1 sera igual a first  
        if (isEmpty()) {//Preguntamos si la lista esta llenanodeClass aux;//declaramos dos variables auxiliares tipo nodeDL para guardar los valores de nuestros nodos
            System.out.println("La lista está vacia");

        } else {
            
            do {
                System.out.print("[" + aux.getData() + "]" + "->");
                aux = aux.next;
            } while (aux.next != pivot.next);

        }

    }

    public nodeClass searchNode(T data) {
        nodeClass aux;
        if (isEmpty()) {//Si esta vacío retorna falso
            return null;
        } else {//Si contiene elementos 
            aux = pivot;//colocamos auxiliar en el pivote
            while (aux.data != data && aux != pivot) {//Mientras que no ecuentre el dato, recorre la lista
                aux = aux.next;
            }
            if (aux.data == data) {//Si  la informacion mandada coincide  con el auxiliar regresaremos el valor del auxiliar
                return aux;
            } else {//Si no regresamos nulo porque no se encontro el nodo
                return null;
            }

        }

    }

    
    public void eNode(T data){
        nodeClass aux;
        aux = pivot;
        while(aux.next != pivot && aux.data != data){
            aux = aux.next;
        }
        if(aux.next ==  pivot){
            System.out.println("No se encuentra el nodo");
        }
        if(aux.data == data){
            aux.next = aux.next.next;
        }
    }

}
