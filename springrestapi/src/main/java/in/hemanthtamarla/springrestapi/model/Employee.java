package in.hemanthtamarla.springrestapi.model;


import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
@Table(name="tbl_employee")
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
    
	@Column(name="name")
	@NotNull
	private String name;
	
	@Column(name="age")
	private Long age;
	
	@Column(name="location")
	private String location;
	
	@Column(name="email")
	@Email(message="please enter valid email address")
	private String email;
	
	@Column(name="department")
	private String department;
	
	@CreationTimestamp
	@Column(name="createdAt", nullable=false, updatable = false)
	private Date createdAt;
	

	@UpdateTimestamp
	@Column(name="updatedAt")
	private Date UpdatedAt;
	
	
	
	
	

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return UpdatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		UpdatedAt = updatedAt;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", location=" + location + ", email=" + email
				+ ", department=" + department + "]";
	}
	
	
	
}
