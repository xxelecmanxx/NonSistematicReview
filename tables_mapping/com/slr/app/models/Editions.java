package com.slr.app.models;
// Generated Jun 22, 2021 11:00:33 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Editions generated by hbm2java
 */
@Entity
@Table(name = "editions", schema = "slr")
public class Editions implements java.io.Serializable {

	private long id;
	private Conferences conferences;
	private Journals journals;
	private Publishers publishers;
	private String description;
	private String volume;
	private String number;
	private Set<ConferenceEditorials> conferenceEditorialses = new HashSet<ConferenceEditorials>(0);
	private Set<ConferencePapers> conferencePaperses = new HashSet<ConferencePapers>(0);
	private Set<JournalEditorials> journalEditorialses = new HashSet<JournalEditorials>(0);
	private Set<JournalPapers> journalPaperses = new HashSet<JournalPapers>(0);

	public Editions() {
	}

	public Editions(long id) {
		this.id = id;
	}

	public Editions(long id, Conferences conferences, Journals journals, Publishers publishers, String description,
			String volume, String number, Set<ConferenceEditorials> conferenceEditorialses,
			Set<ConferencePapers> conferencePaperses, Set<JournalEditorials> journalEditorialses,
			Set<JournalPapers> journalPaperses) {
		this.id = id;
		this.conferences = conferences;
		this.journals = journals;
		this.publishers = publishers;
		this.description = description;
		this.volume = volume;
		this.number = number;
		this.conferenceEditorialses = conferenceEditorialses;
		this.conferencePaperses = conferencePaperses;
		this.journalEditorialses = journalEditorialses;
		this.journalPaperses = journalPaperses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "conference_id")
	public Conferences getConferences() {
		return this.conferences;
	}

	public void setConferences(Conferences conferences) {
		this.conferences = conferences;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "journal_id")
	public Journals getJournals() {
		return this.journals;
	}

	public void setJournals(Journals journals) {
		this.journals = journals;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "publisher_id")
	public Publishers getPublishers() {
		return this.publishers;
	}

	public void setPublishers(Publishers publishers) {
		this.publishers = publishers;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "volume")
	public String getVolume() {
		return this.volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	@Column(name = "number")
	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "editions")
	public Set<ConferenceEditorials> getConferenceEditorialses() {
		return this.conferenceEditorialses;
	}

	public void setConferenceEditorialses(Set<ConferenceEditorials> conferenceEditorialses) {
		this.conferenceEditorialses = conferenceEditorialses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "editions")
	public Set<ConferencePapers> getConferencePaperses() {
		return this.conferencePaperses;
	}

	public void setConferencePaperses(Set<ConferencePapers> conferencePaperses) {
		this.conferencePaperses = conferencePaperses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "editions")
	public Set<JournalEditorials> getJournalEditorialses() {
		return this.journalEditorialses;
	}

	public void setJournalEditorialses(Set<JournalEditorials> journalEditorialses) {
		this.journalEditorialses = journalEditorialses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "editions")
	public Set<JournalPapers> getJournalPaperses() {
		return this.journalPaperses;
	}

	public void setJournalPaperses(Set<JournalPapers> journalPaperses) {
		this.journalPaperses = journalPaperses;
	}

}
