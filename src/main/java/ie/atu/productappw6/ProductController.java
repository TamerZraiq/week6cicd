package ie.atu.productappw6;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService myService;
    private List<Product> list = new ArrayList<>();

    public ProductController(ProductService myService) {
        this.myService = myService;
    }

    @PostMapping
    public List<Product> newProduct(@RequestBody Product product){
        list = myService.addProduct(product);
        return list;
    }
}
