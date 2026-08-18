import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        //Q1
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int num1 = s.nextInt();
        System.out.println("enter the Second number: ");
        int num2 = s.nextInt();
        System.out.println("enter the third number: ");
        int num3 = s.nextInt();
        int smallest = Smallest(num1, num2, num3);
        System.out.println("The smallest number is " + smallest);
        //Q2
        System.out.println("Enter a number to check: ");
        int number = s.nextInt();
        check(number);
        //Q3
        System.out.println("enter a password: ");
        String password = s.next();
        checkPassword(password);
    }
    //method Q1:
    public static int Smallest(int num1, int num2, int num3) {
        int min = num1;
        if (num2< min) {
            min =num1;
        }if (num3 < min) {
            min =num2;
        }
        return min;
    }
    //method Q2:
    public static void check(int num) {
        if (num > 0) {
            System.out.println(num + " is pos");
        } else if (num < 0) {
            System.out.println(num + " is neg");
        } else {
            System.out.println(num + " is zero");
        }
    }
    //methode Q3:
    public static void checkPassword(String password) {
        if (password.length() < 8) {
            System.out.println("password must be more than 8");
            return;
        }
        int Count = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                System.out.println("A password consists only letters and digits.");
                return;
            }
            if (Character.isDigit(c)) {
                Count++;
            }
        }
        if (Count < 2) {
            System.out.println("A password must contain at least two digits.");
            return;
        }
        System.out.println("Password is good:" + password);
    }
}
