package com.Yao.ProjectTaste.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.cj.util.StringUtils;


//import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class loginController {
	
	@RequestMapping("/user/login")
	public String login(@RequestParam("username") String username, 
						@RequestParam("password") String password, 
						Model model,
						HttpSession session) 
	{
		//具體怎麼登入寫在這裡
		if (!StringUtils.isNullOrEmpty(username) && "123456".equals(password)) {
			session.setAttribute("username",username);
			//為了讓跳轉頁面不要沒加載到靜態資源 要用重新定向 redirect
			return "redirect:/main.html"; //登入成功 重定向到購物車
		}else {
			model.addAttribute("msg","error user or password");
			return "redirect:/index.html";//失敗 回到頁面
		}
	}
}
