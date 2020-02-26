package ru.dias.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dias.entites.Product;
import ru.dias.repositories.ProductRepository;
import ru.dias.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findAllFilter(Double min, Double max) {
        if (min != null && max == null) {
            return productRepository.findAllByPriceGreaterThanEqual(min);
        }
        if (min == null && max != null) {
            return productRepository.findAllByPriceLessThanEqual(max);
        }
        if (min != null && max != null) {
            return productRepository.findAllByPriceBetween(min, max);
        }
        return productRepository.findAll();
    }
}
