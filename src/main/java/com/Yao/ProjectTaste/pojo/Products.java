package com.Yao.ProjectTaste.pojo;


import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
	@Id
	private int id;
	
	private String productname;
	
	private int price;
	
	
	
}
