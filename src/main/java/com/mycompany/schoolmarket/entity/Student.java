package com.mycompany.schoolmarket.entity;

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
import jakarta.validation.constraints.Email;

@NamedQueries({
    @NamedQuery(name = Student.FIND_BY_STUDENT_ID, query = "SELECT e FROM Student e WHERE e.idStudent = :id")
})

@Entity
@Table(name = "t_students")
public class Student {

    public static final String FIND_BY_STUDENT_ID = "Student.findByStudentId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private int idStudent;

    @Column(name = "firstname", nullable = false)
    private String fname;

    @Column(name = "lastname", nullable = false)
    private String lname;

    @Column(name = "age", nullable = false)
    private int age;

    @Email(message = "The email is not valid!")
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "tel", nullable = true)
    private String tel;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_class")
    private StudentClass classSection;

    public Student() {
    }

    public Student(String fname, String lname, int age, @Email(message = "The email is not valid!") String email,
            StudentClass classSection) {
        this(fname, lname, age, email, classSection, null);
    }

    public Student(String fname, String lname, int age, @Email(message = "The email is not valid!") String email,
            StudentClass classSection, String tel) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.email = email;
        this.classSection = classSection;
        this.tel = tel;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public StudentClass getClassSection() {
        return classSection;
    }

    public void setClassSection(StudentClass classSection) {
        this.classSection = classSection;
    }

    @Override
    public String toString() {
        return "\n idStudent: " + idStudent + "\n firstname: " + fname + "\n lastname: " + lname + "\n age: " + age + "\n email: "
                + email + "\n tel: " + tel + "\n classSection: " + classSection;
    }

}
