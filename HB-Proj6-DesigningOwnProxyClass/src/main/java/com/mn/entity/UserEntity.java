package com.mn.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public final class UserEntity implements Serializable,IProxyClass {
	private Integer id;
	private String name;
	private Integer sal;
	private Integer departmentid;
}
