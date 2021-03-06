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
	private int tournamentid;
	private int gymid;
	private int weight;
	private int win;
	private int lose;
	private int tie;
	
	@Builder
	public Tournament(int matchid, int eventid, int playerid) {
		this.matchid = matchid;
		this.eventid = eventid;
		this.playerid = playerid;
	}
	
}
