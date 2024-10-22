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
    private List<Product> list = new ArrayList<>();

    @PostMapping
    public List<Product> newProduct(@RequestBody Product product){
        return list;
    }
}
