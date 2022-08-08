package project;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Virtualrepository {

	public void operation() throws IOException
	{
		Scanner scn = new Scanner(System.in);
		outer:
		while(true)
		{	
			System.out.println("\nChoose an option\n(1)Add file"
					+ "\n(2)Delete File"
					+ "\n(3)Search a file"
					+ "\n(4)Return to  Main Menu");
			int b=scn.nextInt();
			switch(b)
			{
				case 1:	add(); 
						break;
				case 2:	delete();
						break;
				case 3:	search();
						break;
				case 4:	break outer;
			}
		
		}
		
	}

	private void search() {
		String path="D:\\Myfile\\";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the filename to search");
		String filename=s.next();
		File f=new File(path);
		int flag=0;
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			if(ff.getName().equals(filename)) {
				flag=1;
				break;
			}
			else 
				flag=0;
		}
		
		if(flag==1) 
			System.out.println("File found");
		
		else 
			System.out.println("File not found");	
	}

	private void delete() {
		String path="D:\\Myfile\\";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the filename");
		String filename=s.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		f.delete();
		System.out.println("file gets deleted");
	}

	private void add() throws IOException {
		String path="D:\\Myfile\\";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the filename");
		String fname=s.next();
		String fp=path+fname;
		File f=new File(fp);
		boolean b=f.createNewFile();
		if(b!=true) {
			System.out.println("File not created");
		}
		else {
			System.out.println("File created");
		}

	}}


