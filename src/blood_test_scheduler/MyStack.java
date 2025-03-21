/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood_test_scheduler;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author AndrePontDeAnda - x23164034
 * 15/03/2025
 */
public class MyStack implements StackInterface, Serializable{
    
    //The stack class will be used to store only the last 5 people that have not attended their appointment.
    
    ArrayList<Person> attendance;
    
    public MyStack() {
        attendance = new ArrayList<>();        
    }
   
    @Override
    public boolean isEmpty(){
        return attendance.isEmpty();
        
    }
  @Override
    public void push(Object newItem){
        attendance.add(0, (Person)newItem); //need to downcast our Object to a String
    }
    

    @Override
    public Object pop(){
        if (!(attendance.isEmpty())){
            return attendance.remove(0);
        }else{
            return null;
        }
    }
    

    @Override
    public Object peek() {
      if (attendance.isEmpty()) {
          System.out.println("Empty list");
          return null;
      } else {    
          return attendance.get(0);
      }
    }
  


    @Override
    public int size(){
        return attendance.size();
    }

 
    @Override
    public String displayStack(){
       String details = ""; 
       
       if(attendance.isEmpty()){
           details = details.concat("No one to show");
       
       }else{
           for (int i = 0; i < attendance.size(); i++){
               Person temp = attendance.get(i);
               details = details + temp.toString() + "\n";
           }
       }return details;
    }
       
    
       
    }

    
