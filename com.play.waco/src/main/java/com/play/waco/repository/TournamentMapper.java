package com.play.waco.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.play.waco.entity.Tournament;

@Mapper
public interface TournamentMapper {

	public List<Tournament> selectMatchPlayerInfo(Tournament tournament );
	
}
