package stringhandling;

public class Example3 {
	public static void main(String[] args) {
		String s11= new String("Hello");
		String s12= new String("Hello");
		String s13= new String("Hi");
		
		System.out.println(s11.hashCode());
		System.out.println(s12.hashCode());
		System.out.println(s13.hashCode());
		
		System.out.println(" ------------------");
		
		System.out.println(s11==s12);
		System.out.println(s13==s12);
		
		System.out.println(" ------------------");
		
		String s1="Hello1";
		String s2="Hello1";
		String s3="Hi1";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println("------------------");
		
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		
		System.out.println(" ------------------");
		
		
	}

}