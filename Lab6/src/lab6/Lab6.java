/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author 1705848
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue test = new Queue();
        
        test.add("test");
        test.add("test2");
        test.add("test3");
        
        System.out.println(test.isWaiting("test5"));
        
        
    }
    
}
