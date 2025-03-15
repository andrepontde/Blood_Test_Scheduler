/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood_test_scheduler;

/**
 * @author AndrePontDeAnda - x23164034
 * 15/03/2025
 */
public class SinglyLinked_List implements LinkedListInterface {
    int size;
    Person curr, prev, head;

    public SinglyLinked_List() {
        size = 0;
        curr = head;
        prev = null;
        head = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        setCurrent(index);
        return curr;
    }

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

    public String printList() {
        StringBuilder details = new StringBuilder();
        curr = head;
        
        while (curr != null) {
            details.append(curr.toString()).append("\n");
            curr = curr.getNext();
        }

        return details.toString();
    }
}
