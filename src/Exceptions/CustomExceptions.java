package Exceptions;

import java.util.Scanner;

public class CustomExceptions {

    public static void main(String[] args) throws AgeLessThanZeroException {
        System.out.println("Start Creating Custom Exceptions");
        Scanner sc = new Scanner(System.in);
        if(CustomExceptions.ageValidator(sc.nextInt()))
        {
            System.out.println("Age is Positive");
        }

    }


    private static boolean ageValidator(int age) throws AgeLessThanZeroException {
        System.out.println("The age received is: "  + age);
        if(age < 0)
        {
            throw new AgeLessThanZeroException("The number " + age + " is less than zero bruH!");
        }
        return true;
    }
}
