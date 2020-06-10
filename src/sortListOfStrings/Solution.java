/*
 * Sort the given list of Strings based on length()
 */
package sortListOfStrings;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Solution {

	  public static void main (String[] args) {
	    System.out.println("Hello Java");
	    
	    List<String> list = new ArrayList<String>();
	    list.add("one");
	    list.add("anotherone");
	    list.add("three");
	    
	    Collections.sort(list);
	    
	    List<String> newList = returnNewList(list);
	    
	    System.out.print(newList.toString());
	    
	  }
	
	  
	     private static List<String> returnNewList(List<String> list){
	          
	          List<String> newList = new ArrayList<String>();
	        
	          HashMap<String, Integer> map = new HashMap<>();
	          
	          for (String el: list){
	            
	            map.put(el, el.length());
	          }
	          
	          List<Integer> sizes = new ArrayList<Integer>(map.values());       
	          
	          
	          Collections.sort(sizes);
	          
	          for (Integer size: sizes){
	        	  for(Entry<String, Integer> entry: map.entrySet()) {
	        		  if(entry.getValue() == size) {
	        			  newList.add(entry.getKey());
	        		  }
	        	  }  
	            
	          }
	          
	          return newList;
	        }   
	}

