import java.util.Scanner;
public class inputData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = input.nextLine();
        System.out.print("Enter Your Surname:");
        String surname = input.nextLine();
        System.out.print("Enter Your Nickname:");
        String nickname = input.nextLine();
        System.out.print("Enter Your Major:");
        String major = input.nextLine();
        System.out.print("Enter Your Student ID:");
        int ID = input.nextInt();
        input.close();
        System.out.println("______________");
        System.out.println("Your Name is"+name);
        System.out.println("Your Surname is" +surname);
        System.out.println("Your Nickname is" + nickname);
        System.out.println("Your Major"+major);
        System.out.println("Your Student ID" + ID);
    }
}
