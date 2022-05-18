package in.hemanthtamarla.springrestapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.hemanthtamarla.springrestapi.model.Employee;
import in.hemanthtamarla.springrestapi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

	@Autowired
	private EmployeeRepository eRepository;
	
//public static List<Employee> e = new ArrayList<>();
//	
//	
//	
//	static {
//		
//		Employee employee = new Employee();
//		employee.setName("Hemanth");
//		employee.setAge(26L);
//		employee.setLocation("Toronto");
//		employee.setEmail("hemanthwork123@gmail.com");
//		employee.setDepartment("IT");
//		e.add(employee);
//		
//	}
//	
	
	
	@Override
	public List<Employee> getAllEmployees() {
		return eRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return eRepository.save(employee);
	}

	@Override
	public Employee getEmployeeByID(Long id) {
		Optional<Employee> employee =  eRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}
		throw new RuntimeException("Employee is not found for the id "+id);
	}

	@Override
	public void deleteEmployeeByID(Long id) {

		eRepository.deleteById(id);
	}

	@Override
	public Employee updateEmployeeByID(Long id, Employee employee) {
		return eRepository.save(employee);
	}

	

	
	
	
	
	
}
