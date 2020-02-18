package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="event_reward")
public class EventReward {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_event")
	@OneToMany ()
	@JoinTable (name="event_reward", joinColumns = {@JoinColumn (name="id_event", nullable = false)}, inverseJoinColumns = {@JoinColumn (name="id", nullable = false)})
	private long idEvent;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_reward")
	@OneToMany ()
	@JoinTable (name="event_reward", joinColumns = {@JoinColumn (name="id_reward", nullable = false)}, inverseJoinColumns = {@JoinColumn (name="id", nullable = false)})
	private long idReward;
	
	
}
