package com.example.demo.rest.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "product_table")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Product implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String productName;
	
	private double productPrice;
	
//	if i add json ignore here it will ignore orders so if we have to fetch orders we don't include here
//	@JsonIgnore
	@OneToMany(mappedBy = "orderPk.product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Order> orders;
}
