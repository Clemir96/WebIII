package br.com.clemirsergio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="cars")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 11,nullable = false,unique = true)
	private String name;
	@Column(length = 50,nullable = false)
	private String year;
	@Column(length = 30,nullable = false,name="chassiss")
	private String chassiss;
	
	public Car(int id, String name, String year, String chassiss) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.chassiss = chassiss;
	}

	public Car() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getChassiss() {
		return chassiss;
	}

	public void setChassiss(String chassiss) {
		this.chassiss = chassiss;
	}
	
	
	
}
