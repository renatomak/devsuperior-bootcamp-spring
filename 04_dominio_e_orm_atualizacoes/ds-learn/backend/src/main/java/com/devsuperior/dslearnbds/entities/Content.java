package com.devsuperior.dslearnbds.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_content")
public class Content extends Lesson  implements Serializable {
    private static final long serialVersionUID = -5092448124195061946L;

    private String textContent;

    private String videoUri;

    public Content(Long id, String title, Integer position, Section section, String textContent, String videoUri) {
        super(id, title, position, section);
        this.textContent = textContent;
        this.videoUri = videoUri;
    }

    public Content() {
    }

}
