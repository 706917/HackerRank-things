package Revolent;

import java.util.*;

public class Solution{
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
	
		Map<String, Integer> map = new HashMap<>();
		
		int k = 5;
		
		 MyCircularQueue obj = new MyCircularQueue(k);
		 
		 for (int i = 1; i<6; i++) {
		 boolean param_1 = obj.enQueue(i);
		 }
		 System.out.println(obj.queue.toString().substring(0,0));
		 System.out.println("head: " + obj.head);
		 System.out.println("tail: " + obj.tail);
		 System.out.println("size: " + obj.queue.size());
		 System.out.println();
		 
		 boolean param_2 = obj.deQueue();
		 System.out.println(obj.queue.toString());
		 System.out.println("head: " + obj.head);
		 System.out.println("tail: " + obj.tail);
		 System.out.println("size: " + obj.queue.size());
		 System.out.println();
		 
		 int param_3 = obj.Front();
		 System.out.println(obj.queue.toString());
		 System.out.println("head: " + obj.head);
		 System.out.println("tail: " + obj.tail);
		 System.out.println("size: " + obj.queue.size());
		 System.out.println();
		 
		 int param_4 = obj.Rear();
		 System.out.println(obj.queue.toString());
		 System.out.println("head: " + obj.head);
		 System.out.println("tail: " + obj.tail);
		 System.out.println("size: " + obj.queue.size());
		 System.out.println();
		 
		 boolean param_5 = obj.isEmpty();
		 boolean param_6 = obj.isFull();
	}
}

class MyCircularQueue {
    
    List<Integer> queue;
        
    int head;
    int tail;
        
    int k;
    

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.k = k;
        queue = new ArrayList<Integer>(k);
        head = 0;
        tail = -1;
                 
        
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        
        if(!isFull() && tail<k){
            queue.add(value);
            tail++;            
            return true;
        }
        else return false;
        
        
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(!isEmpty()){
            queue.remove(head); 
            tail--;
            return true;
        }
        else return false;   
        
    }
    
    /** Get the front item from the queue. */
    public int Front() {        
        if(!isEmpty())    return queue.get(0);
        
        else return -1;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        
       if(!isEmpty())   return queue.get(tail);
       else return -1;
        
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        boolean flag = false;
        if(queue.size()==0) flag = true;
        return flag;        
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
         boolean flag = false;
        if(queue.size()==k) flag = true;
        
        return flag;
        
    }
}
