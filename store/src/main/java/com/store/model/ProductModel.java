package com.store.model;

public class ProductModel {
	private Long id;
	private String name;
	private String brand;
	private int price;
	private boolean remain;
	private String image;
	
	
	
	public ProductModel() {}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isRemain() {
		return remain;
	}
	public void setRemain(boolean remain) {
		this.remain = remain;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
