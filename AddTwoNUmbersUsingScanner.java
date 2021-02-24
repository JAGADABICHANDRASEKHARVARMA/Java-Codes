/*In the below program by using Scanner it will capture the input values at the end. we can give what ever values after running the code.*/


import java.util.Scanner;

public class AddTwoNumber 
{
    public static void main(String[] args)
    {

        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        num2 = sc.nextInt();

        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of two number is: " + sum);

    }
}
