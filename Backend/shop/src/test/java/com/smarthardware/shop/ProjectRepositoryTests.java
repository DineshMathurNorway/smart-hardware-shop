package com.smarthardware.shop;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
class ProductRepositoryTests{
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private ProductRepository products;
	
	@Test
	public void testProductsCount() {
		Products productList = new Products();
		Product product = new Product("Hardware1", "Hardware1 description", "https://www.hardware.com/img.png", 100.00);
		entityManager.persist(product);

		products.findAll().forEach(productList::add);

		assertThat(productList).extracting(Product::getName).containsOnly(product.getName());
	}
}
