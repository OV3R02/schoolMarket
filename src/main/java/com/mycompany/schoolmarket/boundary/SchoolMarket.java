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

    public static Student studentRegistration(String fname, String lname, int age, String email, String tel,
            StudentClass classSection) {

        try {

            Store.openConnection();
            // New Student's class instance
            Student st = new Student(fname, lname, age, email, classSection, tel);
            Student saveStudent = Store.saveStudent(st);
            Store.closeConnection();
            return saveStudent;
        } catch (Exception e) {
            Store.rollConnection();
            throw new RegistrationException("Account registration failed!");
        }
    }

    public static void studentRegistration(String fname, String lname, int age, String email,
            StudentClass classSection) {
        studentRegistration(fname, lname, age, email, null, classSection);
    }

    public static Book bookVending(String bookName, BigDecimal cost, BookCondition grade, Student student,
            StudentClass classSection, Subject subject) {

        try {

            Store.openConnection();

            // New Book's class instance

            Book bk = new Book(bookName, cost, grade, student, classSection, subject);

            Book saveBook = Store.saveBook(bk);

            Store.closeConnection();
            return saveBook;
        } catch (Exception e) {
            Store.rollConnection();
            throw new RegistrationException("Book registration failed!");
        }
    }

    // Methods used on WinSchoolMarket

    // Returnes all classes
    public static List<StudentClass> classesList() {
        return Store.findAllClasses();
    }

    // Returnes all students
    public static List<Student> studentsList() {
        return Store.allStudentsList();
    }

    // Returnes all subjects
    public static List<Subject> subjectList() {
        return Store.allSubjectList();
    }

    // Returns the Book's health-grade based on given data
    public static BookCondition getBookCondition(String grade) {
        return Store.getBookConditionIndex(grade);
    }

    // Returns all books based on student id
    public static List<Book> booksByUser(int idStudent) {
        return Store.findBooksByStudentId(idStudent);
    }

    // Returns student based on selected student id
    public static Student getStudent(long idStudent) {
        return Store.getStudentIndex(idStudent);
    }

    // Returns class section of the book based on class id
    public static StudentClass getClass(int idClass) {
        return Store.getClassIndex(idClass);
    }

    // Returns book's subject based on subject id
    public static Subject getSubject(int idSubject) {
        return Store.getSubjectIndex(idSubject);
    }
}
