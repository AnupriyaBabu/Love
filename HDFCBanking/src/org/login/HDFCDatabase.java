package org.login;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class HDFCDatabase {
	
	//POJO class
		Map<String,Integer> m;

	//Data Members
	private String cusId;
	
	private int password;
	
	private int balance;

	
	//setter method
	
	public void setCusId(String cusId) {
		if(cusId.equals("123Sumaya")) {
		this.cusId ="Sumaya cusId";
	}
		else if (cusId.equals("123Raja")) {
			this.cusId ="Raja cusId";
		}
		else if(cusId.equals("123Sitha")) {
			this.cusId ="Sitha cusId";	
		}
		else if(cusId.equals("123Geetha")) {
			this.cusId ="Geetha cusId";	
		}
		else if(cusId.equals("123Rani")) {
			this.cusId ="123Rani cusId";	
		}
		else {
			this.cusId ="InValid Account";
		}
	}
	public void setPassword(int password) {
		if(password==111&&cusId.equals("Sumaya cusId")) {
		this.password=1;
	}
		else if(password==112&&cusId.equals("Raja cusId")) {
			this.password=2;
		}
		else if(password==113&&cusId.equals("Sitha cusId")) {
			this.password=3;
		}
		else if(password==114&&cusId.equals("Geetha cusId")) {
			this.password=4;
		}
		else if(password==115&&cusId.equals("Rani cusId")) {
			this.password=5;
		}
		else {
			this.password=0;
		}
	}
	
	public void setBalance() {
		if(password==1) {
			Integer integer=m.get("Sumaya Account");
			this.balance =integer;
		}
		else if(password==2) {
			Integer integer=m.get("Raja Account");
			this.balance =integer;
		}
		else if(password==3) {
			Integer integer=m.get("Sitha Account");
			this.balance =integer;
		}
		else if(password==4) {
			Integer integer=m.get("Geetha Account");
			this.balance =integer;
		}
		else if(password==5) {
			Integer integer=m.get("Rani Account");
			this.balance =integer;
		}
		else {
			this.balance=0;
		}	
	}
	
	//Getter method
	public String getCusId() {
		return null;
	}
	public int getPassword() {
		return 0;
	}
	public int getBalance() {
		return balance;
	}
	
	
	public void readDataFromTextFile() throws IOException {
		m=new LinkedHashMap();
		File f=new File("C:\\Users\\venki\\eclipse-workspace\\HDFCBanking\\Database\\HDFCDatabasefile.txt");
		List<String> allData=FileUtils.readLines(f);
		String  string=allData.get(0);
		String[] s1=string.split(",");
		String value=s1[2];
		//convert String into Integer
		int parseInt = Integer.parseInt(value);
		m.put("Sumaya Account",parseInt);
		
		String string2 =allData.get(1);
		String[] s2=string2.split(",");
		int parseInt2 = Integer.parseInt(s2[2]);
		m.put("Raja Account",parseInt2);
		
		String string3 =allData.get(2);
		String[] s3=string3.split(",");
		int parseInt3 = Integer.parseInt(s3[2]);
		m.put("Sitha Account",parseInt3);
		
		String string4 =allData.get(3);
		String[] s4=string4.split(",");
		int parseInt4 = Integer.parseInt(s4[2]);
		m.put("Geetha Account", parseInt4);
		
		String string5 =allData.get(4);
		String[] s5=string5.split(",");
		int parseInt5 = Integer.parseInt(s5[2]);
		m.put("Rani Account",parseInt5);
		
	}
	
}
