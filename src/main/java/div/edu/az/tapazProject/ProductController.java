package div.edu.az.tapazProject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
private static List<String> products=new ArrayList<>();
static {
    products.add("product1");
    products.add("product2");
    products.add("product3");
    products.add("product4");
    products.add("product5");
    products.add("product6");
}
@GetMapping
public List<String>getAll(){
    return products;
}
@GetMapping("/{id}")
public String getById(int id){
    return products.get(id-1);
}
@PostMapping
public void addProducts(@RequestBody String product){
    products.add(product);
}
@DeleteMapping("/{id}")
public void deleteProduct(@PathVariable int id){
    products.remove(id-1);

}
}
