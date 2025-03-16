/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood_test_scheduler;

import java.io.Serializable;

/**
 * @author AndrePontDeAnda - x23164034
 * 15/03/2025
 */
public class Person implements Serializable{
    
    //The Person class will be used as a Node for every ADT, for sinly linked lists it uses the next and function as well
    //It stores all of the nessesary data for a patient
    
    private String fName, lName, email, GPDetails;
    private boolean hospitalWard;
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
    
    public Person(String fName, String lName, String email, String GPDetails,int age, String priority, boolean ward) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.age = age;
        this.priority = priority;
        hospitalWard = ward;
        this.GPDetails = GPDetails;
    }

    public Person(Person next, Person prev) {
        this.next = next;
        this.prev = prev;
    }

    public void setHospitalWard(boolean HospitalWard) {
        this.hospitalWard = HospitalWard;
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
    
    public void setGPDetails(String GPDetails) {
        this.GPDetails = GPDetails;
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

    public boolean isHospitalWard() {
        return hospitalWard;
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

    public String getGPDetails() {
        return GPDetails;
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
        return  lName + ", " +fName +", email=" + email + ", hospitalWard:" + hospitalWard + ", age:" + age + ", priority:" + priority;
    }
    
    
    //Different toString method to include GPDetails to try to not add to much information when showing the queue
    public String toStringWgp() {
        return fName + ", " + lName + ", email="  +email + "\n GP Details: "+ GPDetails+ "\n"+ "hospitalWard:" + hospitalWard + ", age:" + age + ", priority:" + priority +"\n";
    }

    
    
    
    
}
