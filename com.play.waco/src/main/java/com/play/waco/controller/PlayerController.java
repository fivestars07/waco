package com.play.waco.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.waco.dto.PlayerDto;
import com.play.waco.repository.PlayerMapper;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class PlayerController {

	private PlayerMapper playerMapper;
	
	@PostMapping("/player/reg")
	public void registerPlayer(@RequestBody PlayerDto dto) {
		playerMapper.insertPlayer(dto.toEntity());
	}
	
}
