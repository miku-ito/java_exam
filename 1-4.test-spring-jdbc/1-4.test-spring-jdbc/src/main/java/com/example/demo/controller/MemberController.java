package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		System.out.println(repository.findAll());
		System.out.println(repository.load(2));
		Member member = new Member();
		member.setName("伊藤美空");
		member.setAge(23);
		member.setDepId(2);
		repository.save(member);
		return "member";
	}
}
