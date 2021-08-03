package com.mn.entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
public class Employee {
	@Id
	private Integer id;
	private String name;
	private Integer sal;
	private Integer departmentid;
}
