package lt.codeacademy.emenuapi.repository;

import lt.codeacademy.emenuapi.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {
    List<ProductEntity> findAllByGenre(String genre);

    @Query("SELECT p FROM ProductEntity p WHERE p.genre = :genre AND p.price > :price")
    List<ProductEntity> getProductsByGenreAndPrice(@Param("genre") String genre, @Param("price")BigDecimal price);

    @Query("SELECT p FROM ProductEntity p WHERE p.name like %:query% or p.description like %:query%")
    List<ProductEntity> search(@Param("query") String query);

    List<ProductEntity> findByNameLikeOrDescriptionLike(String name, String description);
}