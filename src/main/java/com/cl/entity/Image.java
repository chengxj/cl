package com.cl.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the IMAGE database table.
 * 
 */
@Entity
public class Image implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IMAGE_ID")
	private long imageId;

	@Column(name="CD_NO")
	private String cdNo;

	private String cdlabel;

	private String classname;

	@Column(name="CONFIRM_FLAG")
	private String confirmFlag;

	@Column(name="CONFIRM_MAN")
	private String confirmMan;

	@Temporal(TemporalType.DATE)
	@Column(name="CONFIRM_TIME")
	private Date confirmTime;

	private String description;

	@Column(name="DESCRIPTION_UK")
	private String descriptionUk;

	private BigDecimal ggrsimage;

	@Temporal(TemporalType.DATE)
	@Column(name="HANDLE_C_TIME")
	private Date handleCTime;

	@Temporal(TemporalType.DATE)
	@Column(name="HANDLE_TIME")
	private Date handleTime;

	private String handler;

	@Column(name="HAVE_BIGIMAGE")
	private BigDecimal haveBigimage;

	@Column(name="HAVE_SMALL")
	private BigDecimal haveSmall;

	@Column(name="IMAGE_ENGNAME")
	private String imageEngname;

	@Column(name="IMAGE_JAPNAME")
	private String imageJapname;

	@Column(name="IMAGE_NAME")
	private String imageName;

	@Column(name="IMAGE_SOURCE")
	private String imageSource;

	@Column(name="IMG_COLOR")
	private String imgColor;

	@Column(name="IMG_FILE")
	private String imgFile;

	@Column(name="IMG_TYPE")
	private String imgType;

	@Column(name="IS_LIVEPICTURE")
	private BigDecimal isLivepicture;

	private BigDecimal ispart;

	private String keywords;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE")
	private Date lastUpdate;

	@Column(name="MIMG_HEIGHT")
	private BigDecimal mimgHeight;

	@Column(name="MIMG_WIDTH")
	private BigDecimal mimgWidth;

	private String note;

	@Column(name="OBJ_NAME")
	private String objName;

	@Column(name="OBJ_NO")
	private String objNo;

	@Column(name="PATH_MIDDLE")
	private String pathMiddle;

	@Column(name="PATH_SMALL")
	private String pathSmall;

	private String photographer;

	private String provider;

	@Column(name="REG_C_RECEIVER")
	private String regCReceiver;

	@Temporal(TemporalType.DATE)
	@Column(name="REG_C_TIME")
	private Date regCTime;

	@Column(name="REGISTER_MAN")
	private String registerMan;

	@Temporal(TemporalType.DATE)
	@Column(name="REGISTER_TIME")
	private Date registerTime;

	@Column(name="RETURN_RECEIVER")
	private String returnReceiver;

	@Temporal(TemporalType.DATE)
	@Column(name="RETURN_TIME")
	private Date returnTime;

	@Temporal(TemporalType.DATE)
	@Column(name="SCAN_C_TIME")
	private Date scanCTime;

	@Column(name="SCAN_MAN")
	private String scanMan;

	@Column(name="SCAN_RECEIVER")
	private String scanReceiver;

	@Column(name="SCAN_SUFFIX")
	private String scanSuffix;

	@Temporal(TemporalType.DATE)
	@Column(name="SCAN_TIME")
	private Date scanTime;

	@Column(name="\"SUFFIX\"")
	private String suffix;

	public Image() {
	}

	public long getImageId() {
		return this.imageId;
	}

	public void setImageId(long imageId) {
		this.imageId = imageId;
	}

	public String getCdNo() {
		return this.cdNo;
	}

	public void setCdNo(String cdNo) {
		this.cdNo = cdNo;
	}

	public String getCdlabel() {
		return this.cdlabel;
	}

	public void setCdlabel(String cdlabel) {
		this.cdlabel = cdlabel;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getConfirmFlag() {
		return this.confirmFlag;
	}

	public void setConfirmFlag(String confirmFlag) {
		this.confirmFlag = confirmFlag;
	}

	public String getConfirmMan() {
		return this.confirmMan;
	}

	public void setConfirmMan(String confirmMan) {
		this.confirmMan = confirmMan;
	}

	public Date getConfirmTime() {
		return this.confirmTime;
	}

	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionUk() {
		return this.descriptionUk;
	}

	public void setDescriptionUk(String descriptionUk) {
		this.descriptionUk = descriptionUk;
	}

	public BigDecimal getGgrsimage() {
		return this.ggrsimage;
	}

	public void setGgrsimage(BigDecimal ggrsimage) {
		this.ggrsimage = ggrsimage;
	}

	public Date getHandleCTime() {
		return this.handleCTime;
	}

	public void setHandleCTime(Date handleCTime) {
		this.handleCTime = handleCTime;
	}

	public Date getHandleTime() {
		return this.handleTime;
	}

	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}

	public String getHandler() {
		return this.handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

	public BigDecimal getHaveBigimage() {
		return this.haveBigimage;
	}

	public void setHaveBigimage(BigDecimal haveBigimage) {
		this.haveBigimage = haveBigimage;
	}

	public BigDecimal getHaveSmall() {
		return this.haveSmall;
	}

	public void setHaveSmall(BigDecimal haveSmall) {
		this.haveSmall = haveSmall;
	}

	public String getImageEngname() {
		return this.imageEngname;
	}

	public void setImageEngname(String imageEngname) {
		this.imageEngname = imageEngname;
	}

	public String getImageJapname() {
		return this.imageJapname;
	}

	public void setImageJapname(String imageJapname) {
		this.imageJapname = imageJapname;
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageSource() {
		return this.imageSource;
	}

	public void setImageSource(String imageSource) {
		this.imageSource = imageSource;
	}

	public String getImgColor() {
		return this.imgColor;
	}

	public void setImgColor(String imgColor) {
		this.imgColor = imgColor;
	}

	public String getImgFile() {
		return this.imgFile;
	}

	public void setImgFile(String imgFile) {
		this.imgFile = imgFile;
	}

	public String getImgType() {
		return this.imgType;
	}

	public void setImgType(String imgType) {
		this.imgType = imgType;
	}

	public BigDecimal getIsLivepicture() {
		return this.isLivepicture;
	}

	public void setIsLivepicture(BigDecimal isLivepicture) {
		this.isLivepicture = isLivepicture;
	}

	public BigDecimal getIspart() {
		return this.ispart;
	}

	public void setIspart(BigDecimal ispart) {
		this.ispart = ispart;
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

	public BigDecimal getMimgHeight() {
		return this.mimgHeight;
	}

	public void setMimgHeight(BigDecimal mimgHeight) {
		this.mimgHeight = mimgHeight;
	}

	public BigDecimal getMimgWidth() {
		return this.mimgWidth;
	}

	public void setMimgWidth(BigDecimal mimgWidth) {
		this.mimgWidth = mimgWidth;
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

	public String getObjNo() {
		return this.objNo;
	}

	public void setObjNo(String objNo) {
		this.objNo = objNo;
	}

	public String getPathMiddle() {
		return this.pathMiddle;
	}

	public void setPathMiddle(String pathMiddle) {
		this.pathMiddle = pathMiddle;
	}

	public String getPathSmall() {
		return this.pathSmall;
	}

	public void setPathSmall(String pathSmall) {
		this.pathSmall = pathSmall;
	}

	public String getPhotographer() {
		return this.photographer;
	}

	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getRegCReceiver() {
		return this.regCReceiver;
	}

	public void setRegCReceiver(String regCReceiver) {
		this.regCReceiver = regCReceiver;
	}

	public Date getRegCTime() {
		return this.regCTime;
	}

	public void setRegCTime(Date regCTime) {
		this.regCTime = regCTime;
	}

	public String getRegisterMan() {
		return this.registerMan;
	}

	public void setRegisterMan(String registerMan) {
		this.registerMan = registerMan;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getReturnReceiver() {
		return this.returnReceiver;
	}

	public void setReturnReceiver(String returnReceiver) {
		this.returnReceiver = returnReceiver;
	}

	public Date getReturnTime() {
		return this.returnTime;
	}

	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}

	public Date getScanCTime() {
		return this.scanCTime;
	}

	public void setScanCTime(Date scanCTime) {
		this.scanCTime = scanCTime;
	}

	public String getScanMan() {
		return this.scanMan;
	}

	public void setScanMan(String scanMan) {
		this.scanMan = scanMan;
	}

	public String getScanReceiver() {
		return this.scanReceiver;
	}

	public void setScanReceiver(String scanReceiver) {
		this.scanReceiver = scanReceiver;
	}

	public String getScanSuffix() {
		return this.scanSuffix;
	}

	public void setScanSuffix(String scanSuffix) {
		this.scanSuffix = scanSuffix;
	}

	public Date getScanTime() {
		return this.scanTime;
	}

	public void setScanTime(Date scanTime) {
		this.scanTime = scanTime;
	}

	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

}