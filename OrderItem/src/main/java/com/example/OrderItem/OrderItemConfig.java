package com.example.OrderItem;


import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class OrderItemConfig implements WebMvcConfigurer{
	
	public class WebConfig implements WebMvcConfigurer {
	    @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	                .allowedOrigins("http://localhost:4200")  // Angular's default port
	                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
	    }
	}



}
