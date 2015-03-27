package com.cxic.service.impl;

import com.cxic.dao.PersonDao;
import com.cxic.model.Person;
import com.cxic.service.PersonManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
 
@Service("personManager")
@WebService
public class PersonManagerImpl extends GenericManagerImpl<Person, Long> implements PersonManager {
    PersonDao personDao;
 
    @Autowired
    public PersonManagerImpl(final PersonDao personDao) {
//        super(personDao);
    	this.dao = personDao;
        this.personDao = personDao;
    }
 
    @WebMethod
    public List<Person> findByLastName(String lastName) {
        return personDao.findByLastName(lastName);
    }

    @WebMethod
	@Override
	public List<Person> getPeople() {
	    return personDao.getAllDistinct();
	}
}
