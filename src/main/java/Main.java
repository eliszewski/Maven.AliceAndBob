/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner enterName = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = enterName.nextLine();
        if(userName.equals("Alice") || userName.equals("Bob")){
            System.out.println("Greetings " + userName);
        }else{
            System.out.println("You are not Alice or Bob!");
        }

    }
}
