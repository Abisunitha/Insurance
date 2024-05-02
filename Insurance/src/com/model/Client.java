package com.model;

public class Client {
  private int client_id;
  private String client_name;
  private String contact_info;
  private int policy_id;
  private int user_id;
@Override
public String toString() {
	return "Client [client_id=" + client_id + ", client_name=" + client_name + ", contact_info=" + contact_info
			+ ", policy_id=" + policy_id + ", user_id=" + user_id + "]";
}
public int getClient_id() {
	return client_id;
}
public void setClient_id(int client_id) {
	this.client_id = client_id;
}
public String getClient_name() {
	return client_name;
}
public void setClient_name(String client_name) {
	this.client_name = client_name;
}
public String getContact_info() {
	return contact_info;
}
public void setContact_info(String contact_info) {
	this.contact_info = contact_info;
}
public int getPolicy_id() {
	return policy_id;
}
public void setPolicy_id(int policy_id) {
	this.policy_id = policy_id;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public Client() {
	super();
	// TODO Auto-generated constructor stub
}
public Client(int client_id, String client_name, String contact_info, int policy_id, int user_id) {
	super();
	this.client_id = client_id;
	this.client_name = client_name;
	this.contact_info = contact_info;
	this.policy_id = policy_id;
	this.user_id = user_id;
}
}
