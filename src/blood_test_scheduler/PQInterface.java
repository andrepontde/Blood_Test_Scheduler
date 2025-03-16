/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package blood_test_scheduler;

/**
 * @author AndrePontDeAnda - x23164034
 * 15/03/2025
 */
public interface PQInterface {

    //Interface made to define functions needed in the Priority Queue functionality for the PriorityQueue Class 
    
    public void enqueue(Object element);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public String printPQueue();
}
