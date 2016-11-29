import java.io.*;

public class CopyByteFile{
	public static void main(String[] args){
		FileInputStream in = null;
		FileOutputStream out = null;
		try{
			in = new FileInputStream("2013041900260386c.jpg");
			out = new FileOutputStream("xya.jpg");

			int d;
			int i = 0;
			 while((d = in.read())!= -1){
			 	i++;
				out.write(d);
				System.out.println(d);
				System.out.println(i+"回目");
			}

			System.out.println("コピー終了");

		}catch(IOException e){
			System.out.println("IOえらーです");

		}finally{
			try{
				in.close();
				out.close();
			}catch(IOException e){
				System.out.println("IOえらーです");
			}
		}
	}
}