package org.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Implementation {
	
	public static void main(String[] args) throws IOException {
		
		HDFCDatabase h=new HDFCDatabase();
		h.readDataFromTextFile();
		h.setCusId("123Sumaya");
		h.setPassword(111);
		h.setBalance();
		
		HDFCDatabase h1=new HDFCDatabase();
		h1.readDataFromTextFile();
		h1.setCusId("123Raja");
		h1.setPassword(112);
		h1.setBalance();
		
		HDFCDatabase h2=new HDFCDatabase();
		h2.readDataFromTextFile();
		h2.setCusId("123Sitha");
		h2.setPassword(113);
		h2.setBalance();
		
		HDFCDatabase h3=new HDFCDatabase();
		h3.readDataFromTextFile();
		h3.setCusId("123Geetha");
		h3.setPassword(114);
		h3.setBalance();
		
		HDFCDatabase h4=new HDFCDatabase();
		h4.readDataFromTextFile();
		h4.setCusId("123Rani");
		h4.setPassword(115);
		h4.setBalance();
		
		HDFCDatabase h5=new HDFCDatabase();
		h5.readDataFromTextFile();
		h5.setCusId("123A");
		h5.setPassword(117);
		h5.setBalance();
		
		/*System.out.println(h.getBalance());*/
		
		
		//user defined List,Set,Map
	   //List - Generics - Wrapper class - Similar Datatypes - Wrapper Class
	  //List - Generics - Wrapper class - User defined class - User defined List
		
		List<HDFCDatabase> li = new ArrayList();
		li.add(h);
		li.add(h1);
		li.add(h2);
		li.add(h3);
		li.add(h4);
		li.add(h5);
		
		System.out.println("===============User defined List===============");
		for (int i=0;i<li.size();i++) {
			HDFCDatabase hdfcDatabase=li.get(i);
			System.out.println(hdfcDatabase.getBalance());
		}
		
		//User defined Set
		Set<HDFCDatabase> si = new LinkedHashSet();
		si.add(h);
		si.add(h1);
		si.add(h2);
		si.add(h3);
		si.add(h4);
		si.add(h5);
		
		System.out.println("===============User defined Set===============");
		// User defined Set Iteration
		for(HDFCDatabase x:si) {
			System.out.println(x.getBalance());
		}
		
		//User defined Map
		Map<Integer,HDFCDatabase> m = new LinkedHashMap();
		m.put(10,h);
		m.put(20,h1);
		m.put(30,h2);
		m.put(40,h3);
		m.put(50,h4);
		m.put(60,h5);
		
		//Iteration of Map
		//Convert the map into Set
		//Pair - Entry<Key,Value>
		System.out.println("===============User defined Map===============");
		Set<Entry<Integer,HDFCDatabase>> entrySet = m.entrySet();
		for(Entry<Integer,HDFCDatabase> e: entrySet) {
			System.out.println(e.getValue().getBalance());
		}
			
	}

}
