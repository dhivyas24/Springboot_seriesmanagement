package com.example.SpringBootApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Webseries {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;

    private String sname,season,ep,rat;

    Webseries() {}

    Webseries(int id,String sname,String season,String ep,String rat)

    {
    	this.setId(id);
    	this.setSname(sname);
    	this.setSeason(season);
    	this.setEp(ep);
this.setRat(rat);


    }



	
	public String getEp() {
		return ep;
	}

	public void setEp(String ep) {
		this.ep = ep;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname= sname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRat() {
		return rat;
	}

	public void setRat(String rat) {
		this.rat = rat;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
}