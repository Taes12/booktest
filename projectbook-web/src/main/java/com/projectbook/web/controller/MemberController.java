package com.projectbook.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.projectbook.web.domain.Member;
import com.projectbook.web.service.MemberService;

@Controller
@SessionAttributes("member")
public class MemberController {
	
	private MemberService memberService;
	
	@Autowired
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(Model model, @RequestParam("id") String id,
			@RequestParam("pass") String pass,
			HttpSession session, HttpServletResponse response)
				throws ServletException, IOException{
		int result = memberService.login(id, pass);
		
		if(result == -1) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println(" alert('존재하지 않는 아이디 입니다.');");
			out.println(" history.back();");
			out.println("</script>");
			
			return null;
		}else if(result == 0 ) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println(" alert('비밀번호가 다릅니다.');");
			out.println(" location.href='loginForm'");
			out.println("</script>");
			
			return null;
		}
		
		Member member = memberService.getMember(id);
		session.setAttribute("isLogin", true);
		
		model.addAttribute("member",member);
		System.out.println("member.name : " + member.getName());
		
		return "redirect:/bookList";
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/bookList";
	}
}
