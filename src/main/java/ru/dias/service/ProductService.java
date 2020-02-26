package ru.dias.service;

import ru.dias.entites.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    List<Product> findAllFilter(Double min, Double max);

}
