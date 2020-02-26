package ru.dias.repositories;

import org.springframework.stereotype.Component;
import ru.dias.entites.Product;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1L, "Bread", new BigDecimal(42.0)));
        products.add(new Product(2L, "Milk", new BigDecimal(132.0)));
        products.add(new Product(3L, "Cheese", new BigDecimal(415.0)));
        products.add(new Product(4L, "Sausage", new BigDecimal(894.0)));
        products.add(new Product(5L, "Beer", new BigDecimal(65.0)));
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }

    public Optional<Product> findOneById(Long id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public void insert(Product product) {
        if (existById(product.getId())) {
            throw new RuntimeException("Product with id: " + product.getId() + " is already exists");
        }
        products.add(product);
    }

    public boolean existById(Long id) {
        return products.stream().anyMatch(p -> p.getId().equals(id));
    }
}
