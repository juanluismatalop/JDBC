package bd;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainDb {
	public static void main(String[] args) {
		try {
			MobileDB mobileDB = new MobileDB();
			/*
			Mobile mobile = new Mobile("yy", "modelY", 500.03);
			boolean insertSuccess = mobileDB.insertMobile(mobile);
			System.out.printf("Inserccion correcta: %B%n", insertSuccess);
			*/


			/*
			String serial = "xxx1";
			boolean deleteSuccess = mobileDB.deleteMobile(serial);
			System.out.printf("Borrado correcto: %B%n", deleteSuccess);*/

			/*
			String serial = "xxx1";
			double price = 500.0;
			boolean updatePrice = mobileDB.updatePrice(price,serial);
			System.out.printf("Actualizacion correcta: %B%n", updatePrice);
			*/

			List<Mobile> mobiles = mobileDB.getMobiles();
			mobiles.forEach(System.out::println);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
