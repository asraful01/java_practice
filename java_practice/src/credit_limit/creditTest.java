package credit_limit;

import java.util.Scanner;

public class creditTest {

	public static void main(String[] args)
    {
        credit calculator = new credit(0,0,0,0,0,0);

        Scanner input = new Scanner(System.in);

        int account = 1; //setting account to 1 here so it will be initialized in the while loop
        int balance;
        int items;
        int totalcred;
        int limit;
        int newbalance;

        while (calculator.setAccount(account) != 0) //As long as the account number is not set to 0 program will continue to loop
        {
            System.out.println("Enter the customers account number: ");
            account = input.nextInt();
            calculator.setAccount(account);    //prompts user for account number

            System.out.println("Enter the customers balance at the start of the month: ");
            balance = input.nextInt();
            calculator.setBalance(balance);  //prompts user for balance

            System.out.println("Enter the total amount of charges: ");
            items = input.nextInt();
            calculator.setItems(items);     //prompts user for total amount of charges

            System.out.println("Enter the total amount of credits: ");
            totalcred = input.nextInt();
            calculator.setTotalCredit(totalcred);   //prompts user for total credit

            System.out.println("Enter the credit limit: ");
            limit = input.nextInt();
            calculator.setCreditLimit(limit);   //prompts the user for credit limit

            System.out.println("The customers new balance is " + calculator.setNewBalance());   //prints the new balance

            if (calculator.setBalance(balance) > calculator.setCreditLimit(limit))
            {
                System.out.println("Credit Limit Exceeded");   //if balance is greater limit will print this
                break;    //stops loop
            }

        }
    }
}
