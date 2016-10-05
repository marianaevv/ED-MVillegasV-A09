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
public class EDCircularList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circularListClass list = new circularListClass();
        list.insert(5);
        list.insert(7);
        
        list.showList();
  
  list.eNODE(8);
    
    
        System.out.println("");
        System.out.println("");
    list.showList();
    }
    
}
