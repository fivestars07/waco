package com.play.waco.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.waco.dto.TournamentDto;
import com.play.waco.service.TournamentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TournamentController {

	private TournamentService tournamentService;
	
	@ResponseBody
	@PostMapping("/tournament/create")
	public String createTournament(@RequestBody TournamentDto dto) {
		
		tournamentService.tournamentCreate(dto);
		
		return "it's right";
	}
	
}
