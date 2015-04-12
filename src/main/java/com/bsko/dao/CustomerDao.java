package com.bsko.dao;

import com.bsko.model.Customer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

/**
 * Created by Пользователь on 11.04.2015.
 */
@Stateless
public class CustomerDao {

    @PersistenceContext(name = "customers")
    private EntityManager em;

    public Customer get(long id) {
        return em.find(Customer.class, Long.valueOf(id));
    }

    public List<Customer> getAll() {
        return (List<Customer>)em.createNamedQuery("getAll").getResultList();
    }

    public void update(Customer customer) {
        Customer toUpdate = em.find(Customer.class, Long.valueOf(customer.getId()));
        if(toUpdate != null) {
            em.merge(toUpdate);
        }
    }

    public void create(Customer customer) {
        if(em.find(Customer.class, Long.valueOf(customer.getId())) == null) {
            em.persist(customer);
        }
    }

    public void delete(long id) {
        Customer customer = em.find(Customer.class, Long.valueOf(id));
        if(customer != null) {
            em.remove(customer);
        }
    }
}
