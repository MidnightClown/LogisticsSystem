package com.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LoginUser {
	private Long u_id;
	private String u_name;
	private String u_password;
	private Long u_identity;//0代表超级管理员，1代表普通管理员
	
	private List<Orders> orderList;
}
