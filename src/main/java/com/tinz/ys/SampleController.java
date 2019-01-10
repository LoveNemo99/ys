package com.tinz.ys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tinz.ys.service.UserService;
 
@Controller
//@EnableAutoConfiguration
public class SampleController {

	@Autowired
	UserService userService;
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/index")
    public String index() {
//    	User u = userService.getById(1);
//    	System.out.println(userService.login("zr", "123456"));
//    	System.out.println(u+"==========");
    	return "index";
    }
    @RequestMapping("/swagger")
    public String swagger() {
    	return "redirect:swagger-ui.html";
    }
    
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(SampleController.class, args);
//    }
}
