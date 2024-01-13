import java.util.Scanner;

public class Menu {
    private final Scanner scanner=new Scanner(System.in);
    public void  publicMenu(){

        System.out.println("*****welcome*******");
        System.out.println("1-sign up");
        System.out.println("1-sign in");
        System.out.println("1-exist");
        int number =scanner.nextInt();
        scanner.nextLine();
        System.out.println("number is "+number);
    }
}
