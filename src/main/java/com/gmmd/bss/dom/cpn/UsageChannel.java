package com.gmmd.bss.dom.cpn;

// Generated 1 ��.�. 2558, 11:22:05 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gmmd.bss.dom.DomObject;

/**
 * UsageChannel generated by hbm2java
 */
public class UsageChannel extends DomObject {

	private static final long serialVersionUID = 1L;
	
	private Integer usageChannelId;
	private String usageChannelName;
	private String description;
	private String status;
	private List<CouponCampaign> couponCampaigns = new ArrayList<CouponCampaign>(0);

	public UsageChannel() {
	}

	public UsageChannel(Integer usageChannelId, String usageChannelName,
			String status, Date createDate, String createBy) {
		this.usageChannelId = usageChannelId;
		this.usageChannelName = usageChannelName;
		this.status = status;
		this.createDate = createDate;
		this.createBy = createBy;
	}

	public UsageChannel(Integer usageChannelId, String usageChannelName,
			String description, String status, Date createDate,
			String createBy, Date updateDate, String updateBy,
			List<CouponCampaign> couponCampaigns) {
		this.usageChannelId = usageChannelId;
		this.usageChannelName = usageChannelName;
		this.description = description;
		this.status = status;
		this.createDate = createDate;
		this.createBy = createBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
		this.couponCampaigns = couponCampaigns;
	}

	public Integer getUsageChannelId() {
		return usageChannelId;
	}

	public void setUsageChannelId(Integer usageChannelId) {
		this.usageChannelId = usageChannelId;
	}

	public String getUsageChannelName() {
		return usageChannelName;
	}

	public void setUsageChannelName(String usageChannelName) {
		this.usageChannelName = usageChannelName;
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

	public List<CouponCampaign> getCouponCampaigns() {
		return couponCampaigns;
	}

	public void setCouponCampaigns(List<CouponCampaign> couponCampaigns) {
		this.couponCampaigns = couponCampaigns;
	}

}
