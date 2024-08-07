package org.project;
//child Class
import org.client.Client;
import org.company.Company;
import org.emp.Employee;
import org.project.Project;

public class Project {
	private void ProjectName() {
		System.out.println("Bank");
		}
		public static void main(String[] args) {
			//child Class
			Project program=new Project();
			program.ProjectName();
			//parent Class
			Client data2=new Client();
			data2.clientName();
			//parent Class
			Company data3=new Company();
			data3.companyName();
			//parent Class
			Employee data4=new Employee();
			data4.empName();
				
		}
}
