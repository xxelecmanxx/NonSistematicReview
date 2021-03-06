package com.slr.app.models;
// Generated Jun 22, 2020, 3:24:17 AM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
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

import org.hibernate.search.mapper.pojo.mapping.definition.annotation.FullTextField;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.KeywordField;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * ConferenceEditorials generated by hbm2java
 */
@Entity
@Table(name = "conference_editorials", schema = "slr")
@Embeddable
public class ConferenceEditorials implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "edition_id")
	private Editions editions;
	
//	@ManyToOne(fetch = FetchType.LAZY)
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "publication_id")
	private Publications publications;
	
	@KeywordField(normalizer = "english_normalyzer")
	private String isbn;
	
	private String note;
	private String series;
	@FullTextField( analyzer = "english_analyzer")
	private String bookTitle;
	private String pages;
	private Date createdAt;

	public ConferenceEditorials() {
	}

	public ConferenceEditorials(long id) {
		this.id = id;
	}

	public ConferenceEditorials(long id, Editions editions, Publications publications, String isbn, String note,
			String series, String bookTitle, String pages, Date createdAt) {
		this.id = id;
		this.editions = editions;
		this.publications = publications;
		this.isbn = isbn;
		this.note = note;
		this.series = series;
		this.bookTitle = bookTitle;
		this.pages = pages;
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

	@Column(name = "isbn")
	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Column(name = "note")
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "series")
	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	@Column(name = "book_title")
	public String getBookTitle() {
		return this.bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Column(name = "pages", length = 100)
	public String getPages() {
		return this.pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
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
