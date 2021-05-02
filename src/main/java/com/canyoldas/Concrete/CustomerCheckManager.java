package com.canyoldas.Concrete;

import com.canyoldas.Abstract.ICustomerCheckService;
import com.canyoldas.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {

    return true;

    }
}
