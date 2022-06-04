package com.devsuperior.dslearnbds.entities;

import com.devsuperior.dslearnbds.enuns.DeliverStatus;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_deliver")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Deliver implements Serializable {
    private static final long serialVersionUID = 7456323865854622598L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String uri;

    private Instant moment;

    private DeliverStatus status;

    private String feedback;

    private Integer correctCount;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "offer_id"),
            @JoinColumn(name = "user_id")
    })
    private Enrollment enrollment;


    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
}
