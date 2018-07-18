package fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest2 {
	public static void main(String[] args) {
		BufferedInputStream in= null;
		BufferedOutputStream out = null;
		try {
			 int c;
			 out= new BufferedOutputStream(new FileOutputStream("data.txt"));
			 for(int i=0;i<9000;i++)
				 out.write(i);
			 out.flush();		// 주석처리하면 255까지 출력
			 // 8192byte
			 in=new BufferedInputStream(new FileInputStream("data.txt"));
			 while((c=in.read())!=-1) {
				 System.out.println(c+" ");
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(in!=null)
				try {
					in.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			if(out!=null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
