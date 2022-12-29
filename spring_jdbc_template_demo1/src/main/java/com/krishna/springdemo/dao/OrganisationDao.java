package com.krishna.springdemo.dao;

import com.krishna.springdemo.domain.Organisation;

import javax.sql.DataSource;
import java.util.List;

public interface OrganisationDao {
    //set the datasource that will be required to create
    // a connection to the database
    public void setDataSource(DataSource ds);

    //create a record in the organisation table
    public boolean create(Organisation org);

    // retrieve a single organisation
    public Organisation getOrganisation(Integer id);

    // retrieve all organisations from the table;
    public List<Organisation> getAllOrganisations();

    //Delete specific organisation from the table.
    public boolean delete(Organisation org);

    //update an existing organisation
    public boolean update(Organisation org);

    public void cleanup();


}
