package com.cl.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DOC database table.
 * 
 */
@Entity
public class Doc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String author;

	private String buildingarea;

	@Column(name="DATE_DISPLAY")
	private String dateDisplay;

	@Lob
	private String description;

	private String forward;

	private BigDecimal fulltextid;

	@Temporal(TemporalType.DATE)
	@Column(name="GENERATE_DATE")
	private Date generateDate;

	@Column(name="GENERATE_ERA")
	private String generateEra;

	private String keywords;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE")
	private Date lastUpdate;

	@Column(name="LINK_MAN")
	private String linkMan;

	private String note;

	private String notes;

	private String notes2;

	private BigDecimal notes3;

	@Column(name="OBJ_AUTHOR")
	private String objAuthor;

	@Column(name="OBJ_NO")
	private String objNo;

	@Column(name="OBJ_NUMBER")
	private BigDecimal objNumber;

	private BigDecimal ord;

	private String platecatalog;

	private String protagonist;

	private String subtype;

	private String tag;

	private String title;

	@Column(name="\"TYPE\"")
	private String type;

	private String type3;

	public Doc() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBuildingarea() {
		return this.buildingarea;
	}

	public void setBuildingarea(String buildingarea) {
		this.buildingarea = buildingarea;
	}

	public String getDateDisplay() {
		return this.dateDisplay;
	}

	public void setDateDisplay(String dateDisplay) {
		this.dateDisplay = dateDisplay;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getForward() {
		return this.forward;
	}

	public void setForward(String forward) {
		this.forward = forward;
	}

	public BigDecimal getFulltextid() {
		return this.fulltextid;
	}

	public void setFulltextid(BigDecimal fulltextid) {
		this.fulltextid = fulltextid;
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

	public String getLinkMan() {
		return this.linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getNotes2() {
		return this.notes2;
	}

	public void setNotes2(String notes2) {
		this.notes2 = notes2;
	}

	public BigDecimal getNotes3() {
		return this.notes3;
	}

	public void setNotes3(BigDecimal notes3) {
		this.notes3 = notes3;
	}

	public String getObjAuthor() {
		return this.objAuthor;
	}

	public void setObjAuthor(String objAuthor) {
		this.objAuthor = objAuthor;
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

	public BigDecimal getOrd() {
		return this.ord;
	}

	public void setOrd(BigDecimal ord) {
		this.ord = ord;
	}

	public String getPlatecatalog() {
		return this.platecatalog;
	}

	public void setPlatecatalog(String platecatalog) {
		this.platecatalog = platecatalog;
	}

	public String getProtagonist() {
		return this.protagonist;
	}

	public void setProtagonist(String protagonist) {
		this.protagonist = protagonist;
	}

	public String getSubtype() {
		return this.subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType3() {
		return this.type3;
	}

	public void setType3(String type3) {
		this.type3 = type3;
	}

}