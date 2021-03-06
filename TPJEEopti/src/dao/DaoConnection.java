package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoConnection {
		private static final String	PILOTE="com.mysql.jdbc.Driver";
		private static final String	URL="jdbc:mysql://localhost:3306/bddclients";
		private static final String	USER="root";
		private static final String	PWD="";
		private static Connection	conn=null;
		
		//connection
		public static Connection getConnection() {
		if (conn==null)
		{			
			try {
				// 1- charger le pilote
				Class.forName(PILOTE);
				// 2- cr�er la connexion
				Connection conn = DriverManager.getConnection(URL, USER, PWD);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;	
		}
		
		//deconnection
		public static void	closeConnection()
		{
			if (conn!=null)
			{
				try {
				conn.close();
				conn = null;
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}	
}
