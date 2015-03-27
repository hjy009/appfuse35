package com.cxic.dao;

import com.cxic.model.Person;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
 
public interface PersonDao extends GenericDao<Person, Long> {
    @Transactional
    public List<Person> findByLastName(String lastName);
}
