
package regex.act.pkg2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexAct2 {

    public static void main(String[] args) {
        
        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter cellphone number: ");
        String studentNum = scan.nextLine();

        // Long method 
        Pattern pattern = Pattern.compile("09+\\d{9}");
        Matcher matcher = pattern.matcher(studentNum);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("Valid cellphone number");
        } else {
            System.out.println("Invalid cellphone number");
        }
        
    }
    
}
