package com.Yao.ProjectTaste.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer{
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/index.html").setViewName("index");//首頁
		registry.addViewController("/about.html").setViewName("about");//關於
		registry.addViewController("/User.html").setViewName("User");//會員
		registry.addViewController("/pricing.html").setViewName("pricing");//宅配
		registry.addViewController("/cart.html").setViewName("cart");//購物車
		//其實根本沒有main.html這個檔案 這只是一個請求 為了讓url不要洩漏資料
		registry.addViewController("/main.html").setViewName("cart");
		
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
		//前綴都要加上/不然會產生無窮迴圈！
		.excludePathPatterns("/User.html","/","/user/login","/css/*","/js/**","/images/**","/main.html"
				,"/index.html","/about.html","/cart.html");
	}
	
	
}
