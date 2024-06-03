package com.mycompany.schoolmarket.gui;

import java.math.BigDecimal;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.mycompany.schoolmarket.boundary.SchoolMarket;
import com.mycompany.schoolmarket.entity.Book;
import com.mycompany.schoolmarket.entity.BookCondition;
import com.mycompany.schoolmarket.entity.Student;
import com.mycompany.schoolmarket.entity.StudentClass;
import com.mycompany.schoolmarket.entity.Subject;

public class BookVendingGui {


    
    
    public static void BookVending(JTextField txBookName, JTextField txBookHealth, JSpinner spBookCost, JList<Student> lstStudentsList, JList<StudentClass> lstClassesBook, JList<Subject> lstSubjects, JTextPane tpShowStudent, JLabel lbLogMessage){
        
        String newBook = "Le credenziali del nuovo libro sono: \n";

        String bookName = txBookName.getText();
        BigDecimal cost = BigDecimal.valueOf((double) spBookCost.getValue());
        BookCondition bc = SchoolMarket.getBookCondition(txBookHealth.getText());
        Student st = SchoolMarket.getStudent(lstStudentsList.getSelectedValue().getIdStudent());
        StudentClass cl = SchoolMarket.getClass(lstClassesBook.getSelectedValue().getIdClass());
        Subject sb = SchoolMarket.getSubject(lstSubjects.getSelectedValue().getIdSubject());

        Book bv = SchoolMarket.bookVending(bookName, cost, bc, st, cl, sb);

        String newBookMsg =  "\n BOOK NAME: " + bv.getBookName() + "\n CLASS SECTION: " + bv.getClassSection() + "\n BY: " + bv.getStudent().getLname() + " " + bv.getStudent().getFname();
        newBook += newBookMsg;
        System.out.println(newBook);
        newBook = tpShowStudent.getText() + "\n" + newBook;
        tpShowStudent.setText(newBook);
        
        txBookName.setText("");
        txBookHealth.setText("");
        spBookCost.setValue(0);
        
        lbLogMessage.setText("Libro aggiunto con successo!");
    
        }


}
