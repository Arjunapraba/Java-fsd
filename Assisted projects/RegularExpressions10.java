package assisted;
import java.util.regex.*;

public class RegularExpressions10 {

	public static void main(String[] args) {
		String a="Java";
		String b="Java";
		
		Pattern p=Pattern.compile(a);
		Matcher m=p.matcher(b);
		
		boolean result=m.matches();
		
		System.out.println(result);

	}

}
