package com.cxic.dao.hibernate;

import java.util.List;

import com.cxic.model.Person;
import com.cxic.dao.PersonDao;
 
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
 
@Repository("personDao")
public class PersonDaoHibernate extends GenericDaoHibernate<Person, Long> implements PersonDao {
 
    public PersonDaoHibernate() {
        super(Person.class);
    }
 
    public List<Person> findByLastName(String lastName) {
        return getSession().createCriteria(Person.class).add(Restrictions.eq("lastName", lastName)).list();
    }
}