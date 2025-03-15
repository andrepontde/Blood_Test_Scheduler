/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood_test_scheduler;

import java.util.ArrayList;

/**
 * @author AndrePontDeAnda - x23164034
 * 15/03/2025
 */
public class PriorityQueue implements PQInterface{
    ArrayList<Person> people;

    public PriorityQueue() {
        people = new ArrayList<>();
    }
    
    public int getIndex(String priority){
        int index;
        
        
//        low, medium, urgent
//                if curr = low & priority = medium
//        m
//                        
//        0h, 1m, 2m, 3m, 4l, 5l  
//        

        for (index = 0; index < people.size(); index++){
            Person current = people.get(index);
            
            if (current.getPriority().equalsIgnoreCase("medium") && priority.equalsIgnoreCase("high")){
                return index;
            }else if (current.getPriority().equalsIgnoreCase("low") && priority.equalsIgnoreCase("medium")){
                return index;
            }
        }
        
        return index;
    }
    
    public void enqueue(String priority, Object element){
        int index = getIndex(priority);
        people.add(index, (Person)element);
    }
    
    
    public int size(){
        return people.size();
    }
    
    public boolean isEmpty(){
        return people.isEmpty();
    }
    
    public Object dequeue(){
        return people.remove(0);
    }
    public String printPQueue(){
        String details = "";
        
        for (int i = 0; i < people.size(); i++) {
            details = details + people.get(i).toString();
        }

        return details;
    }
}
