package com.capgemini.tcc.dao;

import com.capgemini.tcc.bean.PatientBean;

public interface IPatientDao {
	
	PatientBean addPatientDetails (PatientBean patient) throws Exception;
	
	

}
