package ingsw.pdd.abstractfactory.rest;

import ingsw.pdd.abstractfactory.impl.IServiceStackAbstractFactory;
import ingsw.pdd.abstractfactory.service.IEmployeeService;
import ingsw.pdd.abstractfactory.service.IProductsService;

public class RestServiceStackImpl implements IServiceStackAbstractFactory{

    public IEmployeeService getEmployeeService() {
        return new EmployeeServiceRestImpl();
    }

    public IProductsService getProductsService() {
        return new ProductServiceRestImpl();
    }
}