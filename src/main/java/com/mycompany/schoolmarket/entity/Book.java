package com.mycompany.schoolmarket.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.PositiveOrZero;

@NamedQueries({
    @NamedQuery(name = Book.FIND_BY_STUDENT_ID, query = "SELECT e FROM Book e WHERE e.student.idStudent = :id")
})

@Entity
@Table(name = "t_books")
public class Book {

    public static final String FIND_BY_STUDENT_ID = "Book.findByStudentId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private int idBook;

    @Column(name = "book_name", nullable = false)
    private String bookName;
    
    
    @PositiveOrZero(message = "The credit should be more or equals to 0.")
    @Column(name = "cost", nullable = false, precision = 8, scale = 2)
    private BigDecimal cost;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "grade", nullable = false)
    private BookCondition grade;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_student")
    private Student student;


    @ManyToOne(optional = false)
    @JoinColumn(name = "id_class")
    private StudentClass classSection;
    

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_subject")
    private Subject subject;
    
    public Book (){

    }

    public Book(String bookName,
            @PositiveOrZero(message = "The credit should be more or equals to 0.") BigDecimal cost, BookCondition grade,
            Student idStudent, StudentClass classSection, Subject subject) {
        this.bookName = bookName;
        this.cost = cost;
        this.grade = grade;
        this.student = idStudent;
        this.classSection = classSection;
        this.subject = subject;
    }



    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BookCondition getGrade() {
        return grade;
    }

    public void setGrade(BookCondition grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentClass getClassSection() {
        return classSection;
    }

    public void setClassSection(StudentClass classSection) {
        this.classSection = classSection;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (idBook ^ (idBook >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (idBook != other.idBook)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "\nBook [idBook=" + idBook + ", bookName=" + bookName + ", cost=" + cost + ", grade=" + grade
                + ", student=" + student + ", classSection=" + classSection + ", subject=" + subject + "]";
    }
}
