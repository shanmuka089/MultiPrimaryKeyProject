package com.example.demo.rest.model;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_table")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order implements Serializable{


	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OderPrimaryKey orderPk;
	
	private int noOfOrders;
	
	private String address;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
//    private Product product;
}
