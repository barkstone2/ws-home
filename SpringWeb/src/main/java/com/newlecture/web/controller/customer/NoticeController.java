package com.newlecture.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	// list, detail, edit, reg, del
	// 행위를 담당하는 기능들을 한 컨트롤러에 모은다.
	// 컨트롤러의 이름은 상위 경로인 NoticeController로 한다.
	
	@GetMapping("list") 
	public String list(Model model) {
		
		int page = 1;
		String field = "title";
		String query = "3";
		
		List<NoticeView> list = service.getList(page, field, query);
		
		model.addAttribute("list", list);
		
		//return "/customer/notice/list"; ResourceViewResolver
		return "customer.notice.list"; // TilesViewResolver
	}
	
	@GetMapping("detail") 
	public String detail() {
		return "customer.notice.detail";
	}
	
	
}
