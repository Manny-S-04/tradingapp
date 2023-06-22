package com.trading.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "orderbook")
@Getter @Setter @NoArgsConstructor
public class OrderBook {
	
	@Id
	@GeneratedValue
	private int orderBookId;
	
	@OneToMany(mappedBy = "orderid")
	private List<Order> orders;
	
	@ManyToOne
	private Exchange exchange;

	@ManyToOne
	private Sort sort;

	public OrderBook(int orderBookId, List<Order> orders, Exchange exchange, Sort sort) {
		super();
		this.orderBookId = orderBookId;
		this.orders = orders;
		this.exchange = exchange;
		this.sort = sort;
	}
	
	
	
	
}
