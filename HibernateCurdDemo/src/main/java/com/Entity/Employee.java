package com.Entity;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emptab")
public class Employee {
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="dept")
	private String empDept;
	@Column(name="sal")
	private Double empSalary;
	
	public Employee(String empName, String empDept, Double empSalary) {
		super();
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSalary=" + empSalary
				+ "]";
	}
	
}
