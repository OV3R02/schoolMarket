package com.mycompany.schoolmarket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@NamedQueries({
    @NamedQuery(name = Subject.FIND_BY_SUBJECT_ID, query = "SELECT e FROM Subject e WHERE e.idSubject = :id")
})

@Entity
@Table(name = "t_subjects")
public class Subject {

    public static final String FIND_BY_SUBJECT_ID = "Subject.findBySubjectId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subjects")
    private int idSubject;

    @Column(name = "subject_name", nullable = false)
    private String subjectName;

    public Subject() {
    }

    public Subject(int idSubject, String subjectName) {
        this.idSubject = idSubject;
        this.subjectName = subjectName;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (idSubject ^ (idSubject >>> 32));
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
        Subject other = (Subject) obj;
        if (idSubject != other.idSubject)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return subjectName;
    }

}
