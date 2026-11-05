import java.util.Scanner;

class BankAccount {
    double balance;

    // TODO A1: Add a constructor that sets balance
BankAccount(double balance){
    this.balance = balance;
}
    // TODO A2: Add a method withdraw (double amount)
    //   - If amount <= balance: subtract and print
    //       "Withdrew $<amount>. Balance = $<balance>"
    //   - Else: print "Not enough funds!"
    //
    // I added a deposit method, aswell as a welcome method to add more user interaction
    //

    void welcome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nHello, would you like to make a Deposit or Withdrawal?" +
                "\nEnter 1 for Deposit" +
                "\nEnter 2 for Withdrawal");
        int enter = sc.nextInt();
        if(enter == 1){
            deposit();
        }
        if(enter == 2){
            withdraw();
        }
//        else welcome();


    }

    void deposit(){
        // TODO C1: Ask for amount to deposit (0 to exit)
        // TODO C2: While amount != 0
        //   - Call deposit(amount)
        //   - Ask for next amount
        // After loop ends:
        //   Print "Goodbye!"

        Scanner sc = new Scanner(System.in);
        double amount;
        double totalDeposit = 0;
        System.out.print("Please enter deposit amount: $");
        amount = sc.nextDouble();
        while(amount != 0) {
            balance += amount;
            totalDeposit += amount;
            System.out.print("Enter 0 to skip" + "\nPlease enter next deposit amount: $");
            amount = sc.nextDouble();
        }

        System.out.println("\nDeposited: $" + totalDeposit +
                "\nNew balance: $" + balance);

        //askFinished();
    }

    void withdraw(){
    Scanner sc = new Scanner(System.in);
    double amount;
    double totalWithdraw = 0;
        // TODO C1: Ask for amount to withdraw (0 to exit)
        System.out.print("Please enter withdraw amount: $");
        amount = sc.nextDouble();
        while(amount != 0) {
            if (amount <= balance) {
                balance -= amount;
                totalWithdraw += amount;
                System.out.print("Enter 0 to skip" +"\nPlease enter next withdraw amount: $");
                amount = sc.nextDouble();
            } else System.out.println("Not enough funds to withdraw: $" + amount);

            // TODO C2: While amount != 0
            //   - Call withdraw(amount)
            //   - Ask for next amount
            // After loop ends:
            //   Print "Goodbye!"
        }
        System.out.println("Withdrew: $" + totalWithdraw +
                "\nNew balance: $" + balance);

        //askFinished();
    }

   /* void askFinished(){
    Scanner sc = new Scanner(System.in);
        System.out.println("\nAre you finished?" +
                "\nEnter 1 for Yes" +
                "\nEnter 2 for No ");

        int enter = sc.nextInt();
        if(enter == 2){
            welcome();
        }
        else{
            System.out.println("Goodbye");

        }
    }*/

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO B1: Ask user for starting balance
        System.out.print("Please enter starting balance: $");
        double startingBalance = sc.nextDouble();
        // TODO B2: Create a BankAccount object
        BankAccount b1 = new BankAccount(startingBalance);
        b1.welcome();


       // canner sc = new Scanner(System.in);
        System.out.println("\nAre you finished?" +
                "\nEnter 1 for Yes" +
                "\nEnter 2 for No ");
        int enter = sc.nextInt();
        while(enter == 2) {
            b1.welcome();
            System.out.println("\nAre you finished?" +
                    "\nEnter 1 for Yes" +
                    "\nEnter 2 for No ");
            enter = sc.nextInt();

        }
        System.out.println("Goodbye");





    }
}