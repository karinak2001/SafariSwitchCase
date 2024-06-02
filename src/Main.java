import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time you want to visit the Safari: ");
        int hour = scanner.nextInt();

        switch (hour){
            case 10: System.out.println("You got 10 hours left until the Safari closes");
            break;
            case 11: System.out.println("You got 9 hours left until the Safari closes");
            break;
            case 12: System.out.println("You got 8 hours left until the Safari closes");
            break;
            case 13: System.out.println("You got 7 hours left until the Safari closes");
            break;
            case 14: System.out.println("You got 6 hours left until the Safari closes");
            break;
            case 15: System.out.println("You got 5 hours left until the Safari closes");
            break;
            case 16: System.out.println("You got 4 hours left until the Safari closes");
            break;
            case 17: System.out.println("You got 3 hours left until the Safari closes");
            break;
            case 18: System.out.println("You got 2 hours left until the Safari closes");
            break;
            case 19: System.out.println("You got 1 hours left until the Safari closes");
            break;
            case 20: System.out.println("The Safari is closing now! ");
            break;
            default:
                System.out.println("The Safari is closed! ");
        }
    }
}