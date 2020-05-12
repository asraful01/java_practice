package Account;

import java.util.Scanner;

public class accountTest {

	public static void main(String[]args) {
		
		Account acc1=new Account(50.00);
		Account acc2=new Account(-2.00);
		
		System.out.printf("Account1 balance is: $%.2f\n", acc1.getBalance());
		System.out.printf("Account2 balance is: $%.2f\n", acc2.getBalance());
		Scanner input=new Scanner(System.in);
		
		double depositeAmount;//deposite amount read from user
		double withdraw;
		
		//Account 1:
		System.out.print("Enter deposite amount for Account1:");
		depositeAmount=input.nextDouble();
		System.out.printf("\nadding %.2f to account1 balance\n\n",depositeAmount);
		acc1.credit(depositeAmount);
		System.out.printf("Account1 balance: $%.2f\n",acc1.getBalance());
		System.out.printf("Account2 balance: $%.2f\n",acc2.getBalance());
		
		
		//Account 2
		System.out.print("Enter deposite amount for Account2:");
		depositeAmount=input.nextDouble();
		System.out.printf("\nadding %.2f to account2 balance\n\n",depositeAmount);
		acc2.credit(depositeAmount);
		System.out.print("Withdraw amount from account1:");
		withdraw=input.nextDouble();
		acc1.debit(withdraw);
		System.out.printf("Account1 balance: $%.2f\n",acc1.getBalance());
		System.out.printf("Account2 balance: $%.2f\n",acc2.getBalance());
		
		System.out.print("Withdraw amount account2:");
		withdraw=input.nextDouble();
		acc2.debit(withdraw);
		
		System.out.printf("Account1 balance is: $%.2f\n", acc1.getBalance());
		System.out.printf("Account2 balance is: $%.2f\n", acc2.getBalance());
		
		
	}
}
