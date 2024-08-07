package org.college;
import org.college.Hostel;
public class Dept extends Hostel {
	private void deptName() {
		System.out.println("Science");
		}
	public static void main(String[] args) {
		Dept multi=new Dept();
		multi.deptName();
		multi.collegeName();
		multi.collegeCode();
		multi.collegeRank();
		multi.studentName();
		multi.studentDept();
		multi.studentId();
		multi.hostelName();
			
	}
}
