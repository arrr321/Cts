package com.example.demo;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.Data;


@Document
@Data

public class Item {
	
	@Id
	private String itemId;
	private String id;
	private String itemName;
	private double itemPrice;
	
	@JsonFormat(shape= JsonFormat.Shape.STRING,pattern = "dd-MM-YYYY")
	private LocalDate date;
	
	
	



	public Item( String itemName, double itemPrice) {
		super();
	
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	
	}


	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public double getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}
	


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Item() {
		super();
	}
	
	
	

}
