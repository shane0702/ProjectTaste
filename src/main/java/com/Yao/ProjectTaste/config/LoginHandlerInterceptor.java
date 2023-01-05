package com.Yao.ProjectTaste.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginHandlerInterceptor implements HandlerInterceptor{
	//快速生成方法的按鍵：command + option + s
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//登入成功的狀況：擁有用戶的資料 如何擁有 用httpSession
		Object loginuser =request.getSession().getAttribute("username");
		if (loginuser != null) {
			request.setAttribute("msg", "請先登入");
			request.getRequestDispatcher("/User.html").forward(request, response);
			return false;
		} else {
				return true;
		}
	}
	
		
}
