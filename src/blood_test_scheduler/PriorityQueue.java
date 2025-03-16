/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood_test_scheduler;

import java.util.ArrayList;

/**
 * @author AndrePontDeAnda - x23164034 15/03/2025
 */
public class PriorityQueue implements PQInterface {

    //The priority queue will be used to store a list of patients waiting to be attended, and their priority 
    //will be taken into account as well.
    ArrayList<Person> people;

    public PriorityQueue() {
        people = new ArrayList<>();
    }

    public int getValues(Person person) {
        //I decided to make the priority a score system for easier comparison when getting the index of a patient.

        int priVal = 0;

        //Urgency level factor
        switch (person.getPriority().toLowerCase()) {
            case "urgent":
                priVal += 50;
                break;
            case "medium":
                priVal += 30;
                break;
            case "low":
                priVal += 10;
                break;
        }

        //Hospital ward status, the most points are given to who comes from the hospital ward.
        if (person.isHospitalWard()) {
            priVal += 10;
        }

        return priVal;
    }

    //Finds the index according to the priority score
    public int getIndex(Person person) {
        int priorityVal = getValues(person);
        int index;

        for (index = 0; index < people.size(); index++) {
            Person current = people.get(index);
            int currentVal = getValues(current);

            if (priorityVal > currentVal) {
                return index;
            }

            if (priorityVal == currentVal) {
                if (person.getAge() > current.getAge()) {
                    return index;
                }
            }

        }

        //Return if there was no lower score than current value
        return index;
    }

    @Override
    public void enqueue(Object element) {
        //The enqueu function does not take as a parameter the priority since it is already included in the Person object.
        Person temp = (Person) element;
        int index = getIndex(temp);
        people.add(index, (Person) element);
    }

    @Override
    public int size() {
        return people.size();
    }

    @Override
    public boolean isEmpty() {
        return people.isEmpty();
    }

    @Override
    public Object dequeue() {
        return people.remove(0);
    }

    //Return a string of the people that are waiting to be attended
    @Override
    public String printPQueue() {
        String details = "";

        for (int i = 0; i < people.size(); i++) {
            details = details + people.get(i).toString() + "\n";
        }

        return details;
    }
}
