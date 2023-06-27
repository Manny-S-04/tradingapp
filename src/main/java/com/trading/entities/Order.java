package com.trading.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;

	@ManyToOne
	@JoinColumn(name = "userid")
	private User userid;

	@ManyToOne
	@JoinColumn(name = "order_book_id")
	private OrderBook orderBookId;

	@Column(name = "order_type")
	private String orderType;

	@Column(name = "status")
	private String status;

	@Column(name = "stock")
	private String stock;

	@Column(name = "price")
	private double price;

	public Order() {
	}

	public Order(int userId, int orderBookId, String orderType, String status, String stock, double price) {
	    super();
	    this.userid = new User();
	    this.userid.setUserid(userId);
	    this.orderBookId = new OrderBook();
	    this.orderBookId.setOrderBookId(orderBookId);
	    this.orderType = orderType;
	    this.status = status;
	    this.stock = stock;
	    this.price = price;
	}
}
