package tr.com.hattap.db;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class ConnectionToDb {

		private static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
		
		private static String url = "jdbc:derby:vt;create=true";
		private static String user = "";
		private static String pass = "";

		
		static{
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
			}
		}
		
		public static Connection getConnection() {

			Connection conn = null;
			try {
				conn = DriverManager.getConnection(url, user, pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return conn;
		}
		
		
		
	}
