public class BankAccount {
     private double balance;

        public BankAccount(double balance)
        {
            this.balance = balance;
        }
        // Deposits money into bank account.
        public void deposit(double amount)
        {
            balance = balance + amount;
        }
        // Withdraws money from the bank account.
        public void withdraw(double amount)
        {
            balance = balance - amount;
        }

        public double getBalance()
        {
            return balance;
        }
        
        public static void main(String[] args)
        {
            BankAccount mySavings = new BankAccount(1000);
            mySavings.deposit(2000);
            mySavings.deposit(4000);
            mySavings.deposit(550);
            mySavings.withdraw(1500);
            mySavings.deposit(1000);
            mySavings.withdraw(800);
            System.out.println(mySavings.getBalance());
            System.out.println("Expected: 6250");
        }

    }

