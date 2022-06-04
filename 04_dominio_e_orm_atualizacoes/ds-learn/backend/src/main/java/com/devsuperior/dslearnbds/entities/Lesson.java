package com.devsuperior.dslearnbds.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_lesson")
@Inheritance(strategy = InheritanceType.JOINED)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Lesson implements Serializable {
    private static final long serialVersionUID = -5092448124195061946L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String title;

    private Integer position;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @ManyToMany
    @JoinTable(name = "tb_lessons_done",
    joinColumns = @JoinColumn(name = "lesson_id"),
    inverseJoinColumns = {
            @JoinColumn(name = "user_id"),
            @JoinColumn(name = "offer_id")
        }
    )
    private Set<Enrollment> enrollmentsDone = new HashSet<>();

    @OneToMany(mappedBy = "lesson")
    private Set<Deliver> deliveries = new HashSet<>();

    @OneToMany(mappedBy = "lesson")
    private Set<Topic> topics = new HashSet<>();

    public Lesson(Long id, String title, Integer position, Section section) {
        this.id = id;
        this.title = title;
        this.position = position;
        this.section = section;
    }

    public Lesson() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Set<Enrollment> getEnrollmentsDone() {
        return enrollmentsDone;
    }
}
