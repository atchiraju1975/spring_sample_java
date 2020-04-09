package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Value("${dbUsername}")
    private String dbUsername;

    public List<Customer> findall (){

        System.out.println(dbUsername);

        ArrayList customers = new ArrayList();

        Customer customer = new Customer();

        customer.setFirstname("Srinivasa");
        customer.setLastname("Chakka");

        customers.add(customer);

        return customers;
    }
}
