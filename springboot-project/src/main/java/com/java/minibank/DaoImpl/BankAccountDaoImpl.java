package com.java.minibank.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.java.minibank.model.BankAccount;

public class BankAccountDaoImpl {

	@Autowired 
	DataSource dataSource;
	
	
    @PostConstruct private void initialize(){ setDataSource(dataSource); }
	
	
	
	public List<BankAccount> getAllUserNames(){
		String sql = "SELECT * FROM BankAccount";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<BankAccount> result = new ArrayList<BankAccount>();
		for(Map<String, Object> row:rows){
			BankAccount bankUserAccount = new BankAccount();
			bankUserAccount.setUserId((String)row.get("userId"));
			bankUserAccount.setUserName((String)row.get("userName"));
			result.add(bankUserAccount);
		}
		
		return result;
	}
	
	
	public BankAccount getUserById(String userId) {
		String sql = "SELECT * FROM BankAccount WHERE userId = ?";
		return (BankAccount)getJdbcTemplate().queryForObject(sql, new Object[]{userId}, new RowMapper<BankAccount>(){
			@Override
			public BankAccount mapRow(ResultSet rs, int rwNumber) throws SQLException {
				BankAccount bankAccountById = new BankAccount();
				bankAccountById.setUserId(rs.getString("userId"));
				bankAccountById.setUserName(rs.getString("userName"));
				return bankAccountById;
			}
		});
	}
	
	
}
