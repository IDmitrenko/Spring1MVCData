package ru.dias.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.dias.entites.Product;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    List<Product> findAll();

    List<Product> findAllByPriceLessThanEqual(Double max);

    List<Product> findAllByPriceGreaterThanEqual(Double min);

    List<Product> findAllByPriceBetween(Double min, Double max);

}
