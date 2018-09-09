package com.sgic.myleave.entity;

public class Leave {
	Integer id;
	Integer userid;
	Integer leaveTypeid;
	public Leave(Integer id, Integer userid, Integer leaveTypeid, String reason, Double days) {
		super();
		this.id = id;
		this.userid = userid;
		this.leaveTypeid = leaveTypeid;
		this.reason = reason;
		this.days = days;
	}
	String reason;
	Double days;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getLeaveTypeid() {
		return leaveTypeid;
	}
	public void setLeaveTypeid(Integer leaveTypeid) {
		this.leaveTypeid = leaveTypeid;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Double getDays() {
		return days;
	}
	public void setDays(Double days) {
		this.days = days;
	}
}
