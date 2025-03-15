/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood_test_scheduler;

/**
 * @author AndrePontDeAnda - x23164034
 * 15/03/2025
 */
public class Person {
    private String fName, lName, email;
    private int age;
    private String priority;
    private Person next;
    private Person prev;

    public Person() {
    fName = "";
    lName = "";
    email = "";
    age = 0;
    priority = "low";
    }
    
    public Person(String fName, String lName, String email, int age, String priority) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.age = age;
        this.priority = priority;
    }

    public Person(Person next, Person prev) {
        this.next = next;
        this.prev = prev;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    public void setPrev(Person prev) {
        this.prev = prev;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPriority() {
        return priority;
    }

    public Person getNext() {
        return next;
    }

    public Person getPrev() {
        return prev;
    }

    @Override
    public String toString() {
        return "Person{" + "fName=" + fName + ", lName=" + lName + ", email=" + email + ", age=" + age + ", priority=" + priority + '}';
    }
    
    
    
}
