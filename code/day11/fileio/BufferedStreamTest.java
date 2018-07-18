package fileio;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
	public static void main(String[] args) {
		BufferedOutputStream bo = null;
		try {
			FileOutputStream fo = new FileOutputStream("myfile.txt");
			bo = new BufferedOutputStream(fo);
			
			for(int i=65;i<123;i++)
				bo.write(i);
			bo.flush();		// 버퍼 비워줘야 함
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bo!=null)
					bo.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
