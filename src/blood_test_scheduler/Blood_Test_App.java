/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blood_test_scheduler;

/**
 * @author AndrePontDeAnda - x23164034
 * 15/03/2025
 */
public class Blood_Test_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListInterface SLL = new SinglyLinked_List();
        
        Person temp = new Person("Andre", "Pont", "ap@gmail.com", 22, "high");
        Person temp2 = new Person("Adrian", "Rey", "ar@gmail.com", 23, "low");
        
        
        SLL.add(temp, 1);
        SLL.add(temp2);
        
        System.out.println(SLL.get(1));
        
        
    }
    
}
