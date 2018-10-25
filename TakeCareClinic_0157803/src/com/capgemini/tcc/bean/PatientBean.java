package com.capgemini.tcc.bean;

import java.time.LocalDate;

public class PatientBean {

	   private int patientid;
	   private String patientname;
	   private int Age;
	   private String phoneno;
	   private String description;
	   private LocalDate consultationdate;
	   
	   
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getConsultationdate() {
		return consultationdate;
	}
	public void setConsultationdate(LocalDate consultationdate) {
		this.consultationdate = consultationdate;
	}
	   
	   
	
		
	}


