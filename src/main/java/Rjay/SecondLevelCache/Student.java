package Rjay.SecondLevelCache;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



	

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private int fee;
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
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
}
