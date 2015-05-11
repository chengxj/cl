package com.cl.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the REL database table.
 * 
 */
@Entity
public class Rel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String entity1;

	private String entity2;

	private BigDecimal id1;

	private BigDecimal id2;

	private BigDecimal ord;

	@Column(name="PRJ_ID")
	private BigDecimal prjId;

	private String title;

	public Rel() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEntity1() {
		return this.entity1;
	}

	public void setEntity1(String entity1) {
		this.entity1 = entity1;
	}

	public String getEntity2() {
		return this.entity2;
	}

	public void setEntity2(String entity2) {
		this.entity2 = entity2;
	}

	public BigDecimal getId1() {
		return this.id1;
	}

	public void setId1(BigDecimal id1) {
		this.id1 = id1;
	}

	public BigDecimal getId2() {
		return this.id2;
	}

	public void setId2(BigDecimal id2) {
		this.id2 = id2;
	}

	public BigDecimal getOrd() {
		return this.ord;
	}

	public void setOrd(BigDecimal ord) {
		this.ord = ord;
	}

	public BigDecimal getPrjId() {
		return this.prjId;
	}

	public void setPrjId(BigDecimal prjId) {
		this.prjId = prjId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}