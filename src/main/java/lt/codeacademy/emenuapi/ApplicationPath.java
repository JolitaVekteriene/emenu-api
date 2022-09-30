package lt.codeacademy.emenuapi;

public interface ApplicationPath {
    // variables
    String productId = "productId";
    String FILE_NAME = "fileName";
    String ID = "id";

    String PRODUCTS =  "/products";
    String PRODUCT =  "/{" + productId + "}";
    String SEARCH = "/search";
    String FILES =  "/files";
    String METADATA = "/metadata";
    String FILE = "/{" + FILE_NAME + "}";
    String FILE_METADATA = METADATA + "/{" + ID + "}";
    String BLOBS = "/blobs";
    String GET_BLOB = BLOBS + "/{" + ID + "}";
    String FILE_OBJECT = "/object" + "/{" + ID + "}";
    String LOGIN = "/login";
}