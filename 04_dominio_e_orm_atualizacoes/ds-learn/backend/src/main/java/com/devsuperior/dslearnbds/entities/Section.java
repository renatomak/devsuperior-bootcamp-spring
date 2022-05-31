package com.devsuperior.dslearnbds.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_section")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Section implements Serializable {
    private static final long serialVersionUID = 7516322902955118649L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String title;

    private String description;

    private Integer position;

    private String imgUri;

    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;

    @ManyToOne
    @JoinColumn(name = "prerequisite_id")
    private Section prerequisite;

}
