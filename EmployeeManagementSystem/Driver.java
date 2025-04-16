package EmployeeManagementSystem;

import java.util.*;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("------------------Welcome to EMS-------------");
		
		while (true) {
		System.out.println(
				"1.Add Employee\n2.Print Employee\n3.Search Employee\n4.Search Employee by ID\n5.Delete Employee\n6.Delete Employee by ID\n7.Update Employee by ID\n8.Sort Employee by ID\n9.Sort Employee by name\n10.Sort Employee by salary");
		int choice = sc.nextInt();
		

			switch (choice) {
			case 1: {
				Employee emp = createEmployeeObject(sc);
				Employees.addEmployee(emp);
				break;
			}
			case 2: {

				Employees.printEmployee();
				break;

			}

			case 3: {
				
				Employee emp = createEmployeeObject(sc);
				Employees.search(emp);
				break;

			}
			case 4:{
				System.out.println("Enter id");
				int id=sc.nextInt();
				Employees.searchId(id);
				break;
			}
			case 5:
			{
				Employee e=createEmployeeObject(sc);
				Employees.delete(e);
				break;
			}
			case 6:
			{
				System.out.println("Enter id");
				int id=sc.nextInt();
				Employees.deleteId(id);
				break;
				
			}
			case 7:{
				System.out.println("Enter id");
				int id=sc.nextInt();
				Employees.updateId(id,sc);
				break;
			}
			case 8:
			{
				
				Employees.sort();
				break;
			}
			case 9:
			{
				
				Employees.sortName();
				break;
			}
			case 10:
			{
				
				Employees.sortSalary();
				break;
			}
			default:
				System.exit(0);

			}

		}

	}

	private static Employee createEmployeeObject(Scanner sc) {
		System.out.println("Enter id,name,salary");
		Employee emp = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		return emp;
	}

}
