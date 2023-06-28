package com.trading.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "exchange")
@Getter @Setter @NoArgsConstructor
public class Exchange {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int exchangeId;
	
	@OneToMany(mappedBy = "exchange")
	private List<OrderBook> orderBooks;
	
	@Column(name = "fee")
	private double fee;
	
	@Column(name="totalvalue")
	private double totalValue;
	
    @ManyToOne
	private Sort sort;
    
    public Exchange() {}

	public Exchange(int exchangeId, List<OrderBook> orderBooks, double fee, double totalValue, Sort sort) {
		super();
		this.exchangeId = exchangeId;
		this.orderBooks = orderBooks;
		this.fee = fee;
		this.totalValue = totalValue;
		this.sort = sort;
	}
	
	
	

}
