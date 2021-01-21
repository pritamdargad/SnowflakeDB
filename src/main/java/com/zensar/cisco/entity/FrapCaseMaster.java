package com.zensar.cisco.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="QPI_FRAP_CASE_MASTER", catalog="CSCQUALITY_DB.CSCQUALITY_QPI_BR")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NamedQuery(name = "findByFrapCaseId" , query = "SELECT f from FrapCaseMaster f where f.frapCaseId=?1")
public class FrapCaseMaster {
	 
	@Id
	@Column(name = "FRAP_CASE_ID")
	private String frapCaseId;
	@Column(name = "FRAP_CASE_STATUS")
	private String FRAP_CASE_STATUS;
	@Column(name = "FRAP_PROBLEM_TITLE")
	private String FRAP_PROBLEM_TITLE;
	@Column(name = "FRAP_PROBLEM_DESC")
	private String FRAP_PROBLEM_DESC;
	@Column(name = "LAST_REFRESHED_ON")
	private Date LAST_REFRESHED_ON;
	@Column(name = "FRAP_CASE_REFRESH_COUNTER")
	private Integer FRAP_CASE_REFRESH_COUNTER;
	@Column(name = "KONA_INPUT_GENERATED_FLAG")
	private Boolean KONA_INPUT_GENERATED_FLAG;
	@Column(name = "KONA_OUTPUT_GENERATED_FLAG")
	private Boolean KONA_OUTPUT_GENERATED_FLAG;
	@Column(name = "KONA_INPUT_GENERATED_BY")
	private String KONA_INPUT_GENERATED_BY;
	@Column(name = "KONA_INPUT_GENERATED_ON")
	private Date KONA_INPUT_GENERATED_ON;
	@Column(name = "KONA_INPUT_GENERATED_STATUS")
	private String KONA_INPUT_GENERATED_STATUS;
	@Column(name = "CREATED_BY")
	private String CREATED_BY;
	@Column(name = "CREATED_ON")
	private Date CREATED_ON;
	@Column(name = "UPDATED_BY")
	private String UPDATED_BY;
	@Column(name = "UPDATED_ON")
	private Date UPDATED_ON;
	@Column(name = "ERROR_MESSAGE")
	private String ERROR_MESSAGE;
	@Column(name = "ERROR_CODE")
	private String ERROR_CODE;
	@Column(name="FRAP_CASE_REFRESH_TYPE")
	private String FRAP_CASE_REFRESH_TYPE;

}
