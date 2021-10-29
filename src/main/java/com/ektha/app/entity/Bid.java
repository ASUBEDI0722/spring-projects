package com.ektha.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "bids")
@Entity
public class Bid implements Serializable {

	@Id
	@Column(name="bid_id")
	private int bidId;
	@Column(name="bid_price")
	private float bidPrice;

	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item;
	
	public Bid() {
		// TODO Auto-generated constructor stub
	}

	public Bid(int bidId, float bidPrice) {
		super();
		this.bidId = bidId;
		this.bidPrice = bidPrice;
	}

}
