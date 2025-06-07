public class Exmp{
	public static void main(String[] args){
	String s1 = "arjun";
	System.out.println(s1.length());
	System.out.println("Hello");
	}
}

/**public class Exmp{
	public static void main(String[] args){
		/**int a,b,c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = a + b ;
		System.out.println("Addition = "+c);**/
		int sum = 0, len;
		len = args.length;
		for(int i = 0; i < len; i++){
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("Addition = "+sum);
	}
}**/