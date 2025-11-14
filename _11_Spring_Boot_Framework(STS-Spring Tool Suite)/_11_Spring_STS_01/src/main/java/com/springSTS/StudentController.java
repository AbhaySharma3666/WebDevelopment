package com.springSTS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

	@RequestMapping("go")
	@ResponseBody
	public String hello() {
		return "hello... this project created through STS (Spring Tool Suite)";
	}
}
