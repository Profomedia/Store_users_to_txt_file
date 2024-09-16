package tools;
import java.util.*;

public class EmptyChecker {
    
    public static String empty(String value, Scanner sc) {
        while (value.isEmpty()) {
            System.out.print("The input cannot be empty: ");
            sc = new Scanner(System.in);
            value = sc.nextLine();
        }
        return value;
    } 
}
