package com.play.waco.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.waco.dto.GYMDto;
import com.play.waco.repository.GYMMapper;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class GyMController {

	private GYMMapper gymMapper;
	
	@PostMapping("/gym/reg")
	public void registerGYM(@RequestBody GYMDto dto) {
		gymMapper.insertGYM(dto.toEntity());
	}
	
}
