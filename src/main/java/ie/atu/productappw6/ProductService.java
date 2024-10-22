package ie.atu.productappw6;

import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();

    public List<Product> getProduct(){
        return myList;
    }
    public List<Product> addProduct(Product product){
        //do business stuff like retrieving details from database or generating...
        myList.add(product);
        return myList;
    }

    public ResponseEntity<List> updateProduct(@PathVariable int id, @RequestBody Product product) {
        for (Product p : myList) {
            if (p.getId() == id) {
                myList.remove(p);
            }
        }
        myList.add(product);
        return ResponseEntity.ok(myList);
    }

    public ResponseEntity<List> deleteProduct(@PathVariable int id){
        for(Product p : myList){
            if(p.getId() == id){
                myList.remove(p);
            }
        }
        return ResponseEntity.ok(myList);
    }
}
