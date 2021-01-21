package com.zensar.cisco.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.zensar.cisco.entity.FrapCaseMaster;
import com.zensar.cisco.repository.MasterRepository;
import com.zensar.cisco.repository.StudentRepository;

@Component
public class Runner implements CommandLineRunner {

	
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	MasterRepository masterRepository;
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Inside the main unnerr");
		// FrapCaseMaster frapCaseMaster = new FrapCaseMaster();

		/*
		 * System.out.println("frapCaseMaster :"+ masterRepository.getData());
		 * 
		 * System.out.println("Inside the runner"); List<FrapCaseMaster> frapCaseMaster
		 * = masterRepository.findByFrapCaseId("FRAP_296");
		 * frapCaseMaster.forEach(System.out::println);
		 */

		/*
		 * Optional<Student>st = studentRepo.findById(1);
		 * st.ifPresent(System.out::println);
		 */

		/*
		 * System.out.println("####RAJAN#####################################");
		 * System.out.println("Testing : "+ masterRepository.getData());
		 * 
		 * System.out.println("#########################################");
		 * 
		 * 
		 * List<FrapCaseMaster> fr= masterRepository.findByFrapCaseId("FRAP_296");
		 * 
		 * if(fr.isEmpty()) {
		 * 
		 * System.out.println("FRAP is empty"); } else {
		 * fr.stream().forEach(System.out::println); }
		 * 
		 * System.out.println("##########Student Information by id########");
		 * 
		 * 
		 * Optional<Student> fr= studentRepo.findById(1);
		 * 
		 * if(fr.isEmpty()) {
		 * 
		 * System.out.println("FRAP is empty"); } else {
		 * fr.stream().forEach(System.out::println); }
		 * 
		 * 
		 * 
		 * 
		 * //List<Student> l = studentRepo.findAll(); //l.forEach(System.out::println);
		 */
	
		/*
		 * System.out.println(
		 * "================================================================================="
		 * ); Optional<FrapCaseMaster> fr = masterRepository.findById("FRAP_296");
		 * 
		 * fr.ifPresent(System.out::println);
		 * 
		 * System.out.println(
		 * "================================================================================="
		 * );
	
		 */
		
		/*
		 * System.out.
		 * println("DETAILS########################  ENTER #########################");
		 * List<Student> l = studentRepository.findAll();
		 * l.forEach(System.out::println);
		 */
		
		List<FrapCaseMaster> fr= masterRepository.findByFrapCaseId("FRAP_296");
		 
		  if(fr.isEmpty()) {
		  
		  System.out.println("FRAP is empty"); } else {
		  fr.stream().forEach(System.out::println); }
		  
	}

}
