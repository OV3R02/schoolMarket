package com.mycompany.schoolmarket.control;

import java.util.List;
import java.util.Optional;

import com.mycompany.schoolmarket.entity.Book;
import com.mycompany.schoolmarket.entity.BookCondition;
import com.mycompany.schoolmarket.entity.Student;
import com.mycompany.schoolmarket.entity.StudentClass;
import com.mycompany.schoolmarket.entity.Subject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Store {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("schoolMarket");
    private static EntityManager em = emf.createEntityManager();

    {

    }

    public static void openConnection() {
        if (em.getTransaction().isActive()) {
            throw new StoreException("Connection is already open!");
        }
        em.getTransaction().begin();

    }

    public static void closeConnection() {
        if (!em.getTransaction().isActive()) {
            throw new StoreException("Connection is not already active!");
        }
        em.getTransaction().commit();

    }

    public static void rollConnection() {
        if (em.getTransaction().isActive()) {
            throw new StoreException("Connection is not already active!");
        }
        em.getTransaction().rollback();

    }

    public static Student saveStudent(Student e) {
        if (em.getTransaction().isActive()) {
            return em.merge(e);
        }
        em.getTransaction().begin();
        Student saved = em.merge(e);
        em.getTransaction().commit();
        return saved;
    }

    public static Book saveBook(Book b) {

        if (em.getTransaction().isActive()) {
            return em.merge(b);
        }
        em.getTransaction().begin();
        Book saved = em.merge(b);
        em.getTransaction().commit();
        return saved;
    }

    public static Optional<Student> findStudentById(long idStudent) {
        Student st = em.find(Student.class, idStudent);
        return st == null ? Optional.empty() : Optional.of(st);
    }

    public static Optional<Book> findBookById(long idBook) {
        Book bk = em.find(Book.class, idBook);
        return bk == null ? Optional.empty() : Optional.of(bk);
    }

    public static StudentClass getClassIndex(long idClass) {
        TypedQuery<StudentClass> query = em.createNamedQuery(StudentClass.FIND_BY_CLASS_ID, StudentClass.class);
        StudentClass cl = query.setParameter("id", idClass).getSingleResult();
        return cl;
    }

    public static BookCondition getBookConditionIndex(String idBookCondition) {
        TypedQuery<BookCondition> query = em.createNamedQuery(BookCondition.FIND_BY_CONDITION_ID, BookCondition.class);
        BookCondition bc = query.setParameter("grade", idBookCondition).getSingleResult();
        return bc;
    }

    public static Student getStudentIndex(long idStudent) {
        TypedQuery<Student> query = em.createNamedQuery(Student.FIND_BY_STUDENT_ID, Student.class);
        Student st = query.setParameter("id", idStudent).getSingleResult();
        return st;
    }

    public static Subject getSubjectIndex(long idSubject) {
        TypedQuery<Subject> query = em.createNamedQuery(Subject.FIND_BY_SUBJECT_ID, Subject.class);
        Subject sb = query.setParameter("id", idSubject).getSingleResult();
        return sb;
    }

    public static List<Book> findBooksByStudentId(long idStudent) {
        return em.createNamedQuery(Book.FIND_BY_STUDENT_ID, Book.class)
                .setParameter("id", idStudent)
                .getResultList();

    }

    public static List<StudentClass> findAllClasses() {
        return em.createQuery("select e from StudentClass e order by e.section", StudentClass.class)
                .getResultList();
    }

    public static List<Student> allStudentsList() {
        return em.createQuery("SELECT e FROM Student e", Student.class)
                .getResultList();
    }

    public static List<Subject> allSubjectList() {
        return em.createQuery("SELECT e FROM Subject e", Subject.class)
            .getResultList();
    }

    public static List<Book> findAllBooks() {
        return em.createQuery("SELECT e FROM Book e", Book.class)
            .getResultList();
    }
}