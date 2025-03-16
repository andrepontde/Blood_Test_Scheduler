/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blood_test_scheduler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class SchedulerGUI extends javax.swing.JFrame {

    LinkedListInterface SLL;
    static PQInterface PQ;
    StackInterface ST;

    /**
     * Creates new form SchedulerGUI
     */
    public SchedulerGUI() {
        initComponents();
        SLL = new SinglyLinked_List();
        PQ = new PriorityQueue();
        ST = new MyStack();
        Loadpatients();
    }

    public void Loadpatients() {
        FileInputStream fStream;
        ObjectInputStream oStream;
        try {
            File l;
            l = new File("LinkedList.dat");
            File q;
            q = new File("PriorityQueue.dat");
            File s;
            s = new File("AStack.dat");
            fStream = new FileInputStream(l);
            oStream = new ObjectInputStream(fStream);
            SLL = (LinkedListInterface) oStream.readObject();
            oStream.close();

            fStream = new FileInputStream(q);
            oStream = new ObjectInputStream(fStream);

            PQ = (PQInterface) oStream.readObject();
            oStream.close();

            fStream = new FileInputStream(s);
            oStream = new ObjectInputStream(fStream);

            ST = (StackInterface) oStream.readObject();
            oStream.close();

            System.out.println("Patients fetched correctly");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Unable to fetch patients, error:" + e);
        }

        //Added default values for user testing 
//        SLL.add(new Person("Andre", "Pont", "ap@gmail.com", "Dr. Smith", 22, "urgent", false));
//        SLL.add(new Person("Adrian", "Rey", "ar@gmail.com", "Dr. Johnson", 23, "low", true));
//        SLL.add(new Person("Elena", "Martinez", "em@gmail.com", "Dr. Thompson", 67, "medium", false));
//        SLL.add(new Person("Lucas", "Fernandez", "lf@gmail.com", "Dr. Garcia", 45, "low", true));
//        SLL.add(new Person("Emma", "Thompson", "et@gmail.com", "Dr. Brown", 55, "urgent", false));
//        SLL.add(new Person("Jorge", "Lopez", "jl@gmail.com", "Dr. White", 30, "medium", true));
//        SLL.add(new Person("Sophia", "Garcia", "sg@gmail.com", "Dr. Wilson", 70, "low", false));
//        SLL.add(new Person("Daniel", "Smith", "ds@gmail.com", "Dr. Martinez", 60, "urgent", true));
//        SLL.add(new Person("Olivia", "Brown", "ob@gmail.com", "Dr. Taylor", 40, "medium", false));
//        SLL.add(new Person("Henry", "Wilson", "hw@gmail.com", "Dr. Clark", 50, "low", true));
//        SLL.add(new Person("Isabella", "Hernandez", "ih@gmail.com", "Dr. Hernandez", 33, "urgent", false));
//        SLL.add(new Person("William", "Taylor", "wt@gmail.com", "Dr. Lopez", 28, "medium", true));
//        SLL.add(new Person("Charlotte", "White", "cw@gmail.com", "Dr. Gonzalez", 72, "low", false));
//        SLL.add(new Person("James", "Clark", "jc@gmail.com", "Dr. Carter", 48, "urgent", true));
//        SLL.add(new Person("Lucas", "Miller", "lm@gmail.com", "Dr. Adams", 36, "medium", false));
//          
//        Calling recursive function to populate priority queue with linked list
//        loadRec(SLL, SLL.size());
    }

    //Recursive function to iterate through the sinly linked list and add each element to the Priority Queue
    public static void loadRec(LinkedListInterface myList, int x) {
        if (x == 0) {
            return;
        }
        Person temp = (Person) myList.get(x - 1);
        PQ.enqueue(temp);
        loadRec(myList, x - 1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        addBTN = new javax.swing.JButton();
        dequeueBTN = new javax.swing.JButton();
        stackDisplayBTN = new javax.swing.JButton();
        sllDisplayBTN = new javax.swing.JButton();
        pqDisplayBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addBTN.setBackground(new java.awt.Color(102, 102, 255));
        addBTN.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        dequeueBTN.setBackground(new java.awt.Color(102, 102, 255));
        dequeueBTN.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        dequeueBTN.setText("Process next patient");
        dequeueBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dequeueBTNActionPerformed(evt);
            }
        });

        stackDisplayBTN.setBackground(new java.awt.Color(102, 102, 255));
        stackDisplayBTN.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        stackDisplayBTN.setText("Show missing appointments");
        stackDisplayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stackDisplayBTNActionPerformed(evt);
            }
        });

        sllDisplayBTN.setBackground(new java.awt.Color(102, 102, 255));
        sllDisplayBTN.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        sllDisplayBTN.setText("Show all patients");
        sllDisplayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sllDisplayBTNActionPerformed(evt);
            }
        });

        pqDisplayBTN.setBackground(new java.awt.Color(102, 102, 255));
        pqDisplayBTN.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        pqDisplayBTN.setText("Display current queue");
        pqDisplayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pqDisplayBTNActionPerformed(evt);
            }
        });

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pqDisplayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dequeueBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sllDisplayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stackDisplayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dequeueBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pqDisplayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sllDisplayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stackDisplayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        //JPanels created with the aid of the youtuber choobtrails: https://www.youtube.com/watch?v=oPruCxQAQSs
        //This series of videos explain perfectly how to create a pane with code

        //Create JPanel to hold input fields
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        //Input fields
        JTextField fNameTF = new JTextField(15);
        JTextField lNameTF = new JTextField(15);
        JTextField emailTF = new JTextField(15);
        JTextField GPTF = new JTextField(15);
        JTextField ageTF = new JTextField(5);
        JComboBox<String> cmbPriority = new JComboBox<>(new String[]{"Urgent", "Medium", "Low"});
        JCheckBox chkHospitalWard = new JCheckBox("Comes from Hospital Ward");

        //Add components to panel
        panel.add(new JLabel("First Name:"));
        panel.add(fNameTF);
        panel.add(new JLabel("Last Name:"));
        panel.add(lNameTF);
        panel.add(new JLabel("Email:"));
        panel.add(emailTF);
        panel.add(new JLabel("GP Details:"));
        panel.add(GPTF);
        panel.add(new JLabel("Age:"));
        panel.add(ageTF);
        panel.add(new JLabel("Priority:"));
        panel.add(cmbPriority);
        panel.add(chkHospitalWard);

        // Show JOptionPane with input panel
        int result = JOptionPane.showConfirmDialog(null, panel, "Add Patient", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            try {
                String firstName = fNameTF.getText();
                String lastName = lNameTF.getText();
                String email = emailTF.getText();
                String GPdetails = GPTF.getText();
                int age = Integer.parseInt(ageTF.getText());
                String priority = (String) cmbPriority.getSelectedItem();
                boolean hospitalWard = chkHospitalWard.isSelected();

                Person newPatient = new Person(firstName, lastName, email, GPdetails, age, priority, hospitalWard);

                SLL.add(newPatient);
                PQ.enqueue(newPatient);

                JOptionPane.showMessageDialog(null, "Patient added successfully!");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid age.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }

        }

        try {
            File l;
            l = new File("LinkedList.dat");
            File q;
            q = new File("PriorityQueue.dat");
            FileOutputStream fStream;
            ObjectOutputStream oStream;

            fStream = new FileOutputStream(l);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(SLL);
            oStream.close();

            fStream = new FileOutputStream(q);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(PQ);
            oStream.close();

            System.out.println("Patient added succesfully!\n");
        } catch (IOException e) {
            System.out.println("Patient was not saved" + e);
        }

    }//GEN-LAST:event_addBTNActionPerformed

    private void pqDisplayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pqDisplayBTNActionPerformed
        // Will show the queue, how many people are on the queue and time to get them:
        displayTA.setText(PQ.printPQueue());

    }//GEN-LAST:event_pqDisplayBTNActionPerformed

    private void dequeueBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dequeueBTNActionPerformed
        if (PQ.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No patients in the queue");
            return;
        }
        Person temp = (Person) PQ.dequeue();

        String answer = JOptionPane.showInputDialog(null, "Did the patient " + temp.getfName() + " attend their appointment? (Yes/No)");

        if (answer != null) {
            if (answer.equalsIgnoreCase("no")) {
                ST.push(temp);
                JOptionPane.showMessageDialog(null, temp.getfName() + " Patient absence noted");

                try {
                    File s;
                    s = new File("AStack.dat");
                    
                    FileOutputStream fStream;
                    ObjectOutputStream oStream;

                    fStream = new FileOutputStream(s);
                    oStream = new ObjectOutputStream(fStream);

                    oStream.writeObject(ST);
                    oStream.close();
                    File q;
                    q = new File("PriorityQueue.dat");

                    fStream = new FileOutputStream(q);
                    oStream = new ObjectOutputStream(fStream);

                    oStream.writeObject(PQ);
                    oStream.close();

                    System.out.println("Patient added succesfully to blackList\n");
                } catch (IOException e) {
                    System.out.println("Patient was not saved" + e);
                }

            } else {
                JOptionPane.showMessageDialog(null, temp.getfName() + " attended their appointment.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No response recorded. The patient was not processed.");
        }
    }//GEN-LAST:event_dequeueBTNActionPerformed

    private void sllDisplayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sllDisplayBTNActionPerformed
        // TODO add your handling code here:
        displayTA.setText("Patients in order of arrival: \n");
        displayTA.append(SLL.printList());
    }//GEN-LAST:event_sllDisplayBTNActionPerformed

    public void noShowRec(StackInterface theStack, int count) {
        if (count == 0 || theStack.isEmpty()) {
            return;
        }
        Person temp = (Person) theStack.pop();
        displayTA.append(temp.toString() + "\n");
        noShowRec(theStack, count - 1);
    }

    private void stackDisplayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stackDisplayBTNActionPerformed
        StackInterface tempStack = new MyStack();
        StackInterface backupStack = new MyStack();

        while (!ST.isEmpty()) {
            Person temp = (Person) ST.pop();
            tempStack.push(temp);
            backupStack.push(temp);
        }
        displayTA.setText("Patients that did not show up: \n");
        noShowRec(tempStack, 5);

        while (!backupStack.isEmpty()) {
            Person temp = (Person) backupStack.pop();
            ST.push(temp);
        }
    }//GEN-LAST:event_stackDisplayBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchedulerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JButton dequeueBTN;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pqDisplayBTN;
    private javax.swing.JButton sllDisplayBTN;
    private javax.swing.JButton stackDisplayBTN;
    // End of variables declaration//GEN-END:variables
}
