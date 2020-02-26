package ru.dias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.dias.entites.Product;
import ru.dias.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductsController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public String showAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product-all";
    }

    @GetMapping("/info/{id}")
    @ResponseBody
    public Product getProductId(@PathVariable Long id) {
        return productService.findById(id).orElseThrow(() -> new RuntimeException());
    }

    @GetMapping("/addProduct")
    public String formAddProduct(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "product-form";
    }

    @PostMapping("/productForm")
    public String productForm(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "product-form-result";
    }
}
