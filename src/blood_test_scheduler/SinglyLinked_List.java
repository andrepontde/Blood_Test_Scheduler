/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood_test_scheduler;

import java.io.Serializable;

/**
 * @author AndrePontDeAnda - x23164034 15/03/2025
 */
public class SinglyLinked_List implements LinkedListInterface, Serializable {

    //This class will be used to store the data of every single patient, regardless of their priority or attendance.
    //Uses all the same functions for the SLL's covered in class
    int size;
    Person curr, prev, head;

    public SinglyLinked_List() {
        size = 0;
        curr = head;
        prev = null;
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        setCurrent(index);
        return curr;
    }

    @Override
    public void remove(int index) {
        if (size == 0) {

            return;
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            setCurrent(index);
            if (curr != null && prev != null) {
                prev.setNext(curr.getNext());
            }
        }
        size--;
    }

    public void setCurrent(int index) {
        curr = head;
        prev = null;
        for (int i = 0; i < index && curr != null; i++) {
            prev = curr;
            curr = curr.getNext();
        }

//        System.out.println("This is the current Person:");
//        System.out.println(curr);
    }

    @Override
    public void add(Object theElement, int index) {
        Person temp = (Person) theElement;

        if (size == 0) {
            head = temp;
        } else if (index == 0) {
            temp.setNext(head);
            head = temp;
        } else {
            setCurrent(index);
            if (prev != null) {
                prev.setNext(temp);
            }
            temp.setNext(curr);
        }
        size++;
    }

    @Override
    public void add(Object theElement) {
        Person temp = (Person) theElement;
        if (size == 0) {
            head = temp;
        } else {
            setCurrent(size - 1);
            curr.setNext(temp);
        }
        size++;
    }

    //iterative print function, replaced by recursive alternative
//    @Override
//    public String printList() {
//        String details = "";
//        curr = head;
//        
//        while (curr != null) {
//            details = details + curr.toStringWgp() + "\n";
//            curr = curr.getNext();
//        }
//
//        return details;
//    }
    
    
    public String recFunc(int x) {
        //Base case to stop the recursion when all elements have been fetched
        if (x == size()) {
            return "";
        }
        Person temp = (Person) get(x);
        return temp.toStringWgp() + "\n" + recFunc(x + 1);
    }

    @Override
    public String printList() {
        return recFunc(0); //Start recursion from 0
    }

}
