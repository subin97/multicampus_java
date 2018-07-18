package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
	public static void main(String[] args) {
//		특정 파일에 데이터 쓰기
//		1. FileOutputStream 객체 생성
//		목적지가 파일인 OutputStream 객체를 생성
//		그녀석은 FileOutputStream 객체를 생성
//		목적지는 생성자에서 정해줄거임
//		2. 출력하고자 하는 데이터를 (바이트배열로) 준비
//		3. write 메소드를 통해서 데이터를 출력
//		4. Stream을 닫아주기
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream("myfile.txt");
			for(int i=65;i<123;i++) {	// ascii code
				fo.write(i);	// IOException 생성 -> 일반적으로 catch문 하나 더 씀
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fo != null)	// 객체 생성하다가 죽었을 경우
					fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
		
		
	}
}
