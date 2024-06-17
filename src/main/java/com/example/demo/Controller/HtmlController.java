package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

	 @GetMapping("/index")
	    public String index() {
	        return "index"; // This corresponds to src/main/resources/templates/index.html
	    }
	 
	 @GetMapping("/autoResultGen")
	    public String autoResultGen() {
	        return "autoResultGen"; // This corresponds to src/main/resources/templates/index2.html
	    }
}
