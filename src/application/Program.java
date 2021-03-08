package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Department dep = new Department(4, null);
		List<Seller> seller = sellerDao.findByDerpartment(dep);
		for(Seller x : seller) {
			
			System.out.println(x);
		}
		
	}

}
