package com.jpahibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pdetails")
public class PersonDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="youtube_channel")
	private String youtubeChannel;
	@OneToOne
	private Person person;
	
	public PersonDetail() {
		super();
	}
	public PersonDetail(int id, String youtubeChannel) {
		super();
		this.id = id;
		this.youtubeChannel = youtubeChannel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYoutubeChannel() {
		return youtubeChannel;
	}
	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "PersonDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + "]";
	}
	
}
