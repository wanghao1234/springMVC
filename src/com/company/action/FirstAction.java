package com.company.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("firstdemo")
public class FirstAction {
	//1-取值 当用户输入URL：http://ip:port/project/first
	@RequestMapping("first")
	public String firstDemo(){
		System.out.println("springmvc first demo!");//2-处理
		return "success";//3-反馈
		//VeiwResolver 将解析成 /WEB-INF/views/success.jsp
	}
}
