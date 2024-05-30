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
            Store.openConnection();
            Student st = new Student(fname, lname, age, email, classSection, tel);
            Student saveStudent = Store.saveStudent(st);
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
            Store.openConnection();
            Book bk = new Book(bookName, cost, grade, student, classSection, subject);
            Book saveBook = Store.saveBook(bk);
            Store.closeConnection();
            return saveBook;
        } catch (Exception e) {
            Store.rollConnection();
            throw new RegistrationException("Book registration failed!");
        }
    }

    public static List<Book> booksByUser(int idStudent) {
        return Store.findBooksByStudentId(idStudent);
    }


    public static List<StudentClass> classesList() {
        return Store.findAllClasses();
    }


    public static List<Student> studentsList() {
        return Store.allStudentsList();
    }


    public static List<Subject> subjectList() {
        return Store.allSubjectList();
    }

    public static List<Book> booksList() {
        return Store.findAllBooks();
    }


    public static BookCondition getBookCondition(String grade) {
        return Store.getBookConditionIndex(grade);
    }


    public static Student getStudent(long idStudent) {
        return Store.getStudentIndex(idStudent);
    }


    public static StudentClass getClass(int idClass) {
        return Store.getClassIndex(idClass);
    }


    public static Subject getSubject(int idSubject) {
        return Store.getSubjectIndex(idSubject);
    }
}
