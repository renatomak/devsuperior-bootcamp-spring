package com.devsuperior.dslearnbds.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

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

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private Instant startMoment;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private Instant endMoment;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "offer")
    private List<Resource> resources = new ArrayList<>();
}
