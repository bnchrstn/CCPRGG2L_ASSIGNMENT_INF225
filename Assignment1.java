package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email: ");
        String studentNum = scan.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-z]+@national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentNum);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("Valid student email");
        } else {
            System.out.println("Invalid student email");
        }
        
        System.out.print("Enter cellphone number: ");
        studentNum = scan.nextLine();

        pattern = Pattern.compile("09+\\d{9}");
        matcher = pattern.matcher(studentNum);

        match = matcher.matches();

        if (match) {
            System.out.println("Valid cellphone number");
        } else {
            System.out.println("Invalid cellphone number");
        }
 
    }
    
}
