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
	private String sex;
	private String ssn_front;
	private String ssn_encript;
	private Long weight;
	private Long height;
	private String telno;
	private Long win;
	private Long lose;
	private Long tie;

	@Builder
	public Player(Long id, Long gym, String name, String sex, String ssn_front, String ssn_encript, Long weight,
			Long height, String telno, Long win, Long lose, Long tie) {
		this.id = id;
		this.gym = gym;
		this.name = name;
		this.sex = sex;
		this.ssn_front = ssn_front;
		this.ssn_encript = ssn_encript;
		this.weight = weight;
		this.height = height;
		this.telno = telno;
		this.win = win;
		this.lose = lose;
		this.tie = tie;
	}

}
