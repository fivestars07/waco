package com.play.waco.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.waco.dto.PlayerDto;
import com.play.waco.entity.Player;
import com.play.waco.service.PlayerService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class PlayerController {

	//private PlayerMapper playerMapper;
	private PlayerService playerService;
	
	@PostMapping("/player/reg")
	public void registerPlayer(@RequestBody PlayerDto dto) {
		//playerMapper.insertPlayer(dto.toEntity());
		playerService.registerPlayer(dto);
	}

	@PostMapping("/player/byId")
	@ResponseBody
	public Player selectById(@RequestBody PlayerDto dto) {
		//return playerMapper.selectPlayerById(dto.getId());
		return playerService.selectById(dto.getId());
	}
	
}
