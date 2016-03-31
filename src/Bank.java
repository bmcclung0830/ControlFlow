import java.util.Scanner;

public class Bank {

    public static void main(String[] args)  throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        if (name.length() >= 1 ){
            System.out.println("WELCOME!!!!" + name);
        } else {
            throw new Exception("Please enter your name");
        }

        System.out.println("What would you like to do? [Check Balance/Withdraw Funds/Cancel");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Check Balance")) {
            System.out.println("Your balance is $100");
        }
        else if (answer.equalsIgnoreCase("Cancel")){
            System.out.println("Thank you, please come again");
        }
        else if (answer.equalsIgnoreCase("Withdraw Funds")) {
            System.out.println("How much money would you like to withdraw?");
            int withdraw = scanner.nextInt();
            if (withdraw > 100) {
                throw new Exception("Invalid amount, exceeds ATM maximum limit. Please enter new amount");
            }
            else if (withdraw < 0) {
                throw new Exception("Invalid amount, less than ATM minimum. Please enter new amount");
            }
            else {
                System.out.println("Thank you, please take your money");
            }
        }





    }

}
