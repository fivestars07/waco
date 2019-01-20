package com.play.waco.repository;

import org.apache.ibatis.annotations.Mapper;

import com.play.waco.entity.GYM;

@Mapper
public interface GYMMapper {

	public void insertGYM(GYM gym);
	public GYM selectGYMById(Long id);  
	
}
