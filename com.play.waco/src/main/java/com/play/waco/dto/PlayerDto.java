package com.play.waco.dto;

import com.play.waco.entity.Player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlayerDto {

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

	public Player toEntity() {

		return Player.builder()
				.id(id)
				.gym(gym)
				.name(name)
				.sex(sex)
				.ssn_front(ssn_front)
				.ssn_encript(ssn_encript)
				.weight(weight)
				.height(height)
				.telno(telno)
				.win(win)
				.lose(lose)
				.tie(tie)
				.build();

	}
	
	
	
}
