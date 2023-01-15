package com.kubernate.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kubernate.docker.model.Employee;
@RestController
public class Controller {

	@GetMapping("/getEmployee")
	public Employee data() {

		Employee ee = new Employee();
		ee.setAddress("Santhapada");
		ee.setName("Soumya");
		ee.setSalary(80000);

		return ee;

	}

}
