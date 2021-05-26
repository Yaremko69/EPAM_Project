package ua.lviv.yaremko.vitalii.hotel;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {
		// jdbc:mysql://localhost:3306/p8db?user=user&password=userpass
		String url = "jdbc:mysql://localhost:3306/epam1.1?user=root&password=root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection(url);
			System.out.println("Ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
