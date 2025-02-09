package io.groom.mybatis.dynamic.mapper;

import io.groom.mybatis.model.Board;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicMapper {

    List<Board> selectAll();

    List<Board> select2(@Param("orderBy") String orderBy, @Param("orderDirection") String orderDirection);

    List<Board> select3(@Param("ids") String[] ids);

    List<Board> select4(@Param("condition") String condition, @Param("searchtxt") String searchtxt);
}
