package com.zx;

import java.io.Serializable;

/**
 * 商品类
 * @author August
 *
 */
public class Commodity implements Serializable{
	
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4053304321152379280L;
	private Integer id;
	private String commodityNo;		//商品编号
	private String commodityName;	//商品名称
	private String commodityType;
	private String briefName;//简称
	private String scale;//型号
	private String unit;
	private Integer status;
	private String remark;//备注
	public Commodity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commodity(Integer id, String commodityNo, String commodityName, String commodityType, String briefName,
			String scale, String unit, Integer status, String remark) {
		super();
		this.id = id;
		this.commodityNo = commodityNo;
		this.commodityName = commodityName;
		this.commodityType = commodityType;
		this.briefName = briefName;
		this.scale = scale;
		this.unit = unit;
		this.status = status;
		this.remark = remark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCommodityNo() {
		return commodityNo;
	}
	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getCommodityType() {
		return commodityType;
	}
	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
	}
	public String getBriefName() {
		return briefName;
	}
	public void setBriefName(String briefName) {
		this.briefName = briefName;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", commodityNo=" + commodityNo + ", commodityName=" + commodityName
				+ ", commodityType=" + commodityType + ", briefName=" + briefName + ", scale=" + scale + ", unit="
				+ unit + ", status=" + status + ", remark=" + remark + "]";
	}
	
	
	
	

}
