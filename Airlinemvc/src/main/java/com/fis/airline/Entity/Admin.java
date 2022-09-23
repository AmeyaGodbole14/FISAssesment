package com.fis.airline.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	private int flight_id;
	@Column
	private int airline_id;
	@Column
	private String airline_name;
	@Column
	private String from_location;
	@Column
	private String to_location;
	@Column
	private String depart_time;
	@Column
	private String arrival_time;
	@Column
	private String duration;
	@Column
	private int total_seats;
	
	
	
	public Admin() {
		super();
	}
	
	public Admin(int flight_id, int airline_id, String airline_name, String from_location, String to_location, String depart_time,
			String arrival_time, String duration, int total_seats) {
		super();
		this.flight_id = flight_id;
		this.airline_id = airline_id;
		this.airline_name = airline_name;
		this.from_location = from_location;
		this.to_location = to_location;
		this.depart_time = depart_time;
		this.arrival_time = arrival_time;
		this.duration = duration;
		this.total_seats = total_seats;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public int getAirline_id() {
		return airline_id;
	}
	public void setAirline_id(int airline_id) {
		this.airline_id = airline_id;
	}
	public String getAirline_name() {
		return airline_name;
	}
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	public String getFrom_location() {
		return from_location;
	}
	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}
	public String getTo_location() {
		return to_location;
	}
	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}
	public String getDepart_time() {
		return depart_time;
	}
	public void setDepart_time(String depart_time) {
		this.depart_time = depart_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
	
	

}
