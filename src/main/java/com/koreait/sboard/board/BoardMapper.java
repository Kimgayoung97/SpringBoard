package com.koreait.sboard.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.koreait.sboard.model.BoardCmtDomain;
import com.koreait.sboard.model.BoardCmtEntity;
import com.koreait.sboard.model.BoardDTO;
import com.koreait.sboard.model.BoardDomain;
import com.koreait.sboard.model.BoardEntity;

@Mapper
public interface BoardMapper {
	int insBoard(BoardEntity p);
	List<BoardDomain> selBoardList(BoardDTO P);
	BoardDomain selBoard(BoardDTO p);
	int updBoardHits(BoardDTO p);
	int updBoard(BoardEntity p);
	int delBoard(BoardDTO p);
//----------------------------- CMT -------------------------------//	
	int insCmt(BoardCmtEntity p);
	List<BoardCmtDomain> selCmtList(int p);
}
