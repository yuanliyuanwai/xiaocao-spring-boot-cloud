package top.wanzc.spring.boot.hello.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.wanzc.spring.boot.hello.config.RateLimitConfig;
import top.wanzc.spring.boot.hello.dto.Cat;

@RestController
public class HelloController {
	
	@Autowired
	private List<Cat> cats;
	
	@Autowired
	private RateLimitConfig rateLimitConfig;
	
    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!";
    }
    
    @RequestMapping("/cats")
    public List<Cat> cats() {
    	return new ArrayList<Cat>(cats);
    }
    
    @RequestMapping("/config")
    public RateLimitConfig config() {
    	return rateLimitConfig;
    }
    
}