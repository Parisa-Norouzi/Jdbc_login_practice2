import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner=new Scanner(System.in);
    private final UserService userService=new UserService();

    public Menu() throws SQLException {
    }

    public void  publicMenu() throws SQLException {

        System.out.println("*****welcome*******");
        System.out.println("1-sign up");
        System.out.println("2-sign in");
        System.out.println("3-exist");
        int number =scanner.nextInt();
        scanner.nextLine();
        switch (number){
            case 1 -> signUp();
            case 2-> signIn();
            case 3 -> System.out.println("exist");
        }
    }

    private void signIn() throws SQLException {
        userService.singIn();
    }

    public void signUp() throws SQLException {
        userService.singUp();
    }
}
