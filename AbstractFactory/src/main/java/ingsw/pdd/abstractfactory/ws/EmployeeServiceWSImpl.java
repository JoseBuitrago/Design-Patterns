package ingsw.pdd.abstractfactory.ws;

import ingsw.pdd.abstractfactory.service.IEmployeeService;

public class EmployeeServiceWSImpl implements IEmployeeService {

    private static final String[] EMPLOYEES = new String[]{"Maria", "Rebeca", "Liliana"};

    public String[] getEmployee() {
        System.out.println("WebServices");
        return EMPLOYEES;
    }
}
