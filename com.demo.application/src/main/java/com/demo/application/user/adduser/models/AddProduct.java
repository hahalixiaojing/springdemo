package com.demo.application.user.adduser.models;

import java.math.BigDecimal;


public class AddProduct {
	private Integer restaurantId;
	private Integer categoryId;
	private String name;
	private BigDecimal price;
	private String createDate;
	private String foodConverPicUrl;
	private Integer sort;
	private Integer saleStatus;
	private Integer foodStatus;
	private String unit;
	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getFoodConverPicUrl() {
		return foodConverPicUrl;
	}
	public void setFoodConverPicUrl(String foodConverPicUrl) {
		this.foodConverPicUrl = foodConverPicUrl;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getFoodStatus() {
		return foodStatus;
	}
	public void setFoodStatus(Integer foodStatus) {
		this.foodStatus = foodStatus;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Integer getSaleStatus() {
		return saleStatus;
	}
	public void setSaleStatus(Integer saleStatus) {
		this.saleStatus = saleStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
}
