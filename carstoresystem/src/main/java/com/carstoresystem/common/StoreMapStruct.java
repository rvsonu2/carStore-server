package com.carstoresystem.common;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.carstoresystem.dto.EmployeeDto;
import com.carstoresystem.pojo.TbMasterEmployee;

@Component
@Mapper(componentModel = "spring")
public interface StoreMapStruct {

	TbMasterEmployee empDtoToPojo(EmployeeDto empDTO);

}
