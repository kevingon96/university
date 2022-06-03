package com.kevin.university.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long subjectId;

    private String name;

    private Boolean availability;

    @ManyToOne
    @JoinColumn(name = "course_id", insertable = false,updatable = false)
    private Course course;

}
