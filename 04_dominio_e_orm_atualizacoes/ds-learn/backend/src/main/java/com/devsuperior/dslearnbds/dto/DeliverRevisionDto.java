package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.enuns.DeliverStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeliverRevisionDto {

    private DeliverStatus status;

    private String feedback;

    private Integer correctCount;
}
