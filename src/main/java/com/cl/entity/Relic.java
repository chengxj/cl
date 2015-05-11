package com.cl.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the RELIC database table.
 * 
 */
@Entity
@Table(name = "Relic")
public class Relic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OBJ_ID")
	private Long objId;

	private String author;

	@Column(name="CLASS_NAME")
	private String className;

	private String classa;

	private String classiii;

	@Column(name="COLOR_MODE")
	private String colorMode;

	@Lob
	private String description;

	@Column(name="DOC_AUTHOR")
	private String docAuthor;

	private String era;

	@Column(name="ERA_BEGIN")
	private Long eraBegin;

	@Column(name="ERA_END")
	private Long eraEnd;

	@Column(name="GENERATE_ERA")
	private String generateEra;

	private String grade;

	@Lob
	private String introduction;

	private String keywords;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE")
	private Date lastUpdate;

	private String material;

	private String note;

	private Long notesnum;

	private String notesstr;

	@Column(name="OBJ_AUTHOR")
	private String objAuthor;

	@Column(name="OBJ_NAME")
	private String objName;

	@Column(name="OBJ_NO")
	private String objNo;

	@Column(name="OBJ_NUMBER")
	private long objNumber;

	@Column(name="OBJ_PRODAREA")
	private String objProdarea;

	private String objsize;

	private String origin;

	@Temporal(TemporalType.DATE)
	@Column(name="SHOW_FROM")
	private Date showFrom;

	@Column(name="SHOW_LOCATION")
	private String showLocation;

	@Temporal(TemporalType.DATE)
	@Column(name="SHOW_TO")
	private Date showTo;

	private String unearthed;

	public Relic() {
	}

	public Long getObjId() {
		return this.objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassa() {
		return this.classa;
	}

	public void setClassa(String classa) {
		this.classa = classa;
	}

	public String getClassiii() {
		return this.classiii;
	}

	public void setClassiii(String classiii) {
		this.classiii = classiii;
	}

	public String getColorMode() {
		return this.colorMode;
	}

	public void setColorMode(String colorMode) {
		this.colorMode = colorMode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocAuthor() {
		return this.docAuthor;
	}

	public void setDocAuthor(String docAuthor) {
		this.docAuthor = docAuthor;
	}

	public String getEra() {
		return this.era;
	}

	public void setEra(String era) {
		this.era = era;
	}

	public Long getEraBegin() {
		return this.eraBegin;
	}

	public void setEraBegin(Long eraBegin) {
		this.eraBegin = eraBegin;
	}

	public Long getEraEnd() {
		return this.eraEnd;
	}

	public void setEraEnd(Long eraEnd) {
		this.eraEnd = eraEnd;
	}

	public String getGenerateEra() {
		return this.generateEra;
	}

	public void setGenerateEra(String generateEra) {
		this.generateEra = generateEra;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Long getNotesnum() {
		return this.notesnum;
	}

	public void setNotesnum(Long notesnum) {
		this.notesnum = notesnum;
	}

	public String getNotesstr() {
		return this.notesstr;
	}

	public void setNotesstr(String notesstr) {
		this.notesstr = notesstr;
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

	public long getObjNumber() {
		return this.objNumber;
	}

	public void setObjNumber(long objNumber) {
		this.objNumber = objNumber;
	}

	public String getObjProdarea() {
		return this.objProdarea;
	}

	public void setObjProdarea(String objProdarea) {
		this.objProdarea = objProdarea;
	}

	public String getObjsize() {
		return this.objsize;
	}

	public void setObjsize(String objsize) {
		this.objsize = objsize;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Date getShowFrom() {
		return this.showFrom;
	}

	public void setShowFrom(Date showFrom) {
		this.showFrom = showFrom;
	}

	public String getShowLocation() {
		return this.showLocation;
	}

	public void setShowLocation(String showLocation) {
		this.showLocation = showLocation;
	}

	public Date getShowTo() {
		return this.showTo;
	}

	public void setShowTo(Date showTo) {
		this.showTo = showTo;
	}

	public String getUnearthed() {
		return this.unearthed;
	}

	public void setUnearthed(String unearthed) {
		this.unearthed = unearthed;
	}

}