package com.kevin.university.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "student_subject")
@Data
public class StudentSubject {

    @EmbeddedId
    private StudentSubjectPK id;



    @ManyToOne
    @JoinColumn(name = "subject_id", updatable = false, insertable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "student_id", updatable = false, insertable = false)
    private Student student;


}
