package com.play.waco.dto;

import com.play.waco.entity.GYM;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GYMDto {

	private Long id;
	private String name;
	private String addr1;
	private String addr2;
	private String zipcode;
	private String telno;
	private String mobileno;
	private String email;
	private Long master;
	private Long staff;
	private String info;
	
	public GYM toEntity() {
		return GYM.builder()
				.id(id)
				.name(name)
				.addr1(addr1)
				.addr2(addr2)
				.zipcode(zipcode)
				.telno(telno)
				.mobileno(mobileno)
				.email(email)
				.master(master)
				.staff(staff)
				.info(info)
				.build();
	}
	
}
