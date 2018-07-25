package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*DB���� ���� �ݺ������� �ڵ� �ذ�
	�ٸ� Ŭ�������� �Ʒ� �ڵ� ������ ���� �ʵ��� ����
	Class.forName("oracle.jdbc.OracleDriver");
	Connection conn = DriverManager.getConnection(url, uid, pwd);
	
	�̷������� ���
	ConnectionHelper.getConnetion("mysql") or ("oracle")
	dsn ==> data source name
*/

import java.sql.*;

public class ConnectionHelper {  // ����
	
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		
		try {
			if( dsn.equals("mysql") ) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(
								"jdbc:mysql://localhost:3306/sampleDB", 
								"kingsmile", 
								"mysql");
				
			}else if( dsn.equals("oracle") ) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(
								"jdbc:oracle:thin:@127.0.0.1:1521:XE", 
								"subin", 
								"011703");
			} // end if
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static Connection getConnection(String dsn, String userid, String pwd) {
		Connection conn = null;
		
		try {
			if( dsn.equals("mysql") ) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(
								"jdbc:mysql://localhost:3306/sampleDB", 
								userid, 
								pwd);
				
			}else if( dsn.equals("oracle") ) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(
								"jdbc:oracle:thin:@127.0.0.1:1521:XE", 
								userid, 
								pwd);
			} // end if
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
}














