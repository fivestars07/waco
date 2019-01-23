package com.play.waco.dto;

import com.play.waco.entity.Match;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MatchDto {

	private Long id;
	private String name;
	private Long time;
	private String startdate;
	private String enddate;
	private String addr1;
	private String addr2;
	private String sponsor;
	
	public Match toEntity() {
		return Match.builder()
				.id(id)
				.name(name)
				.time(time)
				.startdate(startdate)
				.enddate(enddate)
				.addr1(addr1)
				.addr2(addr2)
				.sponsor(sponsor)
				.build();
	}
	
}
