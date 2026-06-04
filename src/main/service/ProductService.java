import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;


    public List<ProductEntity> getAllProducts() {
        List<ProductEntity> product = productRepository.findAll();
        if (product.isEmpty()) {
            throw new RuntimeException("Product not found with id: ");
        }
        return product;
    }

    public ProductEntity getProductById(String productId) {
        return productRepository.findByProductId(productId);
    }

}
