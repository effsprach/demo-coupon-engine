package com.gmmd.bss.dom.cpn;

// Generated 1 ��.�. 2558, 11:22:05 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gmmd.bss.dom.DomObject;

/**
 * CouponEventProcess generated by hbm2java
 */
public class CouponEventProcess extends DomObject {

	private static final long serialVersionUID = 1L;
	
	private Integer couponEventProcessId;
	private String eventProcessName;
	private String description;
	private String status;
	private List<MasCouponTypeParam> masCouponTypeParams = new ArrayList<MasCouponTypeParam>(0);

	public CouponEventProcess() {}

	public CouponEventProcess(int couponEventProcessId,
			String eventProcessName, String status, Date createDate,
			String createBy) {
		this.couponEventProcessId = couponEventProcessId;
		this.eventProcessName = eventProcessName;
		this.status = status;
		this.createDate = createDate;
		this.createBy = createBy;
	}

	public CouponEventProcess(Integer couponEventProcessId,
			String eventProcessName, String description, String status,
			Date createDate, String createBy, Date updateDate, String updateBy,
			List<MasCouponTypeParam> masCouponTypeParams) {
		this.couponEventProcessId = couponEventProcessId;
		this.eventProcessName = eventProcessName;
		this.description = description;
		this.status = status;
		this.createDate = createDate;
		this.createBy = createBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
		this.masCouponTypeParams = masCouponTypeParams;
	}

	public Integer getCouponEventProcessId() {
		return couponEventProcessId;
	}

	public void setCouponEventProcessId(Integer couponEventProcessId) {
		this.couponEventProcessId = couponEventProcessId;
	}

	public String getEventProcessName() {
		return eventProcessName;
	}

	public void setEventProcessName(String eventProcessName) {
		this.eventProcessName = eventProcessName;
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

}