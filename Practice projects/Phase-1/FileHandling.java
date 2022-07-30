package practice;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
public class FileHandling {
	public static void main(String[] args) throws IOException{
		
		DataInputStream d=new DataInputStream(System.in);
		
		FileOutputStream fi = new FileOutputStream("rainy.txt",true);
		BufferedOutputStream bi = new BufferedOutputStream(fi);
		
		FileOutputStream fo = new FileOutputStream("season.txt");
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		char c;
		while ((c=(char)d.read())!='@'){
			
			fi.write(c);
		}
		
		FileInputStream f = new FileInputStream("rainy.txt");
		
		int s;
		
		while((s=(int)f.read())!=-1)
		{
			fo.write((char)s);
			System.out.print((char)s);
		}
		
	}
}

