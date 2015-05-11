package com.cl.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FIGURE database table.
 * 
 */
@Entity
public class Figure implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OBJ_ID")
	private long objId;

	private String author;

	private String birthdeathyear;

	private String buryplace;

	@Column(name="CLASS_NAME")
	private String className;

	@Lob
	private String description;

	private String email;

	@Column(name="GENERATE_ERA")
	private String generateEra;

	@Lob
	private String introduction;

	private String keywords;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE")
	private Date lastUpdate;

	private String name;

	private String nativeplace;

	private String note;

	@Column(name="OBJ_NAME")
	private String objName;

	@Column(name="OBJ_NUMBER")
	private BigDecimal objNumber;

	@Column(name="OBJ_TITLE")
	private String objTitle;

	private String posthumoustitle;

	private String reigntitle;

	private String subject;

	private String templetitle;

	public Figure() {
	}

	public long getObjId() {
		return this.objId;
	}

	public void setObjId(long objId) {
		this.objId = objId;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBirthdeathyear() {
		return this.birthdeathyear;
	}

	public void setBirthdeathyear(String birthdeathyear) {
		this.birthdeathyear = birthdeathyear;
	}

	public String getBuryplace() {
		return this.buryplace;
	}

	public void setBuryplace(String buryplace) {
		this.buryplace = buryplace;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenerateEra() {
		return this.generateEra;
	}

	public void setGenerateEra(String generateEra) {
		this.generateEra = generateEra;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNativeplace() {
		return this.nativeplace;
	}

	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getObjName() {
		return this.objName;
	}

	public void setObjName(String objName) {
		this.objName = objName;
	}

	public BigDecimal getObjNumber() {
		return this.objNumber;
	}

	public void setObjNumber(BigDecimal objNumber) {
		this.objNumber = objNumber;
	}

	public String getObjTitle() {
		return this.objTitle;
	}

	public void setObjTitle(String objTitle) {
		this.objTitle = objTitle;
	}

	public String getPosthumoustitle() {
		return this.posthumoustitle;
	}

	public void setPosthumoustitle(String posthumoustitle) {
		this.posthumoustitle = posthumoustitle;
	}

	public String getReigntitle() {
		return this.reigntitle;
	}

	public void setReigntitle(String reigntitle) {
		this.reigntitle = reigntitle;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTempletitle() {
		return this.templetitle;
	}

	public void setTempletitle(String templetitle) {
		this.templetitle = templetitle;
	}

}