import java.util.Scanner;
class BAccount
{
double balance;
public BAccount(double initialBalance)
{
this.balance = initialBalance;
}
public double getBalance() 
{
return balance;
}
public void deposit(double amount)
{
if (amount > 0) 
{
    balance += amount;
    System.out.println("Deposit successful \nNew balance: Rs." + balance);
}
else
{
    System.out.println("Invalid deposit amount.");
}
}
public void withdraw(double amount) {
if (amount > 0 && amount <= balance) 
{
  balance -= amount;
  System.out.println("Withdrawal successful \nNew balance: Rs." + balance);
} else 
{
  System.out.println("Insufficient Balance");
}
}
}
class ATM
{
private BAccount userAccount;

public ATM(BAccount account) 
{
  this.userAccount = account;
}
public void displayMenu() 
{
   System.out.println("\nATM Menu:");
   System.out.println("1. Check Balance");
   System.out.println("2. Deposit");
   System.out.println("3. Withdraw");
   System.out.println("4. Exit");
}
public void choose(int option) 
{
Scanner sca = new Scanner(System.in);
switch (option) 
{
case 1:
  System.out.println("Your balance: Rs." + userAccount.getBalance());
  break;
case 2:
  System.out.print("Enter deposit amount: Rs.");
  double da = sca.nextDouble();
  userAccount.deposit(da);
  break;
case 3:
  System.out.print("Enter withdrawal amount: RS.");
  double wa = sca.nextDouble();
  userAccount.withdraw(wa);
  break;
case 4:
  System.out.println("Thank you for using the ATM!");
  break;
default:
  System.out.println("Invalid option.");
}
}
}
public class Main
{
  public static void main(String[] args)
{
  BAccount acc= new BAccount(1000);
  ATM atm = new ATM(acc);
  Scanner sc = new Scanner(System.in);
  int choice;
  do 
  {
   atm.displayMenu();
   System.out.print("Enter your choice (1-4): ");
   choice = sc.nextInt();
   atm.choose(choice);
   } 
while (choice != 4);
}
}





















































































































































































































































































































