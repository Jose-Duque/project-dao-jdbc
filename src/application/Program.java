package application;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "José");
		System.out.println(obj);
		
		Seller seller =new Seller(1, "carlos", "cj@gmail", null, 20.0, obj);
		System.out.println(seller);
	}

}
