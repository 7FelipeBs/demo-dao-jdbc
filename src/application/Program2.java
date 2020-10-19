package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
				
		System.out.println("===== TEST 1: Department findById =====");
		System.out.println();
		
		
		System.out.println(departmentDao.findById(3));
		
		
		//Department department = new Department(2, null);
		
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
		
		
		
		System.out.println();
		System.out.println("===================================");
		
		System.out.println();
		System.out.println("===== TEST 4: Department insert =====");
		System.out.println();
		
		
		
		System.out.println();
		System.out.println("===================================");
		
		System.out.println();
		System.out.println("===== TEST 5: Department dellete =====");
		System.out.println();
		
		
		
		System.out.println();
		System.out.println("===================================");
		sc.close();
	}
}