package com.dao;

import java.sql.SQLException;

import com.exception.ResourceNotFoundException;
import com.model.User;

public interface LoginDao {

	User login(String username, String password)throws SQLException,ResourceNotFoundException;

}
