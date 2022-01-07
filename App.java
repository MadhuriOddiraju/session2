package model;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDAOImplementation;
import springjdbc.Employee;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		EmployeeDAOImplementation empdao = (EmployeeDAOImplementation) context.getBean("EmployeeDAOImplementation");
//		Employee emp = empdao.getEmployee(1);
//		System.out.println(emp);
//		Scanner sc = new Scanner(System.in);
//		Employee emp1 = new Employee();
//		System.out.println("enter employee details empId,empName,empSalary");
//		emp1.setEmpId(sc.nextInt());
//		emp1.setEmpName(sc.next());
//		emp1.setEmpSalary(sc.nextInt());
//		employeeDAO.addemployee(emp1);
		List<Employee> result =empdao.getEmployeeList();
		System.out.println(result);
		

	}

}
