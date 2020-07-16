package mainpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		System.out.println("1. Register User");
		System.out.println("2. Login");
		int x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		x = Integer.parseInt(br.readLine());
		
		RegisterPojo registerpojo = new RegisterPojo();
		RegisterDao registerdao = new RegisterDao();
		LoginPojo loginpojo = new LoginPojo();
		LoginDao logindao = new LoginDao();
		switch(x) {
		case 1: 
			System.out.println("Enter the first name:");
			String firstname = br.readLine();
			System.out.println("Enter the last name:");
			String lastname = br.readLine();
			System.out.println("Enter the user name:");
			String username = br.readLine();
			System.out.println("Enter the password:");
			String password = br.readLine();
			System.out.println("Enter the email:");
			String email = br.readLine();
			
			registerpojo.setFiratname(firstname);
			registerpojo.setLastname(lastname);
			registerpojo.setUsername(username);
			registerpojo.setPassword(password);
			registerpojo.setEmail(email);
			
			registerdao.addUser(registerpojo);
			break;
		case 2:
			System.out.println("Enter the user name:");
			String name = br.readLine();
			System.out.println("Enter the password:");
			String pass = br.readLine();
			
			loginpojo.setUsername(name);
			loginpojo.setPassword(pass);
			
			if(logindao.validate(loginpojo)==true) {
				Luck luck = new Luck();
				luck.display();
			}
			else
				System.out.println("Incorrect username or Password");
			break;
		}
	}

}
