package com.mycompany.schoolmarket.gui;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.mycompany.schoolmarket.boundary.SchoolMarket;
import com.mycompany.schoolmarket.entity.Student;
import com.mycompany.schoolmarket.entity.StudentClass;

public class StudentSubscriptionGui {

    public static void StudentSubscription(JTextField txFirstName, JTextField txLastName, JTextField txAge, JTextField txEmail, JList<StudentClass> lstClassesList, JTextPane tpShowStudent, JLabel lbLogMessage){
        
        
        
        String newStudent = "Le credenziali del nuovo studente sono: \n";

        // Dati studente
        String firstName = txFirstName.getText();
        String lastName = txLastName.getText();
        String email = txEmail.getText();
        String age = txAge.getText();
        int ageNum = Integer.parseInt(age);
        StudentClass ci = SchoolMarket.getClass(lstClassesList.getSelectedValue().getIdClass());

        // Registrazione studente
        Student str = SchoolMarket.studentRegistration(firstName, lastName, ageNum, email, null, ci);
        
        // Integrazione dati studente nella casella di log
        newStudent += str.toString();
        System.out.println(newStudent);
        newStudent = tpShowStudent.getText() + "\n" + newStudent;
        tpShowStudent.setText(newStudent);
        txFirstName.setText("");
        txLastName.setText("");
        txAge.setText("");
        txEmail.setText("");
        
        // Messaggio finale di conferma
        lbLogMessage.setText("Studente aggiunto con successo!");
    }
}
