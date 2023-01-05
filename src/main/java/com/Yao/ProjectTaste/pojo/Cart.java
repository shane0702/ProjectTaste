package com.Yao.ProjectTaste.pojo;
//應用層 bean也會寫在這

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "orders")
public class Cart {
	
	@Id
	private int OrderID;
	@Column(name="unit")
	private int unit;
	@Transient
	private User user;
	@Transient
	private Products products;
}
