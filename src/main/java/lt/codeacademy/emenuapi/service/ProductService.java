package lt.codeacademy.emenuapi.service;

import lt.codeacademy.emenuapi.dto.Product;
import lt.codeacademy.emenuapi.entity.ProductEntity;
import lt.codeacademy.emenuapi.exception.ProductNotExistException;
import lt.codeacademy.emenuapi.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService
{

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(Product product) {
        productRepository.save(ProductEntity.convert(product));
    }

    public Page<Product> getProducts(Pageable pageable) {
        return productRepository.findAll(pageable)
                .map(Product::convert);
    }

    public List<Product> getProducts() {
        return productRepository.findAll()
                .stream()
                .map(Product::convert)
                .toList();
    }

    public Product getProduct(UUID id) {
        return productRepository.findById(id)
                .map(Product::convert)
                .orElseThrow(() -> new ProductNotExistException(id));
    }

    public void updateProduct(Product product) {
        productRepository.save(ProductEntity.convert(product));
    }

    public void delete(UUID id) {
        productRepository.deleteById(id);
    }

    public List<Product> getProductsByGenre(String genre) {
        return productRepository.findAllByGenre(genre).stream()
                .map(Product::convert)
                .toList();
    }

    public List<Product> getProductsByGenreAndPrice(String genre, BigDecimal price) {
        return productRepository.getProductsByGenreAndPrice(genre, price).stream()
                .map(Product::convert)
                .toList();
    }

    public List<Product> search(String query) {

        query = "%" + query + "%";

        return productRepository.findByNameLikeOrDescriptionLike(query, query)
                .stream()
                .map(Product::convert)
                .toList();

    }

}