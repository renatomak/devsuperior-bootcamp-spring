package com.devsuperior.dslearnbds.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_resource")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Resource implements Serializable {
    private static final long serialVersionUID = 3042306914305246863L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String title;

    private String description;

    private Integer position;

    private String imgUri;

    private ResourceType type;

    private String externalLink;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;


}
