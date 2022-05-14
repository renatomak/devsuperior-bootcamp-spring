package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.services.validation.UserUpdateValid;
import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@ToString
@UserUpdateValid
public class UserUpdateDto extends UserDto implements Serializable {
    private static final long serialVersionUID = -481795253773365696L;

}
