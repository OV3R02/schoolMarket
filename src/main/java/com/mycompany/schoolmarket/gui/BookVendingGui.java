package com.mycompany.schoolmarket.gui;

import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import com.mycompany.schoolmarket.boundary.SchoolMarket;
import com.mycompany.schoolmarket.entity.Book;
import com.mycompany.schoolmarket.entity.BookCondition;
import com.mycompany.schoolmarket.entity.Student;
import com.mycompany.schoolmarket.entity.StudentClass;
import com.mycompany.schoolmarket.entity.Subject;

public class BookVendingGui {

    public static Book BookVending(String bookName, BookCondition bc, BigDecimal cost, Student st, StudentClass cl, Subject sb) {

        // Inserting new book on batabase
        Book bv = SchoolMarket.bookVending(bookName, cost, bc, st, cl, sb);
        return bv;

    }

    public static void logMessage(JTextPane tpShowStudent, JLabel lbLogMessage, Book bv) {

        String newBook = "Le credenziali del nuovo libro sono: \n";

        String newBookMsg = "\n NOME LIBRO: " + bv.getBookName()
                + "\n SEZZIONE CLASSE: " + bv.getClassSection()
                + "\n DA: " + bv.getStudent().getLname() + " "
                + bv.getStudent().getFname();

        newBook += newBookMsg;
        System.out.println(newBook);
        newBook = tpShowStudent.getText() + "\n" + newBook;
        tpShowStudent.setText(newBook);

        // Finale message
        lbLogMessage.setText("Libro aggiunto con successo!");

    }

}
