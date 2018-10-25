package com.capgemini.tcc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.capgemini.tcc.bean.PatientBean;
import com.capgemini.tcc.exception.PatientException;
import com.capgemini.tcc.util.DatabaseConnection;



public class PatientDao implements IPatientDao {
	
	
	Connection connection;
	
	public PatientDao() {
	connection= DatabaseConnection.getConnection();	
	}
	public int generatepatientid() throws Exception {
		int id=0;
		try{
			
			Statement s=connection.createStatement();
		     ResultSet rs=s.executeQuery("select patientid_seq.nextval from dual");
		     if(rs.next())
		    	id =rs.getInt(1);
		     //Generated sequence 
		     }catch(SQLException e)
		{
		    	 throw new Exception(e.getMessage());
		}return id;
	}
	
	@Override
	public PatientBean addPatientDetails(PatientBean patient) throws Exception { {
		String sql="insert into patient"
				+ " (patientid, patientname, age, phoneno, description, consultationdate)"
				+ "  values (?,?,?,?,?,sysdate)";		
		try {
			int id =generatepatientid();
			PreparedStatement ps= connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, patient.getPatientname());
			
			ps.setInt(3, patient.getAge());
			
			ps.setString(4, patient.getPhoneno());
			ps.setString(5, patient.getDescription());
			int row = ps.executeUpdate();
			patient.setPatientid(id);
			
			System.out.println(row + "inserted......");
			
			
		}catch (SQLException e) {
			if(e.getErrorCode()==1){
			
			 throw new Exception("Patient id Already exists..!!!");
			}
			else if(e.getErrorCode()==2291){
				
				throw new Exception("Invalid patient id..!!");
			}
			else{
				
				throw new Exception(e.getMessage());
			}
		}
		return patient;
	}}}
	
	
	