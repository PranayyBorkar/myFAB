package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig implements WebMvcConfigurer{

	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	                .allowedOrigins("http://127.0.0.1:5500", "http://localhost:5500"," http://localhost:3000","http://127.0.0.1:5501/",
	                	"http://192.168.1.81:3000/","http://localhost:3000/","http://192.168.1.81:3000","http://127.0.0.1:5500/index2.html","http://127.0.0.1:5500/index2.html/","http://127.0.0.1:5501/serverSide/index2.html",
	                	" http://192.168.45.210:3000"," http://192.168.45.210:3000/","http://116.202.33.18:8080/","http://116.202.33.18:8080")
	                .allowedMethods("GET", "POST", "PUT", "DELETE")
	                .allowedHeaders("*")
	                .allowCredentials(true);
	    }
}
