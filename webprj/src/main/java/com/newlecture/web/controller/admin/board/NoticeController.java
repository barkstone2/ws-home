package com.newlecture.web.controller.admin.board;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	@Autowired
	private ServletContext ctx;
	
	@RequestMapping("list")
	public String list() {
		
		return "admin.board.notice.list";
	}
	
	//과거 버전 get, post 매핑
	//@RequestMapping(value = "reg", method = RequestMethod.GET)
	@GetMapping("reg")
	public String reg() throws IllegalStateException, IOException {
		
		return "admin.board.notice.reg";
	}
	
	@PostMapping("reg")
	public String reg(String title, String content, MultipartFile[] files, String category, HttpServletRequest request) throws IllegalStateException, IOException {
		
		
		for(MultipartFile file : files) {
			String fileName = file.getOriginalFilename();
			long fileSize = file.getSize();
			System.out.printf("fileName:%s, fileSize:%d\n",fileName,fileSize);
			
			//ServletContext ctx = request.getServletContext();
			String webPath = "/static/upload";
			String realPath = ctx.getRealPath(webPath);
			System.out.printf("realPath : %s\n", realPath);
			
			// 업로드 경로가 없을 경우 확인 후 폴더 생성
			File savePath = new File(realPath);
			if(!savePath.exists()) {
				savePath.mkdirs();
			}
			
			// 파일 경로 + 구분자 + 파일이름
			realPath += File.separator + fileName;
			//파일 세이브
			File saveFile = new File(realPath);
			file.transferTo(saveFile);
		}
		
		return "admin.board.notice.reg";
	}
	
	@RequestMapping("edit")
	public String edit() {
		
		return "admin.board.notice.edit";
	}
	
	@RequestMapping("del")
	public String del() {
		
		return "";
	}
	
}
