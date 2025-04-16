package EmployeeManagementSystem;

import java.util.Comparator;

public class SortByName implements Comparator<Employee>{
	



	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o2.getName().compareTo(o1.getName());
		//return 0;
	}
}