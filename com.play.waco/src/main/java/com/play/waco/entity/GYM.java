package com.play.waco.entity;

import org.apache.ibatis.type.Alias;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor( access = AccessLevel.PROTECTED )
@Getter
@Alias("gym")
public class GYM {
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
	
	@Builder
	public GYM(Long id, String name, String addr1, String addr2, String zipcode, String telno, String mobileno,
			String email, Long master, Long staff, String info) {
		this.id = id;
		this.name = name;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.zipcode = zipcode;
		this.telno = telno;
		this.mobileno = mobileno;
		this.email = email;
		this.master = master;
		this.staff = staff;
		this.info = info;
	}
	
}
