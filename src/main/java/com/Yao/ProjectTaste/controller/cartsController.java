package com.Yao.ProjectTaste.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Yao.ProjectTaste.Dao.CartMapper;
import com.Yao.ProjectTaste.pojo.Cart;


@RestController
public class cartsController {
	
	@Autowired
	private CartMapper cartmapper;
	@GetMapping("getuserbycart")
	public List<Cart> getuser(){
		List<Cart> cartuser=cartmapper.getuser();
		for (Cart cart : cartuser) {
			System.out.println(cart);
		}
		return cartuser;
	}
	

	

}
