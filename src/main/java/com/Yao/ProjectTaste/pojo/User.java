package com.Yao.ProjectTaste.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="user")
public class User {
	@Id
	private int id;
	@Column(name = "name")
	private String name;
	@Transient
	private Cart cart;
	
}
