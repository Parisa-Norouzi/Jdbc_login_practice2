import java.util.Scanner;

public class Menu {
    private final Scanner scanner=new Scanner(System.in);
    private final UserService userService=new UserService();
    public void  publicMenu(){

        System.out.println("*****welcome*******");
        System.out.println("1-sign up");
        System.out.println("2-sign in");
        System.out.println("3-exist");
        int number =scanner.nextInt();
        scanner.nextLine();
        switch (number){
            case 1 -> signUp();
            case 2-> System.out.println("signUp");
            case 3 -> System.out.println("exist");
        }
    }
    public void signUp(){
        userService.singUp();
    }
}
