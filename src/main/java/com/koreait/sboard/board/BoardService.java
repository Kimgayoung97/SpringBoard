package com.koreait.sboard.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreait.sboard.model.BoardCmtDomain;
import com.koreait.sboard.model.BoardCmtEntity;
import com.koreait.sboard.model.BoardDTO;
import com.koreait.sboard.model.BoardDomain;
import com.koreait.sboard.model.BoardEntity;

@Service
public class BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	public int insBoard(BoardEntity p) {
		return mapper.insBoard(p);
	}
	
	public List<BoardDomain> selBoardList(BoardDTO p){
		if(p.getTyp() == 0) {
			p.setTyp(1);
		}	
		return mapper.selBoardList(p);
	}
	
	public BoardDomain selBoard(BoardDTO p) {
		//조회수
		mapper.updBoardHits(p);
		return mapper.selBoard(p);	
	}
	
	public int updBoard(BoardEntity p) {
		return mapper.updBoard(p);
	}
	
	public int delBoard(BoardDTO p) {
		return mapper.delBoard(p);
	}
	
//----------------------------- CMT -------------------------------//
	
	public int insCmt(BoardCmtEntity p) {
		return mapper.insCmt(p);
	}
	public List<BoardCmtDomain> selCmtList(int i_board) {
		return mapper.selCmtList(i_board);
	}
	
	
}
