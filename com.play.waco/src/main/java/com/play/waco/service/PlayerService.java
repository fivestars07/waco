package com.play.waco.service;

import org.springframework.stereotype.Service;

import com.play.waco.dto.PlayerDto;
import com.play.waco.entity.Player;
import com.play.waco.repository.PlayerMapper;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class PlayerService {

	private PlayerMapper playerMapper;
	
	public void registerPlayer(PlayerDto dto) {
		playerMapper.insertPlayer(dto.toEntity());
	}
	
	public Player selectById(Long id) {
		return playerMapper.selectPlayerById(id);
	}
	
	
}
