package com.play.waco.entity;

import org.apache.ibatis.type.Alias;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor( access = AccessLevel.PROTECTED )
@Alias("match")
public class Match {

	private Long id;
	private String name;
	private Long time;
	private String startdate;
	private String enddate;
	private String addr1;
	private String addr2;
	private String sponsor;
	
	@Builder
	public Match(Long id, String name, Long time, String startdate, String enddate, String addr1, String addr2,
			String sponsor) {
		this.id = id;
		this.name = name;
		this.time = time;
		this.startdate = startdate;
		this.enddate = enddate;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.sponsor = sponsor;
	}
	
}
