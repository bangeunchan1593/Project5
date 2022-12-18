package com.example;

import com.example.bean.BoardVO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardRowMapper implements RowMapper<BoardVO> {
    @Override
    public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
        BoardVO vo = new BoardVO();
        vo.setSeq(rs.getInt("seq"));
        vo.setRestaurant(rs.getString("restaurant"));
        vo.setMenu(rs.getString("menu"));
        vo.setPrice(rs.getString("price"));
        vo.setOpen_time(rs.getString("open_time"));
        vo.setClose_time(rs.getString("close_time"));
        vo.setLocation(rs.getString("location"));
        vo.setStar_point(rs.getString("star_point"));
        vo.setReview(rs.getString("review"));
        vo.setRegdate(rs.getDate("regdate"));
        return vo;
    }
}
