package com.play.waco.repository;

import org.apache.ibatis.annotations.Mapper;

import com.play.waco.entity.Match;

@Mapper
public interface MatchMapper {

	public void insertMatch(Match match);

}
