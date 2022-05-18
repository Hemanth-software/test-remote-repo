package in.hemanthtamarla.springrestapi.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.hemanthtamarla.springrestapi.model.Employee;
import in.hemanthtamarla.springrestapi.service.EmployeeServiceInterface;

@RestController
public class EmployeeController {

	// localhost:8080/api/v1/employees
	
	@Autowired
    private EmployeeServiceInterface employeeInterface;
	
	
	
//	@Value("${app.name}")
//	public String appName;
//	
//	@Value("${app.version}")
//	public String appVersion;
//	
//	@GetMapping("/version")
//	public String getappName() {
//		return appName+" "+appVersion;
//	}
	
	
	
//	@RequestMapping(value="/employees", method=RequestMethod.GET)
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		
		return employeeInterface.getAllEmployees();
		
	}
	
	// using pathvariable
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") Long id) {
		
		return employeeInterface.getEmployeeByID(id);
	}
	
	
	// mapping json data to java object
	
	@PostMapping("/employees")
	public Employee savaEmployee(@Valid @RequestBody Employee employee) {
		
		return employeeInterface.saveEmployee(employee);
		
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
		
		employee.setId(id);
		return employeeInterface.updateEmployeeByID(id, employee);
	}
	
	
	
	
	
	// using requestparam
	
	@DeleteMapping("/employees")
	public void deleteEmployeeById(@RequestParam("id") Long id) {
		
		employeeInterface.deleteEmployeeByID(id);
		
	}
	
	
	
	
}
