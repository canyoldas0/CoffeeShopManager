package com.canyoldas;

import com.canyoldas.Abstract.BaseCustomerManager;
import com.canyoldas.Adapters.MernisServiceAdapter;
import com.canyoldas.Concrete.NeroCustomerManager;
import com.canyoldas.Concrete.StarbucksCustomerManager;
import com.canyoldas.Entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Customer customer1= new Customer();
        customer1.setId(1);
        customer1.setFirstName("Can");
        customer1.setLastName("Yoldaş");
        customer1.setDateOfBirth(new Date(1997,12,12));
        customer1.setNationality("Turkish");
        customer1.setTckn("13955467224");






        BaseCustomerManager customerManager = new NeroCustomerManager();
        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        
        
        customerManager.Save(customer1);
        starbucksCustomerManager.Save(customer1);


	// write your code here
    }
}
