package com.devsuperior.dslearnbds.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonProperty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OAuthCustomError {

    private String error;

    @JsonProperty("error_description")
    private String errorDescription;

}
