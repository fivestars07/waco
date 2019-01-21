package com.play.waco.repository;

import org.apache.ibatis.annotations.Mapper;

import com.play.waco.entity.Player;

@Mapper
public interface PlayerMapper {

	public Player selectPlayerById(Long id);
	public void insertPlayer(Player player);
	
}
