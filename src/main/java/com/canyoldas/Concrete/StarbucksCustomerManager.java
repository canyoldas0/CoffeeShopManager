package com.canyoldas.Concrete;

import com.canyoldas.Abstract.BaseCustomerManager;
import com.canyoldas.Abstract.ICustomerCheckService;
import com.canyoldas.Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager  {

    ICustomerCheckService customerCheckService;
    
    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
    	this.customerCheckService= customerCheckService;
    }
    
    
    
    @Override
    public void Save(Customer customer) {

        if (customerCheckService.CheckIfRealPerson(customer)) {
            super.Save(customer);
        }
        else {
            System.out.println("Not a valid person");
        }

    }


   
    
}
