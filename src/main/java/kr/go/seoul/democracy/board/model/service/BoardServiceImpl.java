package kr.go.seoul.democracy.board.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.seoul.democracy.board.model.dao.BoardDAO;
import kr.go.seoul.democracy.board.model.vo.BoardNotice;
import kr.go.seoul.democracy.member.model.dao.MemberDAO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO bDAO;

	@Override
	public int noticeNewsTotalCount() {
		
		return bDAO.noticeNewsTotalCount();

	}

	@Override
	public ArrayList<BoardNotice> noticeNewsList(int pageSize, int currentListPage) {
		return bDAO.noticeNewsList(pageSize,currentListPage);

	}





	



}
