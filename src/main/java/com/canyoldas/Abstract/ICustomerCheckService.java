package com.canyoldas.Abstract;

import com.canyoldas.Entities.Customer;

public interface ICustomerCheckService {

    boolean  CheckIfRealPerson(Customer customer);
}
