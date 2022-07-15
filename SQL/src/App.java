import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/testdb";
		String user = "root";
		String password = "secret";
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			
			Connection conn = DriverManager.getConnection(url, user, password);
			
			Statement statement = conn.createStatement();
			
			while(true) {
				System.out.println("=====================");
				System.out.println("\nSelect an option: \n1) Print all employees \n2) Add an employee");
				System.out.println("=====================");
				int option =sc.nextInt(); 
				switch (option) {
					case 1: {

						
					ResultSet resultSet = statement.executeQuery("SELECT * FROM test_table");	
					while(resultSet.next()) {
						
					System.out.println(resultSet.getString("name") + " - " + 
							resultSet.getString("dp") + " ("+resultSet.getInt("salary")+")");
					
					}
					break;
				}
			
				case 2: {
					
					sc.nextLine();
					
		             System.out.println("Please enter a name: ");
		             String name = sc.nextLine();
		             
		             
		             System.out.println("Please enter a department: ");
		             String dept = sc.nextLine();
		             
		             
		             System.out.println("Please enter a salary: ");
		             int salary = sc.nextInt();
		             
		             String qry = "INSERT INTO test_table (name, dp, salary) VALUES (?, ?, ?)"; 
		             PreparedStatement statement2 = conn.prepareStatement(qry);
		             statement2.setString(1, name);
		             statement2.setString(2, dept);	
		             statement2.setInt(3, salary);
		             statement2.executeUpdate();
					 break;
				}
			
				default:
				throw new IllegalArgumentException("Unexpected value: " );
				}
			}
			
		
			} catch (SQLException e) {
			// TODO: handle exception
				e.printStackTrace();
			}
		
		}
}
