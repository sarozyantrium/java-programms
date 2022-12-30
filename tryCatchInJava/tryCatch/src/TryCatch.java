import java.util.Scanner;

public class TryCatch {
    // ? creating function name checkAge()
    static void checkAge(int age) {
        // ANCHOR - throw is used to create custom exception
        if (age <= 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        checkAge(age);
    }
}
