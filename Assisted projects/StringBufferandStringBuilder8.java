package assisted;

public class StringBufferandStringBuilder8 {

	public static void main(String[] args) {
		//stringbuffer
		System.out.println("StringBuffer");
		StringBuffer sb=new StringBuffer("Started Java");
		sb.append("Phase1");
		System.out.println(sb);
		sb.delete(2,5);
		System.out.println(sb);
		sb.replace(9,12,"Python");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.charAt(8));
		System.out.println("\n");
		
		System.out.println("StringBuilder");
		StringBuilder ss=new StringBuilder("I like java");
		ss.append(" programming");
		System.out.println(ss);
		System.out.println(ss.length());
		System.out.println(ss.charAt(5));
		System.out.println(ss.reverse());

	}
	}

