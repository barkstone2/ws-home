package com.selfaca.self.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selfaca.self.member.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	private MemberService memberService;
	
	public MemberController() {
		memberService = new MemberService();
	}
	
	
	@RequestMapping("/join")
	public String mJoin(Model model, HttpServletRequest request) {
		
		return "memberJoin";
	}
	
	@RequestMapping("/joinProc")
	public String mJoinProc(Model model, HttpServletRequest request) {
		String mId = request.getParameter("mId");
		String mPw = request.getParameter("mPw");
		String mName = request.getParameter("mName");
		model.addAttribute("service", "mJoin");
		model.addAttribute("result", memberService.memberJoin(mId, mPw, mName));
		return "memberResult";
	}
	
	@RequestMapping("/login")
	public String mLogin(Model model, HttpServletRequest request) {
		
		return "memberLogin";
	}
	
	@RequestMapping("/loginProc")
	public String mLoginProc(Model model, HttpServletRequest request) {
		String mId = request.getParameter("mId");
		String mPw = request.getParameter("mPw");
		
		return "memberResult";
	}
	
	
}
