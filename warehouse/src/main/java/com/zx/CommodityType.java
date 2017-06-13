package com.zx;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 商品类型
 * @author August
 *
 */
@Entity
@Table(name="t_commoditytype")
public class CommodityType implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8734005595745136853L;
	
	@Id
	@Column(name = "commodityTypeNo", nullable = false, length = 30)  
	private String commodityTypeNo;//商品类型编号
	
	@Column(name = "commodityTypeName", nullable = true, length = 30)  
	private String commodityTypeName;//商品类型名称
	
	@Column(name = "parentNo", nullable = true, length = 30)  
	private String parentNo;	//上级商品类型的编号  0：顶级
	
	@Column(name = "remark", nullable = true, length = 200)  
	private String remark;		//备注
	public CommodityType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommodityType(String commodityTypeNo, String commodityTypeName, String parentNo, String remark) {
		super();
		this.commodityTypeNo = commodityTypeNo;
		this.commodityTypeName = commodityTypeName;
		this.parentNo = parentNo;
		this.remark = remark;
	}
	public String getCommodityTypeNo() {
		return commodityTypeNo;
	}
	public void setCommodityTypeNo(String commodityTypeNo) {
		this.commodityTypeNo = commodityTypeNo;
	}
	public String getCommodityTypeName() {
		return commodityTypeName;
	}
	public void setCommodityTypeName(String commodityTypeName) {
		this.commodityTypeName = commodityTypeName;
	}
	public String getParentNo() {
		return parentNo;
	}
	public void setParentNo(String parentNo) {
		this.parentNo = parentNo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "CommodityType [commodityTypeNo=" + commodityTypeNo + ", commodityTypeName=" + commodityTypeName
				+ ", parentNo=" + parentNo + ", remark=" + remark + "]";
	}
	
	
	
	
	
	

}
