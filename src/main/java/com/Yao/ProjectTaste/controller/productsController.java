package com.Yao.ProjectTaste.controller;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Yao.ProjectTaste.Dao.ProductMapper;
import com.Yao.ProjectTaste.pojo.Products;


//restful api 寫在這

@RestController
public class productsController {
	/* private ProductMapper productsmapper;
	 @GetMapping("/getproduct")
	 public List<Products> findById(){
		 List<Products> productlist =productsmapper.findById(1);
		 for (Products products : productlist) {
			System.out.println(products);
		}
		 return productlist;
	 }*/
	
	
}



