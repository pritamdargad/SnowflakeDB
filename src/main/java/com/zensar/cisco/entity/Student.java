package com.zensar.cisco.entity;

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
@Table(name="Student",schema="CSCQUALITY_DB.CSCQUALITY_QPI_BR")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
/*
 * @NamedQueries({ NamedQuery(name="Student.findByStudentName", query =
 * "SELECT s FROM Student s WHERE s.studentId=?1"),})
 */
@NamedQuery(name = "Student.findAll" ,query = "SELECT s.studentId as studentId, s.classId as classId ,s.studentName as studentName FROM Student s")
public class Student {

	@Id
	@Column(name="STUDENT_ID")
	private int studentId;
	@Column(name="CLASS_ID")
	private String classId;
	@Column(name="STUDENT_NAME")
	private String studentName;
}


//insert into STUDENT (student_id,class_id,student_name) values(2,'10thclass','pritam');
