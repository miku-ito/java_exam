package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam01")
public class Exam01Controller {

    @RequestMapping("")
    public String index() {
        return "exam01";
    }

    @RequestMapping("request")
    public String request(String email, String password, Model model) {
        if ("yamada@sample.com".equals(email) && "yamayama".equals(password)) {
            model.addAttribute("result", "成功");
        } else {
            model.addAttribute("result", "失敗");
        }

        return "exam01-result";
    }
}
