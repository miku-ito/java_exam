package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Domain.Member;

@Controller
@RequestMapping("ex")
public class ExamThymeleafController {

    @RequestMapping("")
    public String index() {
        return "ex-thymeleaf-input";
    }

    @RequestMapping("result")
    public String result(Member member, Model model) {
        
        model.addAttribute("member", member);
        return "ex-thymeleaf-result";
    }
}
