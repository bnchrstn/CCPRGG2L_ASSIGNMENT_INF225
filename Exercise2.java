import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
       
        test("Driving");
        scan.close();
    }

    static void test(String drive) {

        System.out.println("Driving Test!");
        driving(drive);

        String feedback = getFeedBack(drive);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            reTrain(drive);

            // Recursive call
            test(drive);
        } else if (feedback.equals("yes")) {
            gtg(drive);
        }
    }

    static void driving(String drive) {
        System.out.println("Driving School");
    }

    static String getFeedBack(String drive) {
        System.out.println("Do i pass the " + drive + " training? (Enter \"yes\" or \"no\")");
        String feedback = scan.next();
        return feedback;
    }

    static void reTrain(String drive) {
        System.out.print("what do you lack in training: ");
        scan.nextLine();
        String need = scan.nextLine();
        System.out.println("You need to: " + need + " more");
    }

    static void gtg(String drive) {
        System.out.println("You passed the " + drive + " test");


    }
}

