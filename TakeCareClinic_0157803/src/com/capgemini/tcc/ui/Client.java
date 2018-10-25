package com.capgemini.tcc.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.capgemini.tcc.bean.PatientBean;
import com.capgemini.tcc.exception.PatientException;
import com.capgemini.tcc.service.IPatientService;
import com.capgemini.tcc.service.PatientService;



public class Client {
	public static void main(String[] args) {
		PatientBean patient=new PatientBean();
		PatientService service=new PatientService();
		Scanner sc= new Scanner(System.in);
        System.out.println("add details");
        
        
        System.out.println("enter patient name");
        String patientname=sc.next();
        System.out.println("enter age");
        int age=sc.nextInt();
        System.out.println("enter phone number");
        String phoneno=sc.next();
        System.out.println(" enter description");
        String description=sc.next();
        
        int sum = service.sum();
        
        try{
        	PatientBean p1=service.addPatientDetails(patient);
        	System.out.println("details added to the data base"+p1.getPatientid());
        }catch(Exception e)
        {System.out.println(e.getMessage());
        }
		
}}


	
	