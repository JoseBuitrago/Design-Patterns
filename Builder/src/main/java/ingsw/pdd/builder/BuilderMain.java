package ingsw.pdd.builder;

import ingsw.pdd.builder.dto.Employee;

public class BuilderMain {

	public static void main(String[] args) {
			Employee emp = new Employee.EmployeeBuilder().setName("Juan Jaime Perez Paez").setGender("Male").setAge(29).setAdress("742 de Evergreen Terrace "+ "Barrio alto", "Bogotá D.C.", "Colombia", "03400").addContacs("Carlos Castillo", "1122334455", "123", "Casa"," Calle 26 No. 87 - 12 ", "Medellín", "Colombia", "10023").addContacs("Mario Moyano", "3344556677", null, "Celular").addPhones("0314590234 ", null, "Celular").addPhones("0853345099 ", null, "Casa").build();
			System.out.println(emp);
	}
}

