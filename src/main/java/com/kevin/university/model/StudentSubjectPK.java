package com.kevin.university.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class StudentSubjectPK implements Serializable {

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "subject_id")
    private Long SubjectId;
}
