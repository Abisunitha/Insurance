package com.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.exception.ResourceNotFoundException;
import com.model.User;
import com.service.LoginService;

public class LoginController {

	public static void main(String[] args) throws SQLException, ResourceNotFoundException {
		Scanner sc = new Scanner(System.in);
		LoginService loginService = new LoginService();
		while(true) {
			System.out.println("Press 1. Login");
			System.out.println("Press 0. Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting Insurance Module..");
				break; 
			}
			switch(input) {
			case 1:
				try {
				System.out.println("Enter UserName:");
				sc.nextLine();
				String username=sc.nextLine();
				
				System.out.println("Enter your password");
				String password=sc.nextLine();
				
				User user=loginService.login(username,password);
				
			     int user_id=user.getUser_id();
			     System.out.println("The user id of this user is: "+user_id);
				if(user.getRole().equals("client")) {
					System.out.println("Company Insurance");
					MainModule.companymenu();
				}
				else {
					System.out.println("NO DATA");
				}
				break;
			}catch(ResourceNotFoundException e) {
				System.out.println(e.getMessage());
			}
			}
	}
	sc.close();
	
}
}
