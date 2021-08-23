package com.ust.springboot;

import java.util.List;

public interface EmpService {
	List <Emp> getEmployees();
	void saveemployee(Emp employee);
	Emp getEmployeeById(String id);
	void deleteEmployeeById(String id);
}
