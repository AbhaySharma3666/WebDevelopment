package com.spring._13_spring_in_vscode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    @GetMapping("/getData")
    public Student restEndpoint() {

        Student st = new Student();
        st.setId(1);
        st.setName("John Doe");
        st.setCity("New York");
        
        return st;
    }
}
