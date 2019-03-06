/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.*;

/**
 *
 * @author 1705848
 */

public class Queue <T>{
    private LinkedList<T> list;

    public Queue() {
        this.list = new LinkedList<T>();
    }
    
    public int getLength(){
        return this.list.size();
    }
    
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    
    public void add(T add){
        this.list.add(add);
    }
    
    public T remove(){
        return this.list.removeFirst();
    }
    
    public T peek(){
        return this.list.peekFirst();
    }
    
    @Override
    public String toString(){
        return this.list.toString();
    }
    
    public int isWaiting(T t){
        if(this.list.contains(t)){
            return this.list.size() - this.list.indexOf(t) - 1;
        }
        
        else{
            return -1;
        }
    }
    
    
}
