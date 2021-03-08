package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Service
public class NoticeServiceImp implements NoticeService{
	
	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<NoticeView> getViewList(boolean pub) {
		return getViewList(1, "title", "", pub);
	}

	@Override
	public List<NoticeView> getViewList(String field, String query, boolean pub) {
		return getViewList(1, field, query, pub);
	}

	@Override
	public List<NoticeView> getViewList(int page, String field, String query, boolean pub) {
		List<NoticeView> list = noticeDao.getViewList(page, field, query, pub);
		
		return list;
	}

	@Override
	public int getCount() {
		return getCount("title", "", true);
	}

	@Override
	public int getCount(String field, String query, boolean pub) {
		return noticeDao.getCount(field, query, pub);
	}

	@Override
	public NoticeView getView(int id) {
		
		NoticeView notice = noticeDao.getView(id);
		
		return notice;
	}

	@Override
	public Notice getNext(int id) {
		return noticeDao.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		return noticeDao.getPrev(id);
	}

	@Override
	public int updatePubAll(int[] pubIds, int[] closeIds) {
		int result = 0;
		
		result += noticeDao.updatePubAll(pubIds, true);
		result += noticeDao.updatePubAll(closeIds, false);
		return result;
		
	}

	@Override
	public int deleteAll(int[] ids) {
		return noticeDao.deleteAll(ids);
	}

	@Override
	public int update(Notice notice) {
		return noticeDao.update(notice);
	}

	@Override
	public int delete(int id) {
		return noticeDao.delete(id);
	}

	@Override
	public int insert(Notice notice) {
		return noticeDao.insert(notice);
	}

	

}
