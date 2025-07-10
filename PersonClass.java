import java.util.Scanner;


class person
{
	public String name;
	public int age;
	
	public void getter() 
	{
		System.out.println("Name : "+name );
		System.out.println("Age : "+age );
	}
}


public class PersonClass 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		person obj1= new person();
		System.out.println("Enter the Name : " );
		String n = input.nextLine();
		System.out.println("Enter the age : " );
		int a = input.nextInt();
		obj1.name=n;
		obj1.age=a;
		obj1.getter();
	}
}
