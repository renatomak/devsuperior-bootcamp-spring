package com.devsuperior.dslearnbds.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_offer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Offer implements Serializable {
    private static final long serialVersionUID = -3785010529612483765L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String edition;

    private Instant startMoment;

    private Instant endMoment;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;



}
