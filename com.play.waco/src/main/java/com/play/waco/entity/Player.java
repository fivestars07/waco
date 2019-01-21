package com.play.waco.entity;

import org.apache.ibatis.type.Alias;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor( access = AccessLevel.PROTECTED )
@Alias("player")
public class Player {

	private Long id;
	private Long gym;
	private String name;
	private Long sex;
	private String ssn_front;
	private String ssn_encript;
	private Long win;
	private Long lose;
	private Long tie;
	
	@Builder
	public Player(Long id, Long gym, String name, Long sex, String ssn_front, String ssn_encript, Long win, Long lose,
			Long tie) {
		this.id = id;
		this.gym = gym;
		this.name = name;
		this.sex = sex;
		this.ssn_front = ssn_front;
		this.ssn_encript = ssn_encript;
		this.win = win;
		this.lose = lose;
		this.tie = tie;
	}
	
}
