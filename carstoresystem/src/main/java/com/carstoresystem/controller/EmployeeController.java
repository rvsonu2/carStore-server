/**
 * 
 */
package com.carstoresystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carstoresystem.dto.EmployeeDto;
import com.carstoresystem.service.EmployeeService;

/**
 * @author hp
 *
 */
@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/employee/registration")
	public EmployeeDto registration(@RequestBody EmployeeDto empDTO) {
		return empService.registration(empDTO);
		
	}

}
