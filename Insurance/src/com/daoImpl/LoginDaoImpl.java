package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.LoginDao;
import com.exception.ResourceNotFoundException;
import com.model.User;
import com.utility.DBConnection;

public class LoginDaoImpl implements LoginDao {

	@Override
	public User login(String username, String password) throws SQLException, ResourceNotFoundException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="SELECT * from user where username=? and password=? ";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,username);
		pstmt.setString(2,password);
		ResultSet rst=pstmt.executeQuery();
		if(rst.next()) {
			User userlogin=new User();
			userlogin.setUser_id(rst.getInt("user_id"));
			userlogin.setUsername(rst.getString("username"));
			userlogin.setPassword(rst.getString("password"));
			userlogin.setRole(rst.getString("role"));
			
			return userlogin;
		}
		else
			DBConnection .dbClose();
		return null;
	}

}
