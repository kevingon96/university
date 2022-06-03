package com.kevin.university.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private Long teacherId;

    private String name;
    @Column(name = "last_name")
    private String lastName;
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "subject_id", updatable = false, insertable = false)
    private Subject subject;

}
