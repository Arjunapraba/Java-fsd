package assisted;

public class trycatch {
	public static void main(String[] args) {
		int a=10;
		int ans;
		try {
			ans=a/0;
			System.out.println("The sum is: ");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception occured");
			System.out.println(e);
		}
		catch(Exception ae) {
			System.out.println("Iam before subclass exception");
		}
		finally {
			ans=2*a;
			System.out.println("The answer is "+ans);
		}
	}

}
