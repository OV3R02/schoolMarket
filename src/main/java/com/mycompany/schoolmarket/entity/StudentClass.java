package com.mycompany.schoolmarket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@NamedQueries({
    @NamedQuery(name = StudentClass.FIND_BY_CLASS_ID, query = "SELECT e FROM StudentClass e WHERE e.idClass = :id")

})

@Entity
@Table(name = "t_classes")
public class StudentClass {

    public static final String FIND_BY_CLASS_ID = "StudentClass.findByClassId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_class")
    private int idClass;

    @Size(max = 5)
    @Column(name = "section", nullable = false)
    private String section;

    @Column(name = "scholar_year", nullable = true)
    private String schoolarYear;

    public StudentClass() {

    }

    public StudentClass(int idClass, @Size(max = 5) String section) {
        this.idClass = idClass;
        this.section = section;
    }

    public StudentClass(String schoolarYear) {
        this.schoolarYear = schoolarYear;
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSchoolarYear() {
        return schoolarYear;
    }

    public void setSchoolarYear(String schoolarYear) {
        this.schoolarYear = schoolarYear;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (idClass ^ (idClass >>> 32));
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
        StudentClass other = (StudentClass) obj;
        if (idClass != other.idClass)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getSection();
    }
}
