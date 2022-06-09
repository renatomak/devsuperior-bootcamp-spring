package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.entities.Role;
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
public class RoleDto implements Serializable {
    private static final long serialVersionUID = 322L;

    private Long id;
    private String authority;

    public RoleDto(Role entity) {
        id = entity.getId();
        authority = entity.getAuthority();
    }
}
