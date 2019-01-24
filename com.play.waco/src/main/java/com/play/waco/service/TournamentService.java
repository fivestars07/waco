package com.play.waco.service;

import org.springframework.stereotype.Service;

import com.play.waco.dto.TournamentDto;
import com.play.waco.repository.TournamentMapper;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class TournamentService {

	private TournamentMapper tournamentMapper;
	
	/*
	 * tournament create
	 */
	public void tournamentCreate(TournamentDto dto) {
		
		
		//tournamentMapper.selectMatchPlayerInfo(dto.toEntity());
		log.info("List : {} ", tournamentMapper.selectMatchPlayerInfo(dto.toEntity()).get(7).getPlayerid());
	}
	
	
	
	
}
