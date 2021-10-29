package com.ektha.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ordertab")
public class Order {
	
	@Id
	@Column(name="order_id")
	private Long orderId;
	@Column(name="order_status")
	private OrderStatus orderStatus;
	
	@OneToOne
	@JoinColumn(name="item_id")
	private Item item;

}
