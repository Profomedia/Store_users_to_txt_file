import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import tools.*;
import tools.Personal.Gender;
import tools.Personal.Status;

public class App {
    public static void main(String[] args) throws Exception {
        String firstname = "";
        String lastname = "";
        String email = "";
        String password = "";
        String jobField = "";
        String contact = "";
        double height = 0;
        // gender var

        Introduce.introduce();

        // initialize the user input -------------------------------------
        System.out.print("To proceed, please enter your first name: ");
        Scanner f_name = new Scanner(System.in);
        firstname = cap(f_name.nextLine());
        f_name.close();

        Personal person = new Personal(firstname, lastname, email, contact, height, password, jobField,
                Status.SINGLE,
                Gender.MALE);

        System.out.println(person);
    }

    public static Function<String, String> greet = greetings -> greetings;

    // capitalize and check for empty string =======
    public static String cap(String val) {
        String firstLetter = "", strNoHead = "";

        emptyChecker(val);
        // sc.close();

        while (val.length() < 2) {
            System.out.print("Input length cannot be less than 2: ");
            Scanner scr = new Scanner(System.in);
            val = scr.next();

            emptyChecker(val);
        }
        if (val.length() > 1) {

            // extract the first letter and convert to uppercase
            firstLetter = val.substring(0, 1).toUpperCase();

            // returns the 2 char to last chars of the string;
            strNoHead = val.substring(1, val.length()).toLowerCase();
        }

        return (firstLetter + strNoHead);

    }

    //empty value checker
    public static String emptyChecker(String value) {
        while (value.isEmpty()) {
            System.out.print("The input cannot be empty: ");
            Scanner sc = new Scanner(System.in);
            value = sc.nextLine();
        }
        return value;
    }

}
