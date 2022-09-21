package Assigment_4;
import java.io.*;
import java.util.Scanner;

public class Str {

    public static String
    removeConsecutiveDuplicates(String input)
    {
        if (input.length() <= 1)
            return input;
        if (input.charAt(0) == input.charAt(1))
            return removeConsecutiveDuplicates(
                input.substring(2));
        else
            return input.charAt(0)
                + removeConsecutiveDuplicates(
                       input.substring(1));
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the String ");
        String S1 = sc.next();
        System.out.println(removeConsecutiveDuplicates(S1));
 
        
    }
}

