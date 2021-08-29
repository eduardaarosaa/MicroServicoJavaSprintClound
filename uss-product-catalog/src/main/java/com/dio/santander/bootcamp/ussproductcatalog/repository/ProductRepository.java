package com.dio.santander.bootcamp.ussproductcatalog.repository;


import com.dio.santander.bootcamp.ussproductcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName(String name);

}
