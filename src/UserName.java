import java.util.Scanner;
public class UserName {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String user;

        System.out.println("What is your name?");
        user = input.nextLine();

        System.out.print("Hello " + user);

    }
}
