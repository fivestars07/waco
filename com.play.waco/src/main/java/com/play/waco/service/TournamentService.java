package com.play.waco.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.play.waco.dto.TournamentDto;
import com.play.waco.entity.Tournament;
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
		
		List<Tournament> playerList = new ArrayList<Tournament>();
		playerList = tournamentMapper.selectMatchPlayerInfo(dto.toEntity());
		log.info("payerList : {}", playerList.get(0).getGymid());
		//tournamentMapper.selectMatchPlayerInfo(dto.toEntity());
		//log.info("List : {} ", tournamentMapper.selectMatchPlayerInfo(dto.toEntity()).get(7).getWeight());
	}
	
	
	
	
}
