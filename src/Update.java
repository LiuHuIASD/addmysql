import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Update {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("加载成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("有异常");
			e.printStackTrace();

		}
		try {
			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studb", "root", "liuhui");
			System.out.println("连接创建成功");
			Statement sta = (Statement) con.createStatement();
			int c = sta
					.executeUpdate("UPDATE studb.studentinfo SET stuid='10' WHERE stuid='10007'");
			System.out.println("更新" + c + "条");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("连接创建失败");
			e.printStackTrace();
		}
	}
}
