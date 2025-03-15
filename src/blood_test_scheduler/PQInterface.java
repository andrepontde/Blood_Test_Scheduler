/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package blood_test_scheduler;

/**
 *
 * @author AndrePontDeAnda
 */
public interface PQInterface {
    public void enqueue(String key, Object element);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public String printPQueue();
}
