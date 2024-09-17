
import java.util.Scanner;
import java.util.function.Function;

import tools.*;
import tools.Personal.Gender;
import tools.Personal.Status;

public class App {
    public static void main(String[] args) throws Exception {
        String firstname = "";
        String lastname = "";
        String email = "";
        String jobField = "";
        String contact = "";
        double height = 0.1;
        String password = "";
        // gender var

        Introduce.introduce();

        // initialize the user input -------------------------------------
        // ================================================================
        System.out.print("To proceed, please enter your first name: ");
        Scanner f_name = new Scanner(System.in);
        firstname = cap(emptyChecker(f_name.nextLine()));
        // ================================================================

        System.out.print("Enter your last name: ");
        Scanner l_name = new Scanner(System.in);
        lastname = cap(emptyChecker(l_name.nextLine()));
        // ================================================================

        System.out.print("Enter your email address: ");
        Scanner emailID = new Scanner(System.in);
        email = emptyChecker(emailID.nextLine());
        // ================================================================

        System.out.print("Enter your field of specification: ");
        Scanner job = new Scanner(System.in);
        jobField = emptyChecker(job.nextLine());
        // ================================================================

        System.out.print("Enter your height: ");
        Scanner heightF = new Scanner(System.in);
        height = heightF.nextDouble();
        // ================================================================

        System.out.print("Enter your password: ");
        Scanner pwd = new Scanner(System.in);
        password = emptyChecker(pwd.nextLine());
        // ================================================================

        Personal person = new Personal(firstname, lastname, email, contact, height, password, jobField,
                Status.SINGLE,
                Gender.MALE);

        // close the scanners
        f_name.close(); l_name.close(); emailID.close(); heightF.close();job.close(); pwd.close();
        System.out.println(person);
    }

    public static Function<String, String> greet = greetings -> greetings;

    // capitalize and check for empty string =======
    public static String cap(String val) {
        String firstLetter = "", strNoHead = "";
        if (val.length() > 1) {
            // extract the first letter and convert to uppercase
            firstLetter = val.substring(0, 1).toUpperCase();

            // returns the 2 char to last chars of the string;
            strNoHead = val.substring(1, val.length()).toLowerCase();
        }

        return (firstLetter + strNoHead);

    }

    // empty value checker
    public static String emptyChecker(String value) {

        // check if value is empty
        if (value.isEmpty())
            while (value.isEmpty()) {
                System.out.print("The input cannot be empty: ");
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                value = sc.nextLine();
            }
            if (value.length() < 2){
                // check value length
                while (value.length() < 2) {
                    System.out.print("Input length cannot be less than 2: ");
                    @SuppressWarnings("resource")
                    Scanner scr = new Scanner(System.in);
                    value = scr.nextLine();
                    
                    //  check if value is empty
                    if (value.isEmpty())
                        while (value.isEmpty()) {
                            System.out.print("The input cannot be empty: ");
                            @SuppressWarnings("resource")
                            Scanner sc = new Scanner(System.in);
                            value = sc.nextLine();
                    }
                }
            }
        return value;
    }

}
