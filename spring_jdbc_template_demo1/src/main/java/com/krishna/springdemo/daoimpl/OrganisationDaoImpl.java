package com.krishna.springdemo.daoimpl;

import com.krishna.springdemo.dao.OrganisationDao;
import com.krishna.springdemo.domain.Organisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("orgDao")
public class OrganisationDaoImpl implements OrganisationDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);

	}

	public boolean create(Organisation org) {
		// TODO Auto-generated method stub
		return false;
	}

	public Organisation getOrganisation(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Organisation> getAllOrganisations() {
		String sqlQuery = "SELECT * FROM organisation";
		List<Organisation> orgList = jdbcTemplate.query(sqlQuery, new OrganisationRowMapper());
		return orgList;
	}

	public boolean delete(Organisation org) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Organisation org) {
		// TODO Auto-generated method stub
		return false;
	}

	public void cleanup() {
		// TODO Auto-generated method stub

	}

}
