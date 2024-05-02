package com.model;

public class Payment {
     private int payment_id;
     private  String payment_date;
     private double payment_amount;
     private int client_id;
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public double getPayment_amount() {
		return payment_amount;
	}
	public void setPayment_amount(double payment_amount) {
		this.payment_amount = payment_amount;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public Payment(int payment_id, String payment_date, double payment_amount, int client_id) {
		super();
		this.payment_id = payment_id;
		this.payment_date = payment_date;
		this.payment_amount = payment_amount;
		this.client_id = client_id;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", payment_date=" + payment_date + ", payment_amount="
				+ payment_amount + ", client_id=" + client_id + "]";
	}
	
}
