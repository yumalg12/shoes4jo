package com.multi.shoes4jo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.shoes4jo.mapper.BoardMapper;
import com.multi.shoes4jo.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardMapper boardMapper;

	@Override
	public List<BoardVO> selectList() {
		List<BoardVO> list = boardMapper.selectAll();
		return list;
	}

	@Override
	public List<BoardVO> selectNews() {
		List<BoardVO> list = boardMapper.selectNews();
		return list;
	}
	
	@Override
	public List<BoardVO> selectEvents() {
		List<BoardVO> list = boardMapper.selectEvents();
		return list;
	}
	
	@Override
	public List<BoardVO> selectColumns() {
		List<BoardVO> list = boardMapper.selectColumns();
		return list;
	}
	
	@Override
	public List<BoardVO> selectOneCat(String category) {
		List<BoardVO> list = boardMapper.selectOneCat(category);
		return list;
	}

	@Override
	public BoardVO selectOne(String bno) {
		BoardVO board = boardMapper.select(bno);
		return board;
	}

	@Override
	public void updateviewcnt(String bno) {
		boardMapper.updateCount(bno);
	}

	@Override
	public void insertOne(BoardVO board) {
		boardMapper.insert(board);
	}

	@Override
	public void updateOne(BoardVO board) {
		boardMapper.update(board);
	}

	@Override
	public void deleteOne(String bno) {
		boardMapper.delete(bno);
	}
}
