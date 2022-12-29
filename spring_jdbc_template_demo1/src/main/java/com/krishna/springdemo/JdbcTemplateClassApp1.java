package com.krishna.springdemo;

import com.krishna.springdemo.dao.OrganisationDao;
import com.krishna.springdemo.domain.Organisation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateClassApp1 {
    public static void main(String[] args) {
        // creating the application context
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

        // create the bean
        OrganisationDao dao = (OrganisationDao)ctx.getBean("orgDao");
        List<Organisation> orgs = dao.getAllOrganisations();

        for(Organisation org: orgs) {
            System.out.println(org);
        }

        //close the application context
        ((ClassPathXmlApplicationContext) ctx).close();


    }

}
