package lt.codeacademy.emenuapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.codeacademy.emenuapi.entity.ProductEntity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product
{
    private UUID id;
    @NotBlank
    @Size(min = 5, max = 50, message = "{validation.product.size}")
    private String name;
    @Size(max = 500)
    @NotBlank
    private String description;
    @NotBlank
    private String genre;
    @PositiveOrZero
    @NotNull
    private Integer quantity;
    @Positive
    @NotNull
    private BigDecimal price;

    public static Product convert(ProductEntity entity) {
        return new Product(entity.getId(),
                entity.getName(),
                entity.getDescription(),
                entity.getGenre(),
                entity.getQuantity(),
                entity.getPrice());
    }
}