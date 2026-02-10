package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Form.Exam02Form;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("exam02")
public class Exam02Controller {


    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "exam02";
    }

    @RequestMapping("session") 
    public String output (Exam02Form exam02Form) {
        String result = (exam02Form.getNumber1() + exam02Form.getNumber2());
        session.setAttribute("result", result);
        return "exam02-result";
    }


    @RequestMapping("session2")
    public String output2() {
        return "exam02-result";
    }
}
