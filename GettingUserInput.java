//Here we can give user input dynamically

import java.util.Scanner;

public class GettingUserInput
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();


        System.out.println("The name is " + firstName + " "+ lastName);

    }
}
