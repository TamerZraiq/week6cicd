package ie.atu.productappw6;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/getProduct")
    public List<Product> getProduct(){
        return list;
    }
    @PostMapping("/addProduct")
    public List<Product> newProduct(@Valid @RequestBody Product product){
        list = myService.addProduct(product);
        return list;
    }
    @PutMapping("/{id}")
    public ResponseEntity<List> updateProduct(@PathVariable int id, @RequestBody Product product) {
        for (Product p : list) {
            if (p.getId() == id) {
                list.remove(p);
            }
        }
        list = myService.addProduct(product);
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List> deleteProduct(@PathVariable int id){
        for(Product p : list){
            if(p.getId() == id){
                list.remove(p);
            }
        }
        return ResponseEntity.ok(list);
    }
}
