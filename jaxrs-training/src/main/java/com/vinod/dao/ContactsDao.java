package com.vinod.dao;

import java.util.List;

import com.vinod.entity.Contact;

public interface ContactsDao {

	// CRUD OPERATIONS
	public Contact addContact(Contact contact) throws DaoException; // POST

	public Contact findById(Integer id) throws DaoException; // GET

	public Contact updateContact(Contact contact) throws DaoException; // PUT

	public void deleteContact(Integer id) throws DaoException; // DEL

	// QUERIES list of contacts  by all,city,country 
	public List<Contact> findAll() throws DaoException;

	public List<Contact> findByCity(String city) throws DaoException;

	public List<Contact> findByCountry(String country) throws DaoException;

}
