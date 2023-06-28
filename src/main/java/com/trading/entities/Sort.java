package com.trading.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "sort")
@Getter @Setter @NoArgsConstructor
public class Sort {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sortId;

	@OneToMany(mappedBy = "sort")
	private List<Exchange> exchanges;
	
	@OneToMany(mappedBy = "sort")
	private List<OrderBook> orderBooks;
	
	public Sort() {}

	public Sort(int sortId, List<Exchange> exchanges, List<OrderBook> orderBooks) {
		super();
		this.sortId = sortId;
		this.exchanges = exchanges;
		this.orderBooks = orderBooks;
	}
	
	

}
