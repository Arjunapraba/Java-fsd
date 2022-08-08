package project;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Files{
public static void main(String[] args) throws IOException {
	
Virtualrepository v = new Virtualrepository();
Scanner scn = new Scanner(System.in);

outer:
	while(true)
	{
		System.out.println("\nChoose an Option \n(1)Arrange files in ascending order"
				+ "\n(2)Operations on the File inside our created folder"
				+ "\n(3)Close the appliciation");
		int a=scn.nextInt();
		switch(a)
		{
		case 1:	sort();
				System.out.println(" Files are sorted in ascending order");
				break;
		case 2:	v.operation();
				System.out.println("Return to Mainmenu");
				break;
		case 3: break outer;
		}
	}
System.out.println("End of  the Page");
	}

	private static void sort() {
		String path="D:\\Myfile\\";
		File d=new File(path);
		File filenames[]=d.listFiles();
		for(File ff:filenames) {
			System.out.println(d.getName());
		}
	}  }


