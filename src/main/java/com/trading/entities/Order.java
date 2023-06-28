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

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	public OrderBook getOrderBookId() {
		return orderBookId;
	}

	public void setOrderBookId(OrderBook orderBookId) {
		this.orderBookId = orderBookId;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
