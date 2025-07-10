
import java.util.Scanner;

class iPrint
{
	public int number;
	public void display() 
	{
		System.out.println("number = "+number);
	}
}

public class Democlass 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		iPrint obj1=new iPrint();
		System.out.print("Enter a number:");
		int a= input.nextInt();
		obj1.number=a;
		obj1.display();
		obj1.number = 400;
		obj1.display();
	}
}
