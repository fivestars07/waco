package com.play.waco.service;

import org.springframework.stereotype.Service;

import com.play.waco.dto.GYMDto;
import com.play.waco.repository.GYMMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GYMService {

	private GYMMapper gymMapper;
	
	public void registerGYM(GYMDto dto) {
		gymMapper.insertGYM(dto.toEntity());
	}
}
