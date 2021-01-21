package com.zensar.cisco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.zensar.cisco.entity.FrapCaseMaster;

@Component
public interface MasterRepository extends JpaRepository< FrapCaseMaster, String>  {
	
	
	@Query(value="select * from CSCQUALITY_DB.CSCQUALITY_QPI_BR.QPI_FRAP_CASE_MASTER where frap_case_id='FRAP_296'" ,
			nativeQuery=true)
	 public List<FrapCaseMaster> findByFrapCaseId(String frapCaseId);
	

}
