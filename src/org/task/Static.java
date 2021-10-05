package org.task;

public class Static {

	
	final void empId(int id) {
		
		System.out.println("emp id is"+id);
	}
	 
final void empId(Long numb ) {
		
		System.out.println("emp id is"+numb);
	}
	
	public static void main(String[] args) {
			Static s=new Static();
			s.empId(1234);
			s.empId(7401177896l);
	}
	
	

}
