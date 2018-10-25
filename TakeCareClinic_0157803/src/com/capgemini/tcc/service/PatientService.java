package com.capgemini.tcc.service;



import com.capgemini.tcc.bean.PatientBean;
import com.capgemini.tcc.dao.IPatientDao;
import com.capgemini.tcc.dao.PatientDao;
import com.capgemini.tcc.ui.Client;



public class PatientService implements IPatientService {
	IPatientDao dao;
	public PatientService(){
		dao = new PatientDao();
	}
	@Override
	public PatientBean addPatientDetails(PatientBean patient) throws Exception {
		// TODO Auto-generated method stub
		return dao.addPatientDetails(patient);

	}
	
	public int sum(){
		return 2+2;
		
		
	}
}
	
	
