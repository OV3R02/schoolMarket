package com.mycompany.schoolmarket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@NamedQueries({
    @NamedQuery(name = BookCondition.FIND_BY_CONDITION_ID, query =  "SELECT e.grade FROM BookCondition e WHERE e.grade = :grade")
})
@Entity
@Table(name = "t_conditions")
public class BookCondition {

    public static final String FIND_BY_CONDITION_ID = "BookCondition.findByClassId";


    @Id
    @Size(max = 1)
    @Column(name = "grade")
    private String grade;

    @Size(max = 1000)
    @Column(name = "", nullable = true)
    private String description;

    public BookCondition() {
    }

    public BookCondition(@Size(max = 1) String grade, @Size(max = 1000) String description) {
        this.grade = grade;
        this.description = description;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((grade == null) ? 0 : grade.hashCode());
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
        BookCondition other = (BookCondition) obj;
        if (grade == null) {
            if (other.grade != null)
                return false;
        } else if (!grade.equals(other.grade))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "BookCondition [grade=" + grade + ", description=" + description + "]";
    }

}
