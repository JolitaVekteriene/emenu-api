package lt.codeacademy.emenuapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.codeacademy.emenuapi.dto.Product;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class ProductEntity
{
    @Id
    @GeneratedValue
    @Column(columnDefinition = "VARCHAR(36)", updatable = false)
    @Type(type = "uuid-char")
    private UUID id;
    private String name;
    private String description;
    private String genre;
    private Integer quantity;
    private BigDecimal price;

    public static ProductEntity convert(Product p) {
        return new ProductEntity(
                p.getId(),
                p.getName(),
                p.getDescription(),
                p.getGenre(),
                p.getQuantity(),
                p.getPrice()
        );
    }
}