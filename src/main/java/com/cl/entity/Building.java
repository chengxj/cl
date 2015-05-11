package com.cl.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the BUILDING database table.
 * 
 */
@Entity
public class Building implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OBJ_ID")
	private long objId;

	private String areascene;

	private String author;

	@Column(name="BRIEF_CN")
	private String briefCn;

	private String buildingdata;

	@Column(name="CLASS_NAME")
	private String className;

	@Lob
	private String description;

	@Column(name="GENERATE_ERA")
	private String generateEra;

	private BigDecimal id;

	private String introduction;

	@Column(name="INTRODUCTION_UK")
	private String introductionUk;

	private String keywords;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE")
	private Date lastUpdate;

	@Column(name="NAME_CN")
	private String nameCn;

	@Column(name="NAME_UK")
	private String nameUk;

	private String namehistory;

	private String note;

	private String nowuse;

	@Column(name="OBJ_NAME")
	private String objName;

	@Column(name="OBJ_NO")
	private String objNo;

	@Column(name="OBJ_NUMBER")
	private BigDecimal objNumber;

	@Column(name="OBJ_PRODAREA")
	private String objProdarea;

	private String palacegrade;

	private String shapesdesc;

	public Building() {
	}

	public long getObjId() {
		return this.objId;
	}

	public void setObjId(long objId) {
		this.objId = objId;
	}

	public String getAreascene() {
		return this.areascene;
	}

	public void setAreascene(String areascene) {
		this.areascene = areascene;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBriefCn() {
		return this.briefCn;
	}

	public void setBriefCn(String briefCn) {
		this.briefCn = briefCn;
	}

	public String getBuildingdata() {
		return this.buildingdata;
	}

	public void setBuildingdata(String buildingdata) {
		this.buildingdata = buildingdata;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenerateEra() {
		return this.generateEra;
	}

	public void setGenerateEra(String generateEra) {
		this.generateEra = generateEra;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getIntroductionUk() {
		return this.introductionUk;
	}

	public void setIntroductionUk(String introductionUk) {
		this.introductionUk = introductionUk;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNameCn() {
		return this.nameCn;
	}

	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}

	public String getNameUk() {
		return this.nameUk;
	}

	public void setNameUk(String nameUk) {
		this.nameUk = nameUk;
	}

	public String getNamehistory() {
		return this.namehistory;
	}

	public void setNamehistory(String namehistory) {
		this.namehistory = namehistory;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNowuse() {
		return this.nowuse;
	}

	public void setNowuse(String nowuse) {
		this.nowuse = nowuse;
	}

	public String getObjName() {
		return this.objName;
	}

	public void setObjName(String objName) {
		this.objName = objName;
	}

	public String getObjNo() {
		return this.objNo;
	}

	public void setObjNo(String objNo) {
		this.objNo = objNo;
	}

	public BigDecimal getObjNumber() {
		return this.objNumber;
	}

	public void setObjNumber(BigDecimal objNumber) {
		this.objNumber = objNumber;
	}

	public String getObjProdarea() {
		return this.objProdarea;
	}

	public void setObjProdarea(String objProdarea) {
		this.objProdarea = objProdarea;
	}

	public String getPalacegrade() {
		return this.palacegrade;
	}

	public void setPalacegrade(String palacegrade) {
		this.palacegrade = palacegrade;
	}

	public String getShapesdesc() {
		return this.shapesdesc;
	}

	public void setShapesdesc(String shapesdesc) {
		this.shapesdesc = shapesdesc;
	}

}