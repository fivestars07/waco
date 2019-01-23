package com.play.waco.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.waco.dto.MatchDto;
import com.play.waco.service.MatchService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class MatchController {

	private MatchService matchService;
	
	@PostMapping("/match/reg")
	public void registerMatch(@RequestBody MatchDto dto) {
		matchService.registerMatch(dto);
	}
	
}
