package com.smarthardware.shop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	Product findById(long id);
	Products findByNameContains(String search);
}
