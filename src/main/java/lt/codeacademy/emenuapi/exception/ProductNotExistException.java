package lt.codeacademy.emenuapi.exception;

import java.util.UUID;

public class ProductNotExistException extends RuntimeException{
    private final UUID productId;

    public ProductNotExistException(UUID productId) {
        this.productId = productId;
    }

    public UUID getProductId()
    {
        return productId;
    }
}