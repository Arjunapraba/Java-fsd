package project;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class MovieticketBooking {

	public static void main(String[] args) {
		HashSet<String> username=new HashSet<String>();
		HashSet<String> password=new HashSet<String>();
		username.add("Arjun");
		password.add("xyz123");
		String us="";
		String pw ="";
		String pc;
		Scanner scn = new Scanner(System.in);
		System.out.println("*****Welcome to PVR Cinemas*****");
		System.out.println("\nLogin to proceed");
		System.out.print("\nEnter the username: ");
		us=scn.next();
		System.out.print("\nEnter the Password: ");
		pw=scn.next();
		boolean check=password.contains(pw);
		if(check==true){
			System.out.println("\nYou have logged in");
			user();
			
		}
		else if(check!=true)
		{
			System.out.println("\nYou have entered the wrong password");
			changepassword();
			
		}
	}

		public static void user() {
			//four rows as linked list for 5AM-8AM show
			LinkedList<String> A = new LinkedList<String>();                  
			LinkedList<String> B = new LinkedList<String>();
			LinkedList<String> L = new LinkedList<String>();                  
			LinkedList<String> M = new LinkedList<String>();
			
			//four rows as linked list for 10AM-12PM show 
			LinkedList<String> C = new LinkedList<String>();
			LinkedList<String> D = new LinkedList<String>();
			LinkedList<String> X = new LinkedList<String>();                  
			LinkedList<String> Y = new LinkedList<String>();
			
			//four rows as linked list for 1PM-3PM show
			LinkedList<String> E = new LinkedList<String>();
			LinkedList<String> F = new LinkedList<String>();
			LinkedList<String> P = new LinkedList<String>();                  
			LinkedList<String> Q = new LinkedList<String>();
			
			//Initializing 10 seats per linkedlist so that it'll look like as of in a theatre
		    for(int i=1;i<=10;i++)
				{
		    	A.add("A"+i);
				B.add("B"+i);
				L.add("C"+i);
				M.add("D"+i);
				C.add("A"+i);
				D.add("B"+i);
				X.add("C"+i);
				Y.add("D"+i);
				E.add("A"+i);
				F.add("B"+i);
				P.add("C"+i);
				Q.add("D"+i);
				}
		    int flag=0;
		    Scanner sc=new Scanner(System.in);
		    while (flag==0){
		    System.out.println("\n*****Welcome to PVR Cinemas Ticket Booking*****");
		    System.out.println("\nCost for Each ticket is : Rs.180.00");
			System.out.println("\nSelect the Show Time: "+"\n(1) 5AM-8AM \n(2) 10AM-1PM "
					+ "\n(3) 2PM-4PM ");
			System.out.println("\nSelect the show you want enter (1/2/3)");
		
			    int t = sc.nextInt();
			    if(t==1){
			    	flag=1;
			    	System.out.println("You have selected the show time (1) 5AM-8AM ");
			    	showtimeselected(A,B,L,M,t);
			    	
			    }
			    else if(t==2)
			    {
			    	flag=1;
			    	System.out.println("You have selected the show time 10AM-1PM");
			    	showtimeselected(C,D,X,Y,t);
			    	
			    }
			    else if(t==3)
			    {
			    	flag=1;
			    	System.out.println("You have selected the show time 2PM-4PM");
			    	showtimeselected(E,F,P,Q,t);
			    }
			    else
			    {
			    	System.out.println("\nPlease Enter an Valid Show time");
			    }
		    }
			}

		private static void showtimeselected(LinkedList<String> A, LinkedList<String> B,LinkedList<String> C ,LinkedList<String> D , int t) {
		Scanner scn=new Scanner(System.in);
		int cost=180;
		LinkedList<String> getseat = new LinkedList<String>();	
		int n;
		String s;
		int bill;
		System.out.println("\nThe available seats are are shown Below:");
		System.out.println(" \n"+A+"\n"+B+"\n"+C+"\n"+D);
		System.out.println("\n*******************Screen**********************");
		System.out.println("\n\nEnter the no. of seats that you want to Book: ");
		n=scn.nextInt();
		for(int i=1;i<=n;i++){
		System.out.println("Enter the seat that you want to Book for "+i+"th member");
		s=scn.next();
		getseat.add(s);
		if(A.contains(s)|| B.contains(s)|| C.contains(s)|| D.contains(s) ){
			A.remove(s);
			B.remove(s);
			C.remove(s);
			D.remove(s);
		}
		else{
			System.out.println("Enter a vaild seat number");
			break;
		}
		}
		System.out.println("\n"+getseat+" are the seats you have selected");
		System.out.println("\nThese are the available seats after your Booking:"+" \n"+A+"\n"+B+"\n"+C+"\n"+D);
		System.out.println("\n*******************Screen**********************");
		String b;
		System.out.print("\nTo generate bill press (y/n): ");
		b=scn.next();
		switch(b)
		{
		case "y":
		{
			System.out.println("\n\nYour Bill is generated........");
			System.out.println("*******************************************");
			bill=cost*n;
			System.out.println("\n  *********PVR Cinemas**********");
			System.out.println("\n--Enjoy Once a lifetime Experience--");
			System.out.println("\n\nShowtiming: "+t);
			System.out.println("\n\nNumber of seats: "+n);
			System.out.println("\n\nCost per seat : Rs.180.00");
			System.out.println("\n\nSeats selected: "+getseat);
			System.out.println("\n\nAmount you have to pay: Rs."+bill+".00");
			java.util.Date date = new java.util.Date();   
			System.out.println("\nBilling Time and Date:"+"\n"+date);
			System.out.println("\n\n-----Thank you Visit again-----");
			System.out.println("\n*****************************************");
			break;
		}
		case  "n":
		{
			System.out.println("\nYou have cancelled the booking...");
			System.out.println("\nLogin again to continue.........");
			break;
		}
		default:
			break;
		
		}
		}

		static void changepassword() {
			Scanner sc = new Scanner(System.in);
			String g;
			System.out.print("\nDo you wish to change the password: (y/n)");
			g=sc.next();
			switch(g){
			case "y":
			{
				System.out.print("\nEnter the new password: ");
				String np;
				np=sc.next();
			  System.out.println("\nPassword has been changed"
			  		+ " \nLogin again to book tickets");
			}
			case "n":
				break;
			}
		    } }



	

	   
