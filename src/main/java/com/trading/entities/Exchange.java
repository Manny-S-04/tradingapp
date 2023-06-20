package com.trading.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "exchange")
@Getter @Setter @NoArgsConstructor
public class Exchange {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int exchangeId;
	
	@OneToMany
	private List<OrderBook> orderBooks;
	
	@Column(name = "fee")
	private double fee;
	
	@Column(name="totalvalue")
	private double totalValue;
	
	@ManyToOne
	private Sort sort;

	public Exchange(int exchangeId, List<OrderBook> orderBooks, double fee, double totalValue, Sort sort) {
		super();
		this.exchangeId = exchangeId;
		this.orderBooks = orderBooks;
		this.fee = fee;
		this.totalValue = totalValue;
		this.sort = sort;
	}
	
	
	

}
