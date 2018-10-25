package com.capgemini.tcc.service;

import com.capgemini.tcc.bean.PatientBean;
import com.capgemini.tcc.ui.Client;



public interface IPatientService {
	
	PatientBean addPatientDetails(PatientBean patient) throws Exception ;
	
	
}
