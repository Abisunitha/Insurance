package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.PolicyDao;
import com.daoImpl.PolicyDaoImpl;
import com.exception.PolicyNotFoundException;
import com.model.Policy;

public class PolicyService {
    PolicyDao dao=new PolicyDaoImpl();
	public int insert(Policy policy) throws SQLException {
		// TODO Auto-generated method stub
		
		
		return dao.save(policy);
	}
	public List<Policy> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	public Policy checkpolicyId (int policy_id) throws SQLException,PolicyNotFoundException {
		// TODO Auto-generated method stub
		boolean isvalid=dao.findOne(policy_id);
		if(!isvalid) {
			throw new PolicyNotFoundException("Invalid Policy Id ");
		}
		return dao.checkpolicyId(policy_id);
	}
	public int updatepolicy(Policy policy) throws SQLException {
		// TODO Auto-generated method stub
		return dao.updatepolicy(policy);
	}
	public int softdeletepolicy(int policy_id) throws SQLException, PolicyNotFoundException {
		// TODO Auto-generated method stub
		boolean isvalid=dao.findOne(policy_id);
		if(!isvalid) {
			throw new PolicyNotFoundException("Policy ID Invalid!!!!!");
		}
		return dao.softdeletepolicy(policy_id);
	}

}
