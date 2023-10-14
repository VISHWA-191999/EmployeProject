package com.projectEmp.com.projectEmp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projectEmp.com.projectEmp.model.CcEmailId;
import com.projectEmp.com.projectEmp.model.EmpData;

public interface EmpDatable extends JpaRepository<EmpData, Integer> {
	
	@Query(value = "SELECT * FROM emp_data  WHERE DATE_FORMAT(STR_TO_DATE(dob, '%d-%m-%Y'), '%m-%d') = DATE_FORMAT(CURDATE(), '%m-%d')", nativeQuery = true)
	public List<EmpData> findUsersBydob();

	@Query(value = "SELECT * FROM emp_data  WHERE DATE_FORMAT(STR_TO_DATE(dob, '%d-%m-%Y'), '%m-%d') = DATE_FORMAT(CURDATE(), '%m-%d')", nativeQuery = true)
	public List<EmpData> findUsersByDoj();

//	@Query
//	(value = "SELECT * FROM emp_data WHERE id= :id", nativeQuery = true)
//	public List<EmpData> getUserList(@Param("id") int id);

	// List<EmpData> findAll();

// @Query
// 
//(select dob from emp_data where )
//List<EmpData> findByDob(String dob);

	/*
	 * @Query(value = "SELECT dob FROM emp_data  WHERE emp_name = :value",
	 * nativeQuery=true) List<EmpData> findByName(@Param("value") String value);
	 */
// @Query(value="SELECT u.NAME, u.GMAIL_ID, u.EMAIL\r\n"
// 		+ "FROM ppkvi_user u\r\n"
// 		+ "WHERE DATE_FORMAT(STR_TO_DATE(u.DATE_OF_BIRTH, '%d-%m-%Y'), '%m-%d') = DATE_FORMAT(CURDATE(), '%m-%d')", nativeQuery = true)
// public List<User> findUsersByDateOfBirth();

	
	
	

}
