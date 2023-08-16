package com.multi.shoes4jo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.multi.shoes4jo.vo.BoardVO;

@Mapper
public interface BoardMapper {
    @Select("SELECT * FROM board ORDER BY bno DESC")
    List<BoardVO> selectAll();

    @Select("SELECT * FROM board WHERE bno = #{bno}")
    BoardVO select(@Param("bno") String bno);

    @Insert("INSERT INTO board (title, content, writer) VALUES (#{title}, #{content}, #{writer})")
    void insert(BoardVO board);

    @Update("UPDATE board SET title = #{title}, content = #{content} WHERE bno = #{bno}")
    void update(BoardVO board);

    @Update("UPDATE board SET viewcnt = viewcnt + 1 WHERE bno = #{bno}")
    void updateCount(@Param("bno") String bno);

    @Delete("DELETE FROM board WHERE bno = #{bno}")
    void delete(@Param("bno") String bno);
}
