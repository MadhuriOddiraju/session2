package dao;

import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import springjdbc.Employee;

public class EmployeeDAOImplementation implements EmployeeDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);

	}

	public Employee getEmployee(int empId) {
		String query = "select * from employee where empId =" + empId;
		System.out.println("QUERY =" + query);
		return (Employee) jdbcTemplate.queryForObject(query, (RowMapper<Employee>) new EmployeeRowMapper());

	}

	class EmployeeRowMapper implements RowMapper<Employee> {
		public Employee mapRow(ResultSet resultset, int i) throws SQLException {
			Employee employee = new Employee();
			employee.setEmpId(resultset.getInt("empId"));
			employee.setEmpName(resultset.getString("empName"));
			employee.setEmpSalary(resultset.getDouble("empSalary"));
			return employee;
		}
	}

	public void addEmployee(Employee e) {
		String query1 = " insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(query1, e.getEmpId(), e.getEmpName(), e.getEmpSalary());
		if (result == 1) {
			System.out.println("record inserted successfully");
		}
		else {
			System.out.println("some issue occured");
		}
	}

	

	public List<Employee> getEmployeeList() {
		String query2 = "select * from employee";
		return jdbcTemplate.query(query2,new EmployeeResultSetExtractor());
		
	}
	public class EmployeeResultSetExtractor implements ResultSetExtractor<List<Employee>>{
	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException{
		List<Employee> list = new ArrayList();
		while(rs.next()) {
			Employee emp = new Employee();
			emp.setEmpId(rs.getInt("empId"));
			emp.setEmpName(rs.getString("empName"));
			emp.setEmpSalary(rs.getDouble("empSalary"));
			list.add(emp);
			
			
		}
		return list;
	}
	}

	public void addemployee(Employee e) {
		// TODO Auto-generated method stub
		
	}
}

