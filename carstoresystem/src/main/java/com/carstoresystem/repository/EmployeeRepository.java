/**
 * 
 */
package com.carstoresystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carstoresystem.pojo.TbMasterEmployee;

/**
 * @author hp
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<TbMasterEmployee, Integer> {

}
