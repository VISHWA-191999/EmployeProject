package com.projectEmp.com.projectEmp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projectEmp.com.projectEmp.model.CcEmailId;

public interface CcEmailIdble extends JpaRepository<CcEmailId, Integer> {

	@Query(value = "select * from cc_email", nativeQuery = true)
	public List<CcEmailId> getCcId();

	@Query(value = "Select ccEmail From CcEmailId")
	List<String>  getCcEmail();
}
