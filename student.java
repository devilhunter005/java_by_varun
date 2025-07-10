import java.util.Scanner;
public class student
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Roll:");
        int roll =  input.nextInt();
        input.nextLine();

        System.out.print("Enter your Name:");
        String name = input.nextLine();
        
        System.out.print("Enter your Branch:");
        String branch = input.nextLine();

         System.out.println("Roll:"+roll);
        System.out.println("Name:"+name);
        System.out.println("Branch:"+branch);
        

    }
}