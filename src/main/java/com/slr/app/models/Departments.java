package com.slr.app.models;
// Generated Mar 27, 2021 5:30:49 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.search.mapper.pojo.mapping.definition.annotation.FullTextField;


/**
 * Departments generated by hbm2java
 */
@Entity
@Table(name = "departments", schema = "slr")
@Embeddable
public class Departments implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "institution_id")
	private Institutions institutions;
	
	@FullTextField
	private String description;
	
	private String position;
	private String skills;
	private Date createdAt;
	private String link;
	private Boolean validate;
	private Integer members;
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departments", cascade = CascadeType.PERSIST)
	private Set<Authors> authorses = new HashSet<Authors>(0);

	public Departments() {
	}

	public Departments(long id) {
		this.id = id;
	}

	public Departments(long id, Institutions institutions, String description, String position, String skills,
			Date createdAt, String link, Boolean validate, Integer members, Set<Authors> authorses) {
		this.id = id;
		this.institutions = institutions;
		this.description = description;
		this.position = position;
		this.skills = skills;
		this.createdAt = createdAt;
		this.link = link;
		this.validate = validate;
		this.members = members;
		this.authorses = authorses;
	}


	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public Institutions getInstitutions() {
		return this.institutions;
	}

	public void setInstitutions(Institutions institutions) {
		this.institutions = institutions;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "position")
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name = "skills")
	public String getSkills() {
		return this.skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_at", length = 13)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "link")
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Column(name = "validate")
	public Boolean getValidate() {
		return this.validate;
	}

	public void setValidate(Boolean validate) {
		this.validate = validate;
	}

	@Column(name = "members")
	public Integer getMembers() {
		return this.members;
	}

	public void setMembers(Integer members) {
		this.members = members;
	}

	public Set<Authors> getAuthorses() {
		return this.authorses;
	}

	public void setAuthorses(Set<Authors> authorses) {
		this.authorses = authorses;
	}

}
