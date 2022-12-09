

public class BankAccount {
    private String ownerName = "John Doe";
    private int balance = 0;

    public BankAccount(String newName, Integer newBalance) {
        if (newName != null) {
            ownerName = newName;
        }
        if (newBalance != null) {
            balance = newBalance;
        }
    }

    public String getName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int addedFunds) {
        balance += addedFunds;
    }

    public void withdraw(int amountOfMoney) {
        if (amountOfMoney <= balance) {
            balance -= amountOfMoney;
        } else {
            System.out.println("Withdrawal exceeds limit");
        }
    }

    public void infoToString() {
        System.out.println("Owner Name: " + getName());
        System.out.println("Balance: $" + getBalance());
    }

    public static void main(String args[]) {
        BankAccount myBank = new BankAccount("James Jackson", 250);
        System.out.println("Initial Info: ");
        myBank.infoToString();
        myBank.deposit(500);
        System.out.println("Info After Deposit: ");
        myBank.infoToString();
        myBank.withdraw(300);
        System.out.println("Info After Withdraw: ");
        myBank.infoToString();
    }
}

//q: What happened at the end of Jojo Stardust Crusaders?















