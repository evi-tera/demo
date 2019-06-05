package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
@ComponentScan
@EnableConfigurationProperties
@Controller
public class MenuController {
	
	@RequestMapping("/menu")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
	
		
        model.addAttribute("name", name);
        return "menu";
    }
}
