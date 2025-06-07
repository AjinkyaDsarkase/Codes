class SuperClass{
	 SuperClass(){
		System.out.println("This is super class");
	}
}
class SubClass extends SuperClass{
	 SubClass(){
		System.out.println("This is sub class");
	}
}

public class ExampleInheritance{
	public static void main(String[] args){
		//SuperClass sp = new SuperClass();
		SubClass sb = new SubClass();
	}
}