package com.mycompany.schoolmarket;


import java.math.BigDecimal;
import java.util.List;

import com.mycompany.schoolmarket.boundary.SchoolMarket;
import com.mycompany.schoolmarket.control.Store;
import com.mycompany.schoolmarket.entity.StudentClass;
import com.mycompany.schoolmarket.entity.Subject;
import com.mycompany.schoolmarket.entity.Book;
import com.mycompany.schoolmarket.entity.BookCondition;
import com.mycompany.schoolmarket.entity.Student;

public class App {
    public static void main(String[] args) {
        
        // Aggiunge uno Studente

        int classIndex = 14;
        StudentClass ci = Store.getClassIndex(classIndex);
        Student str = SchoolMarket.studentRegistration("omar", "vergnano", 17, "omar@gmail.com", null, ci);
        System.out.println(Store.findStudentById(4).get());

        System.out.println("\nNuovo studente aggiunto: "+str.toString()+"\n");

        // Aggiunge un libro

        int studentIndex = 5;
        String bookConIndex = "A";
        int classIndex1 = 2;
        int subjectIndex = 4;

        Student sti = Store.getStudentIndex(studentIndex);
        BookCondition bci = Store.getBookConditionIndex(bookConIndex);
        StudentClass ci1 = Store.getClassIndex(classIndex1);
        Subject sbi = Store.getSubjectIndex(subjectIndex);
        Book bv = SchoolMarket.bookVending("L'impero romano", BigDecimal.valueOf(59.90), bci, sti, ci1, sbi);

        System.out.println("\nNuovo libro aggiunto: "+bv.getBookName()
                            +" "+bv.getGrade().getGrade()
                            +" "+bv.getCost()
                            +" "+bv.getSubject().getSubjectName()
                            +" "+bv.getClassSection().getSection()+"\n");

        // Recupera la lista dei libri di uno Studente

        List<Book> bl = SchoolMarket.booksByUser(studentIndex);
        bl.forEach(v -> System.out.println("\nNome: " + v.getBookName()
                                        +" Condizione: "+v.getGrade().getGrade()
                                        +" Costo: " + v.getCost()
                                        +" Materia: " + v.getSubject().getSubjectName()
                                        +" Sezione: "+v.getClassSection().getSection()+"\n"));
        
        
    }
}
