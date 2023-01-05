package com.ProjectTaste.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import com.Yao.ProjectTaste.Dao.CartMapper;
import com.Yao.ProjectTaste.pojo.Cart;
import com.Yao.ProjectTaste.utils.mybatisutil;

public class CartDaoTest {
	@Test
	public void getCart() {
		SqlSession sqlSession =  mybatisutil.getsqlsession();
		CartMapper map = sqlSession.getMapper(CartMapper.class);
		List<Cart> list = map.getuser();
		for (Cart cart : list) {
			System.out.println(cart);
		}
		sqlSession.close();
		
	}
	
	
	@Test
	public void getCart2() {
		SqlSession sqlSession =  mybatisutil.getsqlsession();
		CartMapper map = sqlSession.getMapper(CartMapper.class);
		List<Cart> list = map.getuser();
		for (Cart cart : list) {
			System.out.println(cart);
		}
		sqlSession.close();
		
	}
	

}
