package ingsw.pdd.abstractfactory.impl;

import ingsw.pdd.abstractfactory.service.IEmployeeService;
import ingsw.pdd.abstractfactory.service.IProductsService;

public interface IServiceStackAbstractFactory {
	
	public IEmployeeService getEmployeeService();
    public IProductsService getProductsService();

}
