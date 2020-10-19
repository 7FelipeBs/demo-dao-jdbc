package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
				
		System.out.println("===== TEST 1: Department findById =====");
		System.out.println();
		
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println();
		System.out.println("===================================");
		
		System.out.println();
		System.out.println("===== TEST 2: Department findAll =====");
		System.out.println();

		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println();
		System.out.println("===================================");
		
		System.out.println();
		System.out.println("===== TEST 3: Department insert =====");
		System.out.println();
		
		Department newDepartment = new Department();
		/*
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		*/
		department = departmentDao.findById(5);
		System.out.println("Department Insert: " + department.getName());
		System.out.println();
		System.out.println("===================================");
		
		System.out.println();
		System.out.println("===== TEST 4: Department update =====");
		System.out.println();
		
		department = departmentDao.findById(2);
		department.setName("Electronics Modern");
		departmentDao.update(department);
		System.out.println("Update completed: " + department.getName());
		
		System.out.println();
		System.out.println("===================================");
		
		System.out.println();
		System.out.println("===== TEST 5: Department dellete =====");
		System.out.println();
		departmentDao.deleteById(8);
		System.out.println("Success delete department!");
		
		System.out.println();
		System.out.println("===================================");
		sc.close();
	}
}