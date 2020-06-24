package com.vinod.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.vinod.dao.ContactsDao;
import com.vinod.dao.DaoException;
import com.vinod.dao.DaoFactory;

	@Path ("/contacts")
	public class ContactsResource {
	
	private ContactsDao dao;
	
	public ContactsResource() throws DaoException {
	dao = DaoFactory.getContactsDao();   	
	}
	
	@GET
	@Produces({"application/json"})
	public Response getAllContacts() throws DaoException {
		return Response.ok(dao.findAll()).build();
	}
}

	
	