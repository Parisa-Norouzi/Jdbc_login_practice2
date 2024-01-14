import java.util.Scanner;

public class UserService {
    private final Scanner scanner=new Scanner(System.in);
    public void singUp(){
        System.out.println("Please enter your id: ");
        String id=scanner.nextLine();
        System.out.println("Please enter your firstname: ");
        String firstname=scanner.nextLine();
        System.out.println("Please enter your lastname: ");
        String lastname=scanner.nextLine();
        System.out.println("Please enter your userName: ");
        String userName=scanner.nextLine();
        System.out.println("Please enter your passWord: ");
        String Password=scanner.nextLine();
        Users users=new Users();
        System.out.println(users);
    }
}
