package com.mn.entity;

import javax.persistence.Table;

import lombok.Data;

@Data
@Table
public class Project {
	private Integer pid;
	private String pname;
	private Integer psize;
}
