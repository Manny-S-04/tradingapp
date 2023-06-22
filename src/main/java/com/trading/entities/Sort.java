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
	private int sortid;
	
	@OneToMany(mappedBy = "exchangeId")
	private List<Exchange> exchanges;
	
	@OneToMany(mappedBy = "orderBookId")
	private List<OrderBook> orderBooks;

}
