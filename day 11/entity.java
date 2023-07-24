package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mob")
public class entity {

	@Id
	@GeneratedValue
	private int id;
	private  long mobileNo;
	private String mobileNetwork;
	private String planType;
	private int amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getMobileNetwork() {
		return mobileNetwork;
	}
	public void setMobileNetwork(String mobileNetwork) {
		this.mobileNetwork = mobileNetwork;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public entity(int id, long mobileNo, String mobileNetwork, String planType, int amount) {
		super();
		this.id = id;
		this.mobileNo = mobileNo;
		this.mobileNetwork = mobileNetwork;
		this.planType = planType;
		this.amount = amount;
	}
	public entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
