package ingsw.pdd.facade.subsystems.crm;

import ingsw.pdd.facade.util.Customer;
import ingsw.pdd.facade.util.OnMemoryDataBase;


public class CRMSystem {
    
    public Customer findCustomer(Long customerId){
        return OnMemoryDataBase.findCustomerById(customerId);
    }
}