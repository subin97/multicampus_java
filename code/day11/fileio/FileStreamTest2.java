package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStreamTest2 {
//	파일 읽기
//	1. 목적지를 정해주면서 FileInputStream 객체 생성
//	2. read() 메소드를 통해 데이터를 읽음
//	3. stream을 닫아줌
	public static void main(String[] args) {
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("myfile.txt");
			int data;
			while((data = fi.read()) != -1)
				System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fi != null)
					fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
