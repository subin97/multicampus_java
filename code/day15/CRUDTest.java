package day15;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUDTest {
	public static void main(String[] args) throws UnsupportedEncodingException, SQLException {
		// 메뉴생성
		Scanner sc = new Scanner(System.in);
		CRUD crud = new CRUD();
		crud.connect();
		int menu = 0;
		while(true) {
			System.out.println("#### JDBC Query ####");
			System.out.println("1. 전체보기");
			System.out.println("2. 레코드 삽입");
			System.out.println("3. 레코드 수정");
			System.out.println("4. 레코드 삭제");
			System.out.println("5. 프로그램 종료");

			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:
				crud.read();
				break;
			case 2:
				crud.create();
				break;
			case 3:
				crud.update();
				break;
			case 4:
				crud.delete();
				break;
			case 5:
				System.exit(0);
			}
		}
	}
}
