import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your age");
        int age = input.nextInt();

        System.out.println("your max heart rate should be " + (220-age) + " beats per minute");
        System.out.println("your target HR zone is " + (220-age)/2 + " - " + Math.round((220-age)*0.85) + " beats per minute");
    }
}
