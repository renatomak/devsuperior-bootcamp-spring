package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.services.validation.UserInsertValid;
import lombok.*;

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
