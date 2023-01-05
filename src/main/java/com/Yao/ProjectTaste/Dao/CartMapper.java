package com.Yao.ProjectTaste.Dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.Yao.ProjectTaste.pojo.Cart;
@Mapper //這表示這是一個myBatis 的Mapper類
@Repository //表示這是一個Dao層
public interface CartMapper {
	
	List<Cart> getuser();
	List<Cart> getuser2();


}
