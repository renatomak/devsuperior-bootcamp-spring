package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.entities.Role;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RoleDto implements Serializable {
    private static final long serialVersionUID = 322L;

    private Long id;
    private String authority;

    public RoleDto(Role entity) {
        id = entity.getId();
        authority = entity.getAuthority();
    }
}
