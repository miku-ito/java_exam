package com.example.test_spring_mvc_miku;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam04")
public class ReceiveNameController {

    @ModelAttribute
	public ReceiveNameForm setUpForm() {
		return new ReceiveNameForm();
	}

    @RequestMapping("") 
    public String index() {
        return "exam-04-name-form";
    }

    @RequestMapping("/receivename2")
    public String receiveName2(ReceiveNameForm receiveNameForm) {
        System.out.println("入力された値は"+receiveNameForm.getName()+"です。");
        return "finished";
    }
}
