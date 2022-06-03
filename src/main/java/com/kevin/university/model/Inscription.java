package com.kevin.university.model;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "inscriptions")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inscription_id")
    private Long inscriptionId;

    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @ManyToOne
    @JoinColumn(name = "student_id", updatable = false, insertable = false)
    private Student student;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    private List<StudentSubject> subjects;
}
