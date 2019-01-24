package com.play.waco.dto;

import com.play.waco.entity.Tournament;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor( access = AccessLevel.PROTECTED )
public class TournamentDto {

	private int matchid;
	private int eventid;

	public Tournament toEntity() {
		return Tournament.builder()
				.matchid(matchid)
				.eventid(eventid)
				.build();
	}
	
	
}
