package com.mycompany.schoolmarket.gui;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import com.mycompany.schoolmarket.boundary.SchoolMarket;
import com.mycompany.schoolmarket.entity.Student;
import com.mycompany.schoolmarket.entity.StudentClass;

public class StudentSubscriptionGui {

    public static Student StudentSubscription(String firstName, String lastName, int ageNum, String email, StudentClass ci) {
        // Student registration (Method created on SchoolMarket.class under boundary
        // package)
        Student str = SchoolMarket.studentRegistration(firstName, lastName, ageNum, email, null, ci);
        return str;
    }

    public static void logMessage(Student str, JTextPane tpShowStudent, JLabel lbLogMessage) {

        String newStudent = " \nLe credenziali del nuovo studente sono: \n";

        // Data insert on GUI log window
        newStudent += " \nNOME: " + str.getFname() + " \nCOGNOME: " + str.getLname() + " \nCLASSE E SEZIONE: " + str.getClassSection() + " \nEMAIL: " + str.getEmail();
        System.out.println(newStudent);
        newStudent = tpShowStudent.getText() + "\n" + newStudent;
        tpShowStudent.setText(newStudent + " \n\nUtente aggiunto con successo!");
    }
}
