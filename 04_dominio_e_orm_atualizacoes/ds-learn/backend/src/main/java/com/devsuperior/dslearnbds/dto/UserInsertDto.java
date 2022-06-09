package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.services.validation.UserInsertValid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@UserInsertValid
public class UserInsertDto extends UserDto implements Serializable {
    private static final long serialVersionUID = -481795253773365696L;

    private String password;

}
