package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

public interface NoticeService {

	// 페이지 요청
	List<NoticeView> getViewList();

	// 검색을 요청
	List<NoticeView> getViewList(String field, String query);

	// 페이지 요청
	List<NoticeView> getViewList(int page, String field, String query);

	int getCount();

	int getCount(String field, String query);

	// 자세한 페이지 요청
	NoticeView getView(int id);

	Notice getNext(int id);

	Notice getPrev(int id);

	// 일괄 공개를 요청
	int updatePubAll(int[] pubIds, int[] closeIds);

	// 일괄 삭제를 요청
	int deleteAll(int[] ids);

	// 수정 페이지를 요청
	int update(Notice notice);

	int delete(int id);

	int insert(Notice notice);

}
