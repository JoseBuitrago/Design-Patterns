package ingsw.pdd.abstractfactory.rest;

import ingsw.pdd.abstractfactory.service.IEmployeeService;

public class EmployeeServiceRestImpl implements IEmployeeService{
    private static final String[] EMPLOYEES = new String[]{"Juan","Pedro","Manuel"};

    public String[] getEmployee() {
        System.out.println("RestFul");
        return EMPLOYEES;
    }
}