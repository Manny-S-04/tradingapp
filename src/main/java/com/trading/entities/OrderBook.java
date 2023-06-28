package com.trading.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "order_book")
public class OrderBook {
	
	@Id
	@GeneratedValue
	private int orderBookId;
	
	@OneToMany(mappedBy = "orderBookId")
	private List<Order> orders;
	
	@Column(name="stock")
	private String stock;
	
	@ManyToOne
	private Exchange exchange;

	@ManyToOne
	private Sort sort;
	
	public OrderBook() {}
	
	public OrderBook(String stock) {
		super();
		this.stock = stock;		
	}

	public OrderBook(int orderBookId, List<Order> orders) {
		super();
		this.orderBookId = orderBookId;
		this.orders = orders;
	}

	public int getOrderBookId() {
		return orderBookId;
	}

	public void setOrderBookId(int orderBookId) {
		this.orderBookId = orderBookId;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Exchange getExchange() {
		return exchange;
	}

	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}
	
	
	
	
}
