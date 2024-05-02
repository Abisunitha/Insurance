package com.model;

public class Policy {
  private int policy_id;
  private String name;
  private double premium;
  private double rate_of_interest;
public Policy(int policy_id, String name, double premium, double rate_of_interest) {
	super();
	this.policy_id = policy_id;
	this.name = name;
	this.premium = premium;
	this.rate_of_interest = rate_of_interest;
}
public Policy() {
	super();
	// TODO Auto-generated constructor stub
}
public int getPolicy_id() {
	return policy_id;
}
public void setPolicy_id(int policy_id) {
	this.policy_id = policy_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPremium() {
	return premium;
}
public void setPremium(double premium) {
	this.premium = premium;
}
public double getRate_of_interest() {
	return rate_of_interest;
}
public void setRate_of_interest(double rate_of_interest) {
	this.rate_of_interest = rate_of_interest;
}
@Override
public String toString() {
	return "Policy [policy_id=" + policy_id + ", name=" + name + ", premium=" + premium + ", rate_of_interest="
			+ rate_of_interest + "]";
}

}
