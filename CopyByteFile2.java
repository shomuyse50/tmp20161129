import java.io.*;

public class CopyByteFile2{
	public static void main(String[] args){
		FileInputStream in = null;
		FileInputStream2 in2 = null;
		FileOutputStream out = null;
		try{
			in = new FileInputStream("2013041900260386c.jpg");
			in2 = new FileInputStream("20130419002624ef7.jpg");
			out = new FileOutputStream("xya.jpg");

			int d;
			int i =0;
			if(i<258769/2){
			 while((d = in.read())!= -1){
			 	i++;
				out.write(d);
				//System.out.println(d);
			}else{
			((d = in2.read())!= -1){
				out.write(d);
			}

			System.out.println("コピー終了");

		}catch(IOException e){
			System.out.println("IOえらーです");
		}finally{
			try{
				in.close();
				in2.close();
				out.close();
			}catch(IOException e){
				System.out.println("IOえらーです");
			}
		}
	}
}