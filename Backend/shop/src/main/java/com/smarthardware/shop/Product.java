package com.smarthardware.shop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	private String thumbnailData;
	private Double price;
	
	public Product() {}
	
	public Product(String name, String description, String thumbnailData, Double price ) {
		this.name = name;
		this.description = description;
		this.thumbnailData = thumbnailData;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getThumbnailData() {
		return thumbnailData;
	}
	
	public Double getPrice() {
		return price;
	}
}
