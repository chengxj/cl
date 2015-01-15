package com.cl.entity.common;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import org.hibernate.annotations.BatchSize;


public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private long pid;
	private String description;
	private String pageurl;
	private int type;
	private int sort;
	private String icon;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "role_menu",
	joinColumns = @JoinColumn(name="menu_id", insertable=false, updatable=false),
	inverseJoinColumns = @JoinColumn(name = "role_id", insertable=false, updatable=false))
	@BatchSize(size = 10)
	private Set<Role> roles;

}
