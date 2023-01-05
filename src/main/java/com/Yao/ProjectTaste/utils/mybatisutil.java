package com.Yao.ProjectTaste.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class mybatisutil {
	
	private static SqlSessionFactory sqlSessionFactory;
		static {
			try {
				//獲取myBatis的第一步 獲取sessionFactory類
				String resource = "mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}catch(IOException e) {
				e.printStackTrace();
			}
			

	}
	//第二步 sqlSessionfactory是製造sqlSession的工廠 要使用的話要調用工廠裡面的openSesson()
	public static SqlSession getsqlsession() {
		
		return sqlSessionFactory.openSession();
	}
}
