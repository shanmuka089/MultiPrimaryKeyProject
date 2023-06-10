package com.example.demo.rest.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Embeddable
public class OderPrimaryKey implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long orderPk;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
//	if we add json ignore properties here it will ignore the product so it will stop the circular dependency.
	@JsonIgnoreProperties("orders")
	private Product product;
}
