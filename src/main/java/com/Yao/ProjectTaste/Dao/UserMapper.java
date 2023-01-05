package com.Yao.ProjectTaste.Dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;


import com.Yao.ProjectTaste.pojo.User;
@Mapper
public interface UserMapper {
	//獲取全部用戶
	List<User> getuserList();
	//依照用戶id獲取客戶 返回類型是一個user
	User getUserbyId(int id);
	//這裡不懂為什麼增加一個用戶是int?
	int addUser(User user);
	//修改
	int updateUser(User user);
	//刪除
	int deleteUser(int id);
	//萬能map
	int addUserByMap(Map<String,Object> map);
	//一對多範例
	List<User> getUserandCarts();
	
}
