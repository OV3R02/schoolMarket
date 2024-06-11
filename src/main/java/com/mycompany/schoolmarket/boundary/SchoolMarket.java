package com.mycompany.schoolmarket.boundary;

import java.math.BigDecimal;
import java.util.List;

import com.mycompany.schoolmarket.control.Store;
import com.mycompany.schoolmarket.entity.Book;
import com.mycompany.schoolmarket.entity.BookCondition;
import com.mycompany.schoolmarket.entity.StudentClass;
import com.mycompany.schoolmarket.entity.Student;
import com.mycompany.schoolmarket.entity.Subject;

public class SchoolMarket {

    public static Student studentRegistration(String fname, String lname, int age, String email, String tel, StudentClass classSection){
        
        try {
            // apertura nuova connessione al database
            Store.openConnection();
            // nuova istanza della classe (entity) student
            Student st = new Student(fname, lname, age, email, classSection, tel);
            // salvataggio nuova istanza sul database
            Student saveStudent = Store.saveStudent(st);
            // chiusura della connessione con il database
            Store.closeConnection();
        
            return saveStudent;
        } catch (Exception e) {
            Store.rollConnection();
            throw new RegistrationException("Account registration failed!");
        }
    }


    public static void studentRegistration(String fname, String lname, int age, String email, StudentClass classSection){
        studentRegistration(fname, lname, age, email, null, classSection);
    }

    public static Book bookVending (String bookName, BigDecimal cost, BookCondition grade, Student student, StudentClass classSection, Subject subject){
        
        try {
            // apertura nuova connessione al database
            Store.openConnection();
            // nuova istanza della classe (entity) Book
            Book bk = new Book(bookName, cost, grade, student, classSection, subject);
            // salvataggio nuova istanza sul database
            Book saveBook = Store.saveBook(bk);
            // chiusura della connessione con il database
            Store.closeConnection();
            return saveBook;
        } catch (Exception e) {
            Store.rollConnection();
            throw new RegistrationException("Book registration failed!");
        }
    }
    
    
    // Metodi utili al corretto funzionamento della classe WinSchoolMarket

    // Ritorna tutte le classi
    public static List<StudentClass> classesList() {
        return Store.findAllClasses();
    }
    
    // Ritorna tutti gli studenti
    public static List<Student> studentsList() {
        return Store.allStudentsList();
    }
    
    // Ritorna tutte le materie
    public static List<Subject> subjectList() {
        return Store.allSubjectList();
    }
    
    // Ritorna del grado di usura del libro in base al dato fornito
    public static BookCondition getBookCondition(String grade) {
        return Store.getBookConditionIndex(grade);
    }
    
    // Ritorna tutti i libri dello studente selezionato
    public static List<Book> booksByUser(int idStudent) {
        return Store.findBooksByStudentId(idStudent);
    }
    
    // Ritorna lo studente in base all'id selezionato
    public static Student getStudent(long idStudent) {
        return Store.getStudentIndex(idStudent);
    }

    // Ritorna la classe del libro
    public static StudentClass getClass(int idClass) {
        return Store.getClassIndex(idClass);
    }

    // Ritorna la materia del libro
    public static Subject getSubject(int idSubject) {
        return Store.getSubjectIndex(idSubject);
    }

    public static Student getStudentByEmail(String email) {
        return Store.getStudentIndexByEmail(email);
    }
}
