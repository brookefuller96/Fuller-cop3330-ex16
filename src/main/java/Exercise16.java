import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;

public class Exercise16 {
    public static void main(String[] args) {
        System.out.println("What is your age? ");
        Scanner input = new Scanner(in);
        String age = input.nextLine();
        int age1 = Integer.parseInt(age);
        if (age1 <= 15)
        {
            System.out.println("You are not old enough to legally drive.");
        }
        else
        {
            System.out.println("You are old enough to legally drive.");
        }
    }
}