package com.ProjectTaste;

import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes=com.Yao.ProjectTaste.TasteApplication.class)
class ProjectTasteApplicationTests {
	
	@Autowired
	javax.sql.DataSource datasource;
	
	@Test
	void contextLoads() throws SQLException{
		System.out.println(datasource.getClass());
		System.out.println(datasource.getConnection());
	
	}

}
