package com.company.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("firstdemo")
public class FirstAction {
	//1-ȡֵ ���û�����URL��http://ip:port/project/first
	@RequestMapping("first")
	public String firstDemo(){
		System.out.println("springmvc first demo!");//2-����
		return "success";//3-����
		//VeiwResolver �������� /WEB-INF/views/success.jsp
	}
}
