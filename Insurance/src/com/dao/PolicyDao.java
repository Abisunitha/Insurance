package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.PolicyNotFoundException;
import com.model.Policy;

public interface PolicyDao {

	int save(Policy policy)throws SQLException;

	List<Policy> findAll()throws SQLException;

	boolean findOne(int policy_id)throws SQLException,PolicyNotFoundException;

	Policy checkpolicyId(int policy_id)throws SQLException,PolicyNotFoundException;

	int updatepolicy(Policy policy)throws SQLException;

	int softdeletepolicy(int policy_id)throws SQLException,PolicyNotFoundException;

	

}
