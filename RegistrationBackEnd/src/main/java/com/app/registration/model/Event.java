package com.app.registration.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_event")
	private long idEvent;
	
	@Column(name="code")
	private String code;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name = "event_start")
	private Date eventStart;
	
	@Column(name = "event_end")
	private Date eventEnd;
	
	@ManyToMany (cascade = CascadeType.PERSIST)
	 @JoinTable(name = "event_reward", joinColumns = { @JoinColumn(name = "id_reward", nullable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_event", nullable = false) })
	 private List<Reward>rewards;
	
//	@ManyToMany 
//	@JoinTable(name = "event", joinColumns = { @JoinColumn(name = "id_reward", nullable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_event", nullable = false) })
//	private List<Reward> reward;
//	
	public Event() {
		// TODO Auto-generated constructor stub
	}

	public Event(long idEvent, String code, String name, String description, Date eventStart, Date eventEnd,
			List<Reward> rewards) {
		super();
		this.idEvent = idEvent;
		this.code = code;
		this.name = name;
		this.description = description;
		this.eventStart = eventStart;
		this.eventEnd = eventEnd;
		this.rewards = rewards;
	}

	public long getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(long idEvent) {
		this.idEvent = idEvent;
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

	public List<Reward> getRewards() {
		return rewards;
	}

	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}

		
	
	
	
}
