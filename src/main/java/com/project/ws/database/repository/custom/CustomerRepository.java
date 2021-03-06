package com.project.ws.database.repository.custom;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.project.ws.database.domain.Customer;

/**
 * This is a customer repository interface that extends spring crud repository 
 * and customer custom repository.
 * By using this repository we can do basic Create, Read, Update, Delete 
 * and also do queries with the custom methods that we specified in custom repository.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>, CustomerCustomRepository {

    public List<Customer> findByCustFirstname(String custFirstname);
    public List<Customer> findAll();
}
