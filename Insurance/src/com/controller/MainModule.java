package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.exception.PolicyNotFoundException;
import com.model.Policy;
import com.service.PolicyService;

public class MainModule {
     public static void main(String[] args) {
		
		PolicyService policyService=new PolicyService();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("---------Insurance Module-------------");
			System.out.println("Press 1. Create Policy ");
			System.out.println("Press 2. Get All policy");
			System.out.println("press 3. Get Policy Details Using PolicyId");
			System.out.println("press 4: Update policy");
			System.out.println("press 5: Delete policy");
			System.out.println("press 0:Exit");
			int input=sc.nextInt();
			if(input==0) {
				System.out.println("Exiting Insurance Module..");
				break;
			}
			switch(input) {
			case 1:
				try {
					Random random =new Random();
					int randomNumber = random.nextInt();
					int policy_id=randomNumber<0?randomNumber*-1:randomNumber;
					System.out.println("Policy ID:" +policy_id);
					
					System.out.println("Enter Policy Name");
					sc.nextLine();
					String name=sc.nextLine();
					
					System.out.println("Enter Premium");
					double premium=sc.nextDouble();
					
				    System.out.println("Enter Rate_Of_Interest");
				    double rate_of_interest=sc.nextDouble();
				    
				    Policy policy=new Policy(policy_id,name,premium,rate_of_interest);
				    int status=policyService.insert(policy);
				    if(status==1)
				    	System.out.println("Policy record added to DB");
				    else
				    	System.out.println("Insert operation failed");
				    }catch(SQLException e){
				    	System.out.println(e.getMessage());
				    
				    }
				    break;
			case 2:
				try {
					List<Policy>list=policyService.findAll();
					for(Policy p :list) {
						System.out.println(p);
					}
				}catch(SQLException e){
					System.out.println(e);
				}
				break;
			case 3:
				try {
					List<Policy>list=policyService.findAll();
					for(Policy p :list) {
						System.out.println("policyId: " +p.getPolicy_id());
					}
					System.out.println("Enter Policy Id:");
					int policy_id=sc.nextInt();
					
					Policy p=policyService.checkpolicyId(policy_id);
					System.out.println(p);
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}catch(PolicyNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					Policy policy=new Policy();
					List<Policy>list=policyService.findAll();
					for(Policy p :list) {
						System.out.println(p);
					}
					System.out.println("Enter policyId:");
					int policy_id=sc.nextInt();
					policy.setPolicy_id(policy_id);
					sc.nextLine();
					policyService.checkpolicyId(policy_id);
					
					System.out.println("Enter policy Name:");
					String name=sc.nextLine();
					policy.setName(name);
					
					
					System.out.println("Enter premium");
					Double premium=sc.nextDouble();
					sc.nextLine();
					policy.setPremium(premium);
					
					System.out.println("Enter rate_of_interest");
					Double rate_of_interest=sc.nextDouble();
					policy.setRate_of_interest(rate_of_interest);
					
					int status=policyService.updatepolicy(policy);
					if(status==1) {
					System.out.println("policy updated succesfully");
					}
					else
						System.out.println("Updation failed");
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}catch(PolicyNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try {
					List<Policy>list=policyService.findAll();
					for(Policy p :list) {
						System.out.println(p);
					}
					System.out.println("Enter policy ID need to be Deleted");
					int policy_id=sc.nextInt();
					int status=policyService.softdeletepolicy(policy_id);
					if(status==1) {
						System.out.println("Policy SoftDeleted Sucessfully");
					}
					else
						System.out.println("softdelete failed");
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}catch(PolicyNotFoundException e) {
					System.out.println(e.getMessage());
				}
	      }
		}
     }		
		
public static void companymenu() {
			String[] args = { "" };
			main(args);
	}
}
