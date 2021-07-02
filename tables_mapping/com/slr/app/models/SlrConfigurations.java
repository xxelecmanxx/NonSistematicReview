package com.slr.app.models;
// Generated Jun 22, 2021 11:00:33 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SlrConfigurations generated by hbm2java
 */
@Entity
@Table(name = "slr_configurations", schema = "public")
public class SlrConfigurations implements java.io.Serializable {

	private int id;
	private String state;
	private Integer groupState;
	private Date createdAt;

	public SlrConfigurations() {
	}

	public SlrConfigurations(int id, String state) {
		this.id = id;
		this.state = state;
	}

	public SlrConfigurations(int id, String state, Integer groupState, Date createdAt) {
		this.id = id;
		this.state = state;
		this.groupState = groupState;
		this.createdAt = createdAt;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "state", nullable = false, length = 50)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "group_state")
	public Integer getGroupState() {
		return this.groupState;
	}

	public void setGroupState(Integer groupState) {
		this.groupState = groupState;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_at", length = 13)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
