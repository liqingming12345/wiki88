package com.jiawa.wiki88.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocMapperCust {

    public void increaseViewCount(@Param("id")Long id);
}
