package com.slr.app.models;
// Generated Jun 22, 2020, 3:24:17 AM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * JournalPapers generated by hbm2java
 */
@Entity
@Table(name = "journal_papers", schema = "slr")
public class JournalPapers implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "edition_id")
	private Editions editions;
	
//	@ManyToOne(fetch = FetchType.LAZY)
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "publication_id")
	private Publications publications;
	
	private String pages;
	private String month;
	private String cite;
	private String note;
	private String bookTitle;
	private Date createdAt;

	public JournalPapers() {
	}

	public JournalPapers(long id) {
		this.id = id;
	}

	public JournalPapers(long id, Editions editions, Publications publications, String pages, String month, String cite,
			String note, String bookTitle, Date createdAt) {
		this.id = id;
		this.editions = editions;
		this.publications = publications;
		this.pages = pages;
		this.month = month;
		this.cite = cite;
		this.note = note;
		this.bookTitle = bookTitle;
		this.createdAt = createdAt;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@JsonBackReference
	public Editions getEditions() {
		return this.editions;
	}

	public void setEditions(Editions editions) {
		this.editions = editions;
	}

	@JsonBackReference
	public Publications getPublications() {
		return this.publications;
	}

	public void setPublications(Publications publications) {
		this.publications = publications;
	}

	@Column(name = "pages", length = 100)
	public String getPages() {
		return this.pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	@Column(name = "month", length = 80)
	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Column(name = "cite", length = 200)
	public String getCite() {
		return this.cite;
	}

	public void setCite(String cite) {
		this.cite = cite;
	}

	@Column(name = "note")
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "book_title")
	public String getBookTitle() {
		return this.bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
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