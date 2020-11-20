package org.zerock.mapper;

import org.zerock.domain.BoardVo;

import java.util.List;

public interface BoardMapper {
   // @Select("select * from tbl_board where bno > 0")
    public List<BoardVo> getlst();

}
