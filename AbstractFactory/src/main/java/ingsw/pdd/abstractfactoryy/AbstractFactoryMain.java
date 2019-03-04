package ingsw.pdd.abstractfactoryy;

import java.util.Arrays;
import ingsw.pdd.abstractfactory.impl.IServiceStackAbstractFactory;
import ingsw.pdd.abstractfactory.impl.ServiceStackAbstractFactory;
import ingsw.pdd.abstractfactory.service.IEmployeeService;
import ingsw.pdd.abstractfactory.service.IProductsService;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        IServiceStackAbstractFactory factory = 
                ServiceStackAbstractFactory.createServiceFactory();
        IEmployeeService employeeService = factory.getEmployeeService();
        IProductsService productService = factory.getProductsService();
        
        System.out.println("EmployeeService class > " 
                + employeeService.getClass().getCanonicalName());
        System.out.println("ProductService class  > " 
                + productService.getClass().getCanonicalName());
        
        System.out.println("getEmployee > " 
                + Arrays.toString(employeeService.getEmployee()));
        System.out.println("getProduct  > " 
                + Arrays.toString(productService.getProducts()));
    }
}