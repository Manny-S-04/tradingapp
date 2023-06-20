package com.trading.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
