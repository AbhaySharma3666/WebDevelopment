package com.spring._13_spring_in_vscode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping(value = "/", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String mainPage() {
        String t1 = "Hello, You are using SpringBoot in VSCode!";
        String t2 = "Click here to open <a href=\"http://localhost:8080/getData\">/getData</a>";
        
        return t1 + "<br>" + t2;
    }
    
}
