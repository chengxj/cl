package com.cl.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the BOOK database table.
 * 
 */
@Entity
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OBJ_ID")
	private long objId;

	private String author;

	private String bookbinding;

	@Column(name="CLASS_NAME")
	private String className;

	@Column(name="COUNT_REMARK")
	private String countRemark;

	@Lob
	private String description;

	private String format;

	@Temporal(TemporalType.DATE)
	@Column(name="GENERATE_DATE")
	private Date generateDate;

	@Column(name="GENERATE_ERA")
	private String generateEra;

	private BigDecimal iscollection;

	private BigDecimal iscommend;

	private String keywords;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE")
	private Date lastUpdate;

	private String note;

	private String note2;

	private BigDecimal note3;

	@Column(name="OBJ_AUTHOR")
	private String objAuthor;

	@Column(name="OBJ_NAME")
	private String objName;

	@Column(name="OBJ_NO")
	private String objNo;

	@Column(name="OBJ_NUMBER")
	private BigDecimal objNumber;

	@Column(name="OBJ_PRODAREA")
	private String objProdarea;

	private BigDecimal packaging;

	private BigDecimal price;

	@Column(name="PUBLISH_HOUSE")
	private String publishHouse;

	private BigDecimal reldocid;

	private BigDecimal sell;

	@Column(name="WORD_PICTURE")
	private String wordPicture;

	public Book() {
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

	public String getBookbinding() {
		return this.bookbinding;
	}

	public void setBookbinding(String bookbinding) {
		this.bookbinding = bookbinding;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getCountRemark() {
		return this.countRemark;
	}

	public void setCountRemark(String countRemark) {
		this.countRemark = countRemark;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Date getGenerateDate() {
		return this.generateDate;
	}

	public void setGenerateDate(Date generateDate) {
		this.generateDate = generateDate;
	}

	public String getGenerateEra() {
		return this.generateEra;
	}

	public void setGenerateEra(String generateEra) {
		this.generateEra = generateEra;
	}

	public BigDecimal getIscollection() {
		return this.iscollection;
	}

	public void setIscollection(BigDecimal iscollection) {
		this.iscollection = iscollection;
	}

	public BigDecimal getIscommend() {
		return this.iscommend;
	}

	public void setIscommend(BigDecimal iscommend) {
		this.iscommend = iscommend;
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

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNote2() {
		return this.note2;
	}

	public void setNote2(String note2) {
		this.note2 = note2;
	}

	public BigDecimal getNote3() {
		return this.note3;
	}

	public void setNote3(BigDecimal note3) {
		this.note3 = note3;
	}

	public String getObjAuthor() {
		return this.objAuthor;
	}

	public void setObjAuthor(String objAuthor) {
		this.objAuthor = objAuthor;
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

	public BigDecimal getPackaging() {
		return this.packaging;
	}

	public void setPackaging(BigDecimal packaging) {
		this.packaging = packaging;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getPublishHouse() {
		return this.publishHouse;
	}

	public void setPublishHouse(String publishHouse) {
		this.publishHouse = publishHouse;
	}

	public BigDecimal getReldocid() {
		return this.reldocid;
	}

	public void setReldocid(BigDecimal reldocid) {
		this.reldocid = reldocid;
	}

	public BigDecimal getSell() {
		return this.sell;
	}

	public void setSell(BigDecimal sell) {
		this.sell = sell;
	}

	public String getWordPicture() {
		return this.wordPicture;
	}

	public void setWordPicture(String wordPicture) {
		this.wordPicture = wordPicture;
	}

}