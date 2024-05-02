package com.model;

public class Claim {
     private int claim_id;
     private int claim_num;
     private String datefield;
     private double client_amount;
     private String status;
     private int policy_id;
     private int client_id;
     public Claim(int claim_id, int claim_num, String datefield, double client_amount, String status, int policy_id,
			int client_id) {
		super();
		this.claim_id = claim_id;
		this.claim_num = claim_num;
		this.datefield = datefield;
		this.client_amount = client_amount;
		this.status = status;
		this.policy_id = policy_id;
		this.client_id = client_id;
	}
	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(int claim_id) {
		this.claim_id = claim_id;
	}
	public int getClaim_num() {
		return claim_num;
	}
	public void setClaim_num(int claim_num) {
		this.claim_num = claim_num;
	}
	public String getDatefield() {
		return datefield;
	}
	public void setDatefield(String datefield) {
		this.datefield = datefield;
	}
	public double getClient_amount() {
		return client_amount;
	}
	public void setClient_amount(double client_amount) {
		this.client_amount = client_amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	@Override
	public String toString() {
		return "Claim [claim_id=" + claim_id + ", claim_num=" + claim_num + ", datefield=" + datefield
				+ ", client_amount=" + client_amount + ", status=" + status + ", policy_id=" + policy_id
				+ ", client_id=" + client_id + "]";
	}
	
}
