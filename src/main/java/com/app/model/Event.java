package com.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="code")
	private String code;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="event_start")
	private Date eventStart;
	
	@Column(name="event_end")
	private Date eventEnd;
	
	@ManyToOne ()
	@JoinTable (name="event", joinColumns = {@JoinColumn (name="id", nullable = false)}, inverseJoinColumns = {@JoinColumn (name="id_event", nullable = false)})
	private List<EventReward> eventReward;

	public Event(long id, String code, String name, String description, Date eventStart, Date eventEnd,
			List<EventReward> eventReward) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.eventStart = eventStart;
		this.eventEnd = eventEnd;
		this.eventReward = eventReward;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEventStart() {
		return eventStart;
	}

	public void setEventStart(Date eventStart) {
		this.eventStart = eventStart;
	}

	public Date getEventEnd() {
		return eventEnd;
	}

	public void setEventEnd(Date eventEnd) {
		this.eventEnd = eventEnd;
	}

	public List<EventReward> getEventReward() {
		return eventReward;
	}

	public void setEventReward(List<EventReward> eventReward) {
		this.eventReward = eventReward;
	}
	
	
}
