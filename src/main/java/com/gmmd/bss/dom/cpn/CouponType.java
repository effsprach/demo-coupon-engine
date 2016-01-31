package com.gmmd.bss.dom.cpn;

// Generated 1 ��.�. 2558, 11:22:05 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gmmd.bss.dom.DomObject;

/**
 * CouponType generated by hbm2java
 */
public class CouponType extends DomObject {

	private static final long serialVersionUID = 1L;
	
	private Integer couponTypeId;
	private String typeName;
	private String description;
	private String status;
	private String typeHandle;
	private List<MasCouponTypeParam> masCouponTypeParams = new ArrayList<MasCouponTypeParam>(0);
	private List<CouponCampaign> couponCampaigns = new ArrayList<CouponCampaign>(0);

	public CouponType() {
	}

	public CouponType(Integer couponTypeId, String typeName, String status,
			Date createDate, String createBy) {
		this.couponTypeId = couponTypeId;
		this.typeName = typeName;
		this.status = status;
		this.createDate = createDate;
		this.createBy = createBy;
	}

	public CouponType(Integer couponTypeId, String typeName,
			String typeClassHandle, String description, String status,
			Date createDate, String createBy, Date updateDate, String updateBy,
			List<MasCouponTypeParam> masCouponTypeParams, List<CouponCampaign> couponCampaigns) {
		this.couponTypeId = couponTypeId;
		this.typeName = typeName;
		this.typeHandle = typeClassHandle;
		this.description = description;
		this.status = status;
		this.createDate = createDate;
		this.createBy = createBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
		this.masCouponTypeParams = masCouponTypeParams;
		this.couponCampaigns = couponCampaigns;
	}

	public String getTypeHandle() {
		return typeHandle;
	}

	public void setTypeHandle(String typeHandle) {
		this.typeHandle = typeHandle;
	}

	public Integer getCouponTypeId() {
		return couponTypeId;
	}

	public void setCouponTypeId(Integer couponTypeId) {
		this.couponTypeId = couponTypeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<MasCouponTypeParam> getMasCouponTypeParams() {
		return masCouponTypeParams;
	}

	public void setMasCouponTypeParams(List<MasCouponTypeParam> masCouponTypeParams) {
		this.masCouponTypeParams = masCouponTypeParams;
	}

	public List<CouponCampaign> getCouponCampaigns() {
		return couponCampaigns;
	}

	public void setCouponCampaigns(List<CouponCampaign> couponCampaigns) {
		this.couponCampaigns = couponCampaigns;
	}

}