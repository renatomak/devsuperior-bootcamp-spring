package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto implements Serializable {
    private static final long serialVersionUID = 7193684038002132400L;

    @EqualsAndHashCode.Include
    private Long id;
    @Size(min = 5, max = 60, message = "Deve ter entre 5 e 60 caracteres.")
    @NotBlank(message = "Campo obrigatório.")
    private String name;

    @NotBlank(message = "Campo obrigatório.")
    private String description;
    @Positive(message = "Preço deve ser um valor positivo.")
    private Double price;
    private String imgUrl;

    @PastOrPresent(message = "Data do produto não pode ser futura.")
    private Instant date;
    
    private Set<CategoryDto> categories = new HashSet<>();

    public ProductDto(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
        this.imgUrl = entity.getImgUrl();
        this.date = entity.getDate();
    }

    public ProductDto(Product entity, Set<Category> categories) {
        this(entity);
        categories.forEach(cat -> this.categories.add(new CategoryDto(cat)));
    }
}
