# CISC-190-Practice-REPO
Practice REP for CISC190 class in SD MiraMar College

# Lab: Simple ATM
This simple ATM simulates  user inputs to withdraw / deposit amount inside of the output. Throughout use the code with ask if the user is done or would like to continue to withdraw / deposit. 

## How to Run
1. Open the program in your IDE. Worked on InteliJ.
2. Enter Starting Blanace
3. Enter **1** or to Deposit or **2** to Withdraw

## Example Output
```text
Please enter starting balance: $100

Hello, would you like to make a Deposit or Withdrawal?\
Enter 1 for Deposit\
Enter 2 for Withdrawal\
1\
Please enter deposit amount: $200\
Enter 0 to skip\
Please enter next deposit amount: $0

Deposited: $200.0\
New balance: $300.0

Are you finished?\
Enter 1 for Yes\
Enter 2 for No \
1\
Goodbye
```

## Starter Code from CISC190
```java
import java.util.Scanner;

class BankAccount {
    double balance;

    // TODO A1: Add a constructor that sets balance

    // TODO A2: Add a method withdraw(double amount)
    //   - If amount <= balance: subtract and print
    //       "Withdrew $<amount>. Balance = $<balance>"
    //   - Else: print "Not enough funds!"
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO B1: Ask user for starting balance
        // TODO B2: Create a BankAccount object

        // TODO C1: Ask for amount to withdraw (0 to exit)
        // TODO C2: While amount != 0
        //   - Call withdraw(amount)
        //   - Ask for next amount

        // After loop ends:
        //   Print "Goodbye!"
    }
}
```

## Author
Julius A Concepcion

"Aiden Riodique Fixed your How to Run Description"

## Collaboration Acknowledgment
This project was reviewed and edited by THE GOAT Aiden Riodique on GitHub.
