package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.PolicyDao;
import com.exception.PolicyNotFoundException;
import com.model.Policy;
import com.utility.DBConnection;

public class PolicyDaoImpl implements PolicyDao {

	@Override
	public int save(Policy policy) throws SQLException {
		// TODO Auto-generated method stub
			Connection con=DBConnection.dbConnect();
			String sql="INSERT INTO policy (policy_id, name,premium,rate_of_interest) VALUES(?,?,?,?)";
			PreparedStatement pstmt= con.prepareStatement(sql);
			
			pstmt.setInt(1, policy.getPolicy_id());
			pstmt.setString(2,policy.getName());
			pstmt.setDouble(3,policy.getPremium());
			pstmt.setDouble(4,policy.getRate_of_interest());
			
			int status=pstmt.executeUpdate();
			DBConnection.dbClose();
			return status;
			// TODO Auto-generated method stub
		}

	@Override
	public List<Policy> findAll() throws SQLException {
		// TODO Auto-generated method stub
	
				Connection con=DBConnection.dbConnect();
				String sql="select * from policy ";
				PreparedStatement pstmt= con.prepareStatement(sql);
				ResultSet rst=pstmt.executeQuery();
				List<Policy> list =new ArrayList<>();
				while(rst.next()==true) {
					int policy_id=rst.getInt("Policy_id");
					String name=rst.getString("name");
					Double premium=rst.getDouble("premium");
					Double rate_of_interest=rst.getDouble("rate_of_interest");
					Policy policy = new Policy(policy_id,name,premium,rate_of_interest);
					list.add(policy);
				}
				DBConnection.dbClose();
				return list;
		
	}

	@Override
	public boolean findOne(int policy_id) throws SQLException, PolicyNotFoundException {
		// TODO Auto-generated method stub
		
		Connection con=DBConnection.dbConnect();
		String sql="select policy_id from policy where policy_id=?";
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setInt(1, policy_id);
		ResultSet rst=pstmt.executeQuery();
		boolean status=rst.next();
		DBConnection.dbClose();
		return status;
	}

	@Override
	public Policy checkpolicyId(int policy_id) throws SQLException, PolicyNotFoundException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="select *from policy where policy_id=?";
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setInt(1, policy_id);
		ResultSet rst=pstmt.executeQuery();
		if(rst.next()) {
			Policy policy=new Policy();
			
			policy.setPolicy_id(rst.getInt("policy_id"));
			policy.setName(rst.getString("name"));
			policy.setPremium(rst.getDouble("premium"));
			policy.setRate_of_interest(rst.getDouble("rate_of_interest"));
			DBConnection.dbClose();
			return policy;
		}
		else {
			return null;
		}
		
	}

	@Override
	public int updatepolicy(Policy policy) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="Update policy SET name=?,premium=?,rate_of_interest=? where policy_id=?";
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setString(1, policy.getName());
		pstmt.setDouble(2, policy.getPremium());
		pstmt.setDouble(3,policy.getRate_of_interest());
		pstmt.setInt(4,policy.getPolicy_id());
		
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
		
	}

	@Override
	public int softdeletepolicy(int policy_id) throws SQLException, PolicyNotFoundException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="UPDATE policy set isActive='no' where policy_id=? ";
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setInt(1, policy_id);
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}
		
	}
	

