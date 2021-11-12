package org.emp;
public class EmployeeNotFoundException extends Exception {
	
@Override
public String getMessage() {
	String msg="Employee not found in unit1";
	return msg;
}		
		
}

	