package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/search")
    public void searchProducts() {
         productRepository.findAll().forEach(x-> System.out.println(x));
    }
}
