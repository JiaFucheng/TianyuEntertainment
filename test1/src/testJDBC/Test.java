package testJDBC;

import java.sql.*;

public class Test {
	public static void main(String[] args){
		try {
			System.out.println("Hello world!");  // Added by JiaFuhceng, 9/2 9:36
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection( //��Ϊ��Ӧ���˺ź�����
					"jdbc:mysql://localhost:3306/tianyu?characterEncoding=utf8", "root", "admin");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from �û���");
			while(rs.next()){
				System.out.println(rs.getString("�˺�") + "\t" + rs.getString("���"));
			}
			rs.close();
			st.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
