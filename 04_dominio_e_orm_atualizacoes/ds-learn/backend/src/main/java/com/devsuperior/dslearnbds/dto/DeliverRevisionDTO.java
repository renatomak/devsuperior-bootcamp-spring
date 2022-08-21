package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.enuns.DeliverStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeliverRevisionDTO implements Serializable {
    private static final long serialVersionUID = -1599406977307628997L;

    private DeliverStatus status;

    private String feedback;

    private Integer correctCount;
}
