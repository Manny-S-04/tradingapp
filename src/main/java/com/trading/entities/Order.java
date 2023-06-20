package com.trading.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order")
@Getter @Setter @NoArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ManyToOne
	@JoinColumn(name="orderbook")
	private int orderId;
	
	@Column(name="order_type")
	private String orderType;
	
	@Column(name="stock")
	private String stock;
	
	@Column(name="price")
	private double price;

	public Order(String orderType, String stock, double price) {
		super();
		this.orderType = orderType;
		this.stock = stock;
		this.price = price;
	}
	
	
	

}
