package com.ektha.app.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "item")
@Entity
public class Item implements Serializable {

	@Id
	@Column(name = "item_id")
	private int itemId;
	@Column(name = "item_name")
	private String itemName;
	@Column(name = "bid_start_date")
	private LocalDate bidStartDate;
	@Column(name = "bid_end_date")
	private LocalDate bidEndDate;

	public Item() {

	}

	@OneToMany(mappedBy ="item")
	private Set<Bid> bids = new HashSet<Bid>();

//	public Item(int itemId, String itemName, LocalDate bidStartDate, LocalDate bidEndDate, Set<Bid> bids) {
//		super();
//		this.itemId = itemId;
//		this.itemName = itemName;
//		this.bidStartDate = bidStartDate;
//		this.bidEndDate = bidEndDate;
//		this.bids = bids;
//	}
   
	

}
