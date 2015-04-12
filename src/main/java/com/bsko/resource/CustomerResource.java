package com.bsko.resource;

import com.bsko.dao.CustomerDao;
import com.bsko.model.Customer;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by Пользователь on 11.04.2015.
 */
@Stateless
@Path("/customer")
public class CustomerResource {

    @EJB
    private CustomerDao customerDao;

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response get(@PathParam(value = "id") Long id) {
        return Response.ok(customerDao.get(id)).build();
    }

    @GET
    @Produces("application/json")
    public Response getAll() {
        return Response.ok(customerDao.getAll()).build();
    }

    @POST
    @Consumes("application/json")
    public Response create(Customer customer) {
        customerDao.create(customer);
        return Response.ok().build();
    }

    @PUT
    @Consumes("application/json")
    public Response update(Customer customer) {
        customerDao.update(customer);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam(value = "id") Long id) {
        customerDao.delete(id);
        return Response.ok().build();
    }
}
