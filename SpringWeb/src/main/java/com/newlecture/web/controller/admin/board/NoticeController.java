package com.newlecture.web.controller.admin.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@GetMapping("list")
	public String list(Model model) {
		
		int page = 1;
		String field = "title";
		String query = "3";
		
		List<NoticeView> list = service.getList(page, field, query);
		
		return "admin.board.notice.list";
	}
	
	@GetMapping("detail")
	public String detail() {
		
		Notice notice = service.get(1);
		
		return "admin.board.notice.detail";
	}
	
	@GetMapping("reg")
	public String reg() {
		
		return "admin.board.notice.reg";
	}
	
	
	
}
