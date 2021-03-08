package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Mapper
public interface NoticeDao {

//	배열 형태로 여러개 넣을 수 있음.
//	컬럼명과 dto 필드 이름이 다를 때.
//	@Results({
//		@Result(property = "memberName", column = "member_name")
//	})
//	@Select("select * from (select rownum rn, nv.* from "
//			+ "(select * from noticeView "
//			+ "where ${field} like '%${query}%' "
//			+ "order by regdate desc) nv) "
//			+ "where rn between 1+(#{page}-1)*10 and #{page}*10")
	List<NoticeView> getViewList(int page, String field, String query, boolean pub);
	int getCount(String field, String query, boolean pub);
	NoticeView getView(int id);
	
	Notice getNext(int id);
	Notice getPrev(int id);

	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);

	int deleteAll(int[] ids);
	//int updatePubAll(int[] pubIds, int[] closeIds);
	int updatePubAll(int[] ids, boolean pub);
}
