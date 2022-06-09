package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.services.validation.UserUpdateValid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@ToString
@UserUpdateValid
public class UserUpdateDto extends UserDto implements Serializable {
    private static final long serialVersionUID = -481795253773365696L;

}
