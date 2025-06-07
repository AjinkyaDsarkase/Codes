


public class EnumExample
{
	enum Gender{
		MALE,
		FEMALE,
		OTHER
}
	
	public static void main(String[] args)
	{
		Gender g1 = Gender.MALE;
		
		switch(g1){
			case MALE:
				System.out.println("Gender is male");
				break;
			case FEMALE:
				System.out.println("Gender is female");
				break;
			case OTHER:
				System.out.println("Gender is other");
				break;
		}
	}
}