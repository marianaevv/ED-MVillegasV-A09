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
public class nodeClass <T> {
    //Atributos
    nodeClass next;
    T data;
    
    public nodeClass (T data){
        this.data = data;
        this.next = null;
    }
    public nodeClass (){
        this.data = null;
        this.next = null;
    }
    public T getData(){
        return this.data;
    }
    public void setData(T d){
        this.data = d;
    }

    void setSiguiente(nodeClass pivot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
