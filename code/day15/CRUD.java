package day15;

import dbConn.util.*;

import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.Scanner;

public class CRUD {
	static Scanner sc= new Scanner(System.in);
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	public Connection conn = null;

	public void connect() throws SQLException {
		conn = ConnectionHelper.getConnection("oracle");
	}
	public void create() throws SQLException, UnsupportedEncodingException {
		//insert
		System.out.print("gno: ");
		int gno = Integer.parseInt(sc.nextLine());
		System.out.print("gname: ");
		String gname = sc.nextLine();
		System.out.print("g_start: ");
		int g_start = Integer.parseInt(sc.nextLine());
		System.out.print("g_end: ");
		int g_end = Integer.parseInt(sc.nextLine());

		sql = "INSERT INTO GIFT VALUES(?, ?, ?, ?)";

		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, gno);
		pstmt.setString(2, new String(gname.getBytes("UTF-8"),"UTF-8"));
		pstmt.setInt(3, g_start);
		pstmt.setInt(4, g_end);
		pstmt.executeUpdate();
		System.out.println("성공적으로 데이터가 추가되었습니다.");
	}
	public void read() {
		//select all
		try {
			sql="select * from gift";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("상품번호\t상품명\t최저가\t최고가");
			while(rs.next()) {
				System.out.println(rs.getInt(1)
						+"\t"+rs.getString(2)
						+"\t"+rs.getInt(3)
						+"\t"+rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void update() throws SQLException, UnsupportedEncodingException {
		//update
		System.out.print("gno: ");
		int gno = Integer.parseInt(sc.nextLine());
		System.out.print("gname: ");
		String gname = sc.nextLine();
		System.out.print("g_start: ");
		int g_start = Integer.parseInt(sc.nextLine());
		System.out.print("g_end: ");
		int g_end = Integer.parseInt(sc.nextLine());

		sql = "UPDATE GIFT SET gname=?, g_start=?, g_end=? where gno="+gno;

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, new String(gname.getBytes("UTF-8"),"UTF-8"));
		pstmt.setInt(2, g_start);
		pstmt.setInt(3, g_end);
		pstmt.executeUpdate();
		System.out.println("성공적으로 데이터가 수정되었습니다.");
	}
	public void delete() throws SQLException {
		//delete
		System.out.print("gno: ");
		int gno = Integer.parseInt(sc.nextLine());

		sql = "delete gift where gno="+gno;
		pstmt = conn.prepareStatement(sql);
//		pstmt.setInt(1, gno);
		pstmt.executeUpdate();
		System.out.println("성공적으로 데이터가 삭제되었습니다.");
	}
}
