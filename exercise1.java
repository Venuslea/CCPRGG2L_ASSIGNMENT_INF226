import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student Email: ");
        String studentemail = scan.nextLine();
        
        System.out.print("Enter Cellphone Number: ");
        CharSequence cellphoneNum = scan.nextLine();
        System.out.print("Enter Birthday: ");
        String birthday = scan.nextLine();
        // Long method
        Pattern pattern = Pattern.compile("\\w[a-z]+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentemail);
        boolean match = matcher.matches();
        if (match) {
            System.out.println("valid studentemail");
        } else {
            System.out.println("invalid studentemail");
        }
        // Short method
        match = Pattern.compile("\\+63\\d{10}").matcher(cellphoneNum).matches();
        if (match) {
            System.out.println("valid cellphoneNum");
        } else {
            System.out.println("invalid cellphoneNum");
        }
        
        
        // Even shorter method
        match = Pattern.matches("\\d{4}-\\d{2}-\\d{2}",birthday);
        if (match) {
            System.out.println("valid birthday");
        } else {
            System.out.println("invalid birthday");
        }
        
    }
}