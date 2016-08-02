package com.demo.domainmodel.product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import easy.domain.base.BrokenRuleMessage;
import easy.domain.base.EntityBase;

public class Product extends EntityBase<Integer> {
	private static final long serialVersionUID = -6867323644286057934L;
	
	private Integer restaurantId;
	private Integer categoryId;
	private String name;
	private BigDecimal price;
	private LocalDateTime createDate;
	private String foodConverPicUrl;
	private Integer sort;
	private Integer saleStatus;
	private Integer foodStatus;
	private String unit;
	
	public Product(Integer restaurantId) {
		this.setRestaurantId(restaurantId);
	}
	
	@Override
	protected BrokenRuleMessage getBrokenRuleMessages() {
		return null;
	}

	@Override
	public Boolean validate() {
		return null;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	private void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
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

	public Integer getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(Integer saleStatus) {
		this.saleStatus = saleStatus;
	}

	public Integer getFoodStatus() {
		return foodStatus;
	}

	public void setFoodStatus(Integer fooldStatus) {
		this.foodStatus = fooldStatus;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}
