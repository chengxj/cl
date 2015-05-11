package com.cl.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the LEMMA database table.
 * 
 */
@Entity
public class Lemma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Lob
	private String description;

	@Column(name="DESCRIPTION_AUTHOR")
	private String descriptionAuthor;

	private String isdel;

	@Column(name="\"LANGUAGE\"")
	private String language;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE")
	private Date lastUpdate;

	@Temporal(TemporalType.DATE)
	@Column(name="LASTUPDATED_TIME")
	private Date lastupdatedTime;

	@Column(name="LEMMA_NAME")
	private String lemmaName;

	@Column(name="LEMMA_NUM")
	private BigDecimal lemmaNum;

	private String oper;

	private String oper2;

	@Column(name="OUTPUT_FLAG")
	private String outputFlag;

	@Column(name="PUBLISH_F")
	private String publishF;

	@Temporal(TemporalType.DATE)
	@Column(name="PUBLISH_TIME")
	private Date publishTime;

	@Column(name="TRANS_FLAG")
	private String transFlag;

	public Lemma() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionAuthor() {
		return this.descriptionAuthor;
	}

	public void setDescriptionAuthor(String descriptionAuthor) {
		this.descriptionAuthor = descriptionAuthor;
	}

	public String getIsdel() {
		return this.isdel;
	}

	public void setIsdel(String isdel) {
		this.isdel = isdel;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getLastupdatedTime() {
		return this.lastupdatedTime;
	}

	public void setLastupdatedTime(Date lastupdatedTime) {
		this.lastupdatedTime = lastupdatedTime;
	}

	public String getLemmaName() {
		return this.lemmaName;
	}

	public void setLemmaName(String lemmaName) {
		this.lemmaName = lemmaName;
	}

	public BigDecimal getLemmaNum() {
		return this.lemmaNum;
	}

	public void setLemmaNum(BigDecimal lemmaNum) {
		this.lemmaNum = lemmaNum;
	}

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getOper2() {
		return this.oper2;
	}

	public void setOper2(String oper2) {
		this.oper2 = oper2;
	}

	public String getOutputFlag() {
		return this.outputFlag;
	}

	public void setOutputFlag(String outputFlag) {
		this.outputFlag = outputFlag;
	}

	public String getPublishF() {
		return this.publishF;
	}

	public void setPublishF(String publishF) {
		this.publishF = publishF;
	}

	public Date getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getTransFlag() {
		return this.transFlag;
	}

	public void setTransFlag(String transFlag) {
		this.transFlag = transFlag;
	}

}