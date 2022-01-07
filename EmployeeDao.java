package dao;

import java.util.List;
import javax.sql.DataSource;

import springjdbc.Employee;

public interface EmployeeDao {

	public void setDataSource(DataSource ds);

	public Employee getEmployee(int empId);

	public void addemployee(Employee e);

	public List<Employee> getEmployeeList();

}
