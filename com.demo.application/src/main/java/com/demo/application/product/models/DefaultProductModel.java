package com.demo.application.product.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.demo.application.util.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class DefaultProductModel {
	private String name;
	private BigDecimal price;
	private LocalDateTime createDate;
	private String unit;
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
	@JsonSerialize(using = CustomDateSerializer.class)
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
}
