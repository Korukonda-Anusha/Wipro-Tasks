package dayThree;

public class bankAccont {
		// TODO Auto-generated method stub
		private String accountHolder;
		private double balance;
		   
		public bankAccont(String string, int i) {
			// TODO Auto-generated constructor stub
		}
		public void BankAccont(String accountHolder, double initialBalance) {
		       this.accountHolder = accountHolder;
		       this.balance = initialBalance;
		   }
		   // Deposit method
		   public void deposit(double amount) {
		       balance += amount;
		       System.out.println(amount + " deposited. New Balance: " + balance);
		   }
		   // Withdraw method
		   public void withdraw(double amount) {
		       if (amount > balance) {
		           System.out.println("Insufficient balance.");
		       } else {
		           balance -= amount;
		           System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
		       }
		   }
		   // Display account details
		   public void displayDetails() {
		       System.out.println("Account Holder: " + accountHolder);
		       System.out.println("Balance: " + balance);
		   }
		

		
		}

	


