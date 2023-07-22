/**
 * 
 */
package com.carstoresystem.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carstoresystem.common.StoreMapStruct;
import com.carstoresystem.dto.EmployeeDto;
import com.carstoresystem.pojo.TbMasterEmployee;
import com.carstoresystem.repository.EmployeeRepository;
import com.carstoresystem.service.EmployeeService;

/**
 * @author hp
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	StoreMapStruct mapStruct;

	@Override
	public EmployeeDto registration(EmployeeDto empDTO) {
		// TODO Auto-generated method stub
		TbMasterEmployee employeePojo=new TbMasterEmployee();
		employeePojo=mapStruct.empDtoToPojo(empDTO);
		empRepo.save(employeePojo);
		return empDTO;
	}

}
