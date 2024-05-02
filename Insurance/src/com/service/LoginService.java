package com.service;

import java.sql.SQLException;

import com.dao.LoginDao;
import com.daoImpl.LoginDaoImpl;
import com.exception.ResourceNotFoundException;
import com.model.User;

public class LoginService {
	LoginDao dao=new LoginDaoImpl();
	public User login(String username, String password) throws SQLException, ResourceNotFoundException {
		// TODO Auto-generated method stub
		 User user=dao.login(username,password);
		if(user==null) {
			throw new ResourceNotFoundException("Enter Valid Credentials");
		}
		return user;
	}

}
