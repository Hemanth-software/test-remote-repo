package in.hemanthtamarla.springrestapi.service;

import java.util.List;
import java.util.Optional;

import in.hemanthtamarla.springrestapi.model.Employee;

public interface EmployeeServiceInterface {

	public List<Employee> getAllEmployees();
	
	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeByID(Long id);
	
	public Employee updateEmployeeByID(Long id, Employee employee);
	
	public void deleteEmployeeByID(Long id);
	
	
}
