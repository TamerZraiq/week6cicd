package ie.atu.productappw6;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();

    @GetMapping("/getProducts")
    public List<Product> getProduct(){
        return myList;
    }
    @PostMapping("/addProducts")
    public List<Product> addProduct(Product product){
        //do business stuff like retrieving details from database or generating...
        myList.add(product);
        return myList;
    }
}
