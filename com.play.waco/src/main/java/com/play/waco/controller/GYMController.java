package com.play.waco.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.waco.dto.GYMDto;
import com.play.waco.service.GYMService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class GYMController {

	private GYMService gymService;
	
	@PostMapping("/gym/reg")
	public void registerGYM(@RequestBody GYMDto dto) {
		gymService.registerGYM(dto);
	}
	
}
