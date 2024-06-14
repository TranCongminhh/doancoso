package quanli;



	import java.sql.Connection;

	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class connect {
	public static Connection getConnection() {
		Connection connection=null;
		 try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 String url = "jdbc:sqlserver://Admin:1433;databaseName=Doancoso1;trustServerCertificate=true";
		     String user = "sa";
		     String password = "12345";
		     connection=DriverManager.getConnection(url, user, password);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	    
		return connection;
		
		
	}
	public static void closeconnection( Connection con) {
		if(con!=null) {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	}


