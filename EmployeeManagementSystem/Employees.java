package EmployeeManagementSystem;

import java.util.*;

public class Employees {

	static ArrayList<Employee> emp_list = new ArrayList<Employee>();

	public static void addEmployee(Employee emp) {
		// TODO Auto-generated method stub

		emp_list.add(emp);
		System.out.println("Employee added successfully");

	}

	public static void printEmployee() {
		/*
		 * for(Employee e:emp_list) { System.out.println(e); }
		 */

		/*
		 * Iterator<Employee> itr= emp_list.iterator(); while(itr.hasNext()) { Employee
		 * emp=itr.next(); System.out.println(emp); }
		 */

		ListIterator<Employee> itr = emp_list.listIterator(emp_list.size());
		while (itr.hasPrevious()) {
			Employee emp = itr.previous();
			System.out.println(emp);
		}
	}

	public static void search(Employee emp) {
		// TODO Auto-generated method stub
		if (emp_list.contains(emp)) {
			System.out.println("Found");
			return;
		}
		System.out.println("Not Found");

	}

	public static void searchId(int id) {
		// TODO Auto-generated method stub

		for (Employee e : emp_list) {
			if (e.getId() == id) {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not found");

	}

	public static void delete(Employee e) {
		// TODO Auto-generated method stub
		emp_list.remove(e);
		System.out.println("Deleted");

	}

	public static void deleteId(int id) {
		// TODO Auto-generated method stub
		Employee emp = null;
		for (Employee e : emp_list) {
			if (e.getId() == id) {
				emp = e;
				break;
			}
		}
		try {
			emp_list.remove(emp);
			System.out.println("deleted");
		} catch (Exception e) {
			System.out.println("No such employee");
		}

	}

	public static void updateId(int id, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter name and salary");
		String name = sc.next();
		Double salary = sc.nextDouble();
		Iterator<Employee> itr = emp_list.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			if (e.getId() == id) {
				e.setName(name);
				e.setSalary(salary);
				System.out.println("Updated");
				return;
			}
		}
		System.out.println("No employee");

	}

	public static void sort() {
		// TODO Auto-generated method stub
		Collections.sort(emp_list);
		
	}

	public static void sortName() {
		// TODO Auto-generated method stub
		SortByName sn=new SortByName();
		Collections.sort(emp_list,sn);
		
	}

	public static void sortSalary() {
		// TODO Auto-generated method stub
		SortBySalary sn=new SortBySalary();
		Collections.sort(emp_list,sn);
		
	}

}
