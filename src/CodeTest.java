import java.util.Scanner;

public class CodeTest
{
    public static void main(String[] args)
    {
        // Holds the sum of each character value from the input string.
        Integer nameSum = 0;

        // Instantiate the map of each alphabet upper case character and it's integer value.
        AlphaIntegerMap workMap = new AlphaIntegerMap();

        // Capture the input string
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        // Read user input and convert to uppercase.
        String userName = myObj.nextLine();

        // Parse string one char at a time
        for (int i = 0; i < userName.length(); i++)
        {
            nameSum += workMap.getCharValue(userName.charAt(i));
        }

        // Print out the result
        System.out.println("Username value: " + userName + " = " + nameSum);
    }
}



