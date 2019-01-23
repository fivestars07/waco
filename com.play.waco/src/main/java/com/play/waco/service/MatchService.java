package com.play.waco.service;

import org.springframework.stereotype.Service;

import com.play.waco.dto.MatchDto;
import com.play.waco.repository.MatchMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MatchService {

	private MatchMapper matchMapper;
	
	public void registerMatch(MatchDto dto) {
		matchMapper.insertMatch(dto.toEntity());
	}
	
}
