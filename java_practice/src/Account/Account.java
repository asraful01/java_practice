package Account;

import java.util.Scanner;

public class Account {

	private double balance;
	
		public Account(double initialBalance) {//constructor
			if(initialBalance>0) {
				balance=initialBalance;
			}
			}
			
			public void credit(double c) {
				balance +=c;
				
			}
			public void debit(double d) {
				if(d >balance) {
					System.out.print("Debit amount exceeded acocunt balance\n");
				}
				else {
				balance -=d;
				}
			}
			
			public double getBalance() {
				return balance;
			}
			
			
			
		}
	

