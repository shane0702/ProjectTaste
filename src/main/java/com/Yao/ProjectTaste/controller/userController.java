package com.Yao.ProjectTaste.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Yao.ProjectTaste.Dao.UserMapper;
import com.Yao.ProjectTaste.pojo.User;

@RestController
public class userController {
	//要有service層才對 不可以直接呼叫dao
	@Autowired
	private UserMapper usermapper;
	@GetMapping("/getuserlist")
	public String getuserList(Model model) {
		Collection<User> userlist= usermapper.getuserList();
		model.addAttribute("user",userlist);
		//return到用戶資料頁面 好像錯誤了 是要返回後台數據頁面才對
		return "User";
	}
}
