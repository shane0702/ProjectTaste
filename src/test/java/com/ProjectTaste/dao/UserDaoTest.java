package com.ProjectTaste.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import com.Yao.ProjectTaste.Dao.UserMapper;
import com.Yao.ProjectTaste.pojo.User;
import com.Yao.ProjectTaste.utils.mybatisutil;

public class UserDaoTest {
	
	@Test
	public void test() {
		//獲取對象
		SqlSession sqlsession = mybatisutil.getsqlsession();
		//執行sql
		UserMapper userrepository = sqlsession.getMapper(UserMapper.class);
		List<User> userList = userrepository.getuserList();
		
		for(User user: userList) {
			System.out.println(user);
		}
		
		sqlsession.close();
	}
	
	/*@Test
	public void getUserbyId() {
		
		//打開工具包--> 類 -->對象--> 調用方法--> 給參數--> 關掉包

		//固定寫法 （獲得工具包裡的sqlSession類）
		SqlSession sqlsession = mybatisutil.getsqlsession();
		//用sqlSession類獲取一個 mapper (來源是接口)
		UserMapper user= sqlsession.getMapper(UserMapper.class);
		//這裡開始就是面向對象了 可以直接調用該接口設定好的方法
		User getid = user.getUserbyId(1);
		//記得印出來
		System.out.println(getid);
		
		//固定寫法 （記得關掉）
		sqlsession.close();
	}*/
	/*@Test
	public void addUser() {
		
		//固定寫法 （獲得工具包裡的sqlSession類）
		SqlSession sqlsession = mybatisutil.getsqlsession();
		//用sqlSession類獲取一個 mapper (來源是接口)
		UserRepository user= sqlsession.getMapper(UserRepository.class);
		//這裡開始就是面向對象了 可以直接調用該接口設定好的方法
		int result = user.addUser(new User(4,"hii"));
		if(result > 0) System.out.println("success");
		//增刪改都要記得commit
		sqlsession.commit();		
		//固定寫法 （記得關掉）
		sqlsession.close();
	}*/
	/*@Test
	public void updateUser() {
		SqlSession sqlsession = mybatisutil.getsqlsession();
		UserMapper user = sqlsession.getMapper(UserMapper.class);
		user.updateUser(new User(4,"hehe"));
		
		sqlsession.commit();
		sqlsession.close();
	}*/
	/*@Test
	public void deleteUser() {
		SqlSession sqlsession = mybatisutil.getsqlsession();
		UserMapper user = sqlsession.getMapper(UserMapper.class);
		user.deleteUser(4);
		
		sqlsession.commit();
		sqlsession.close();
	}*/
	/*
	 @Test
	public void addUserByMap() {
		SqlSession sqlsession = mybatisutil.getsqlsession();
		UserMapper user = sqlsession.getMapper(UserMapper.class);
		Map<String,Object> map = new HashMap<>();
		map.put("userid",5);
		map.put("username", "yoa");
		user.addUserByMap(map);
		
		sqlsession.commit();
		sqlsession.close();
	}
	*/
	
	@Test
	public void getuserandcart() {
		SqlSession sqlSession = mybatisutil.getsqlsession();
		UserMapper map = sqlSession.getMapper(UserMapper.class);
		List<User> res=map.getUserandCarts();
		for (User user : res) {
			System.out.println(user);
		}
		sqlSession.close();
	}
	
	

}
