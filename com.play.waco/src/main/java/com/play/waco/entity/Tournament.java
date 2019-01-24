package com.play.waco.entity;

import org.apache.ibatis.type.Alias;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter()
@NoArgsConstructor( access = AccessLevel.PROTECTED )
@Alias("tournament")
public class Tournament {

	private int matchid;
	private int eventid;
	private int playerid;
	
	@Builder
	public Tournament(int matchid, int eventid, int playerid) {
		this.matchid = matchid;
		this.eventid = eventid;
		this.playerid = playerid;
	}
	
}
