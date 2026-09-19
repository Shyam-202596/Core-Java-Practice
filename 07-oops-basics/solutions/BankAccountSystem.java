public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(11, "Shyama Shyami", 12);
        ba.deposit(100);
        ba.withdraw(200);
        System.out.println("Current Balance: " + ba.getBalance());
    }
}
class BankAccount{
    private final int accountNumber;
    private final String accountHolderName;
    private int balance;
    BankAccount(int accountNumber, String accountHolderName, int balance){
        if(accountNumber <= 0){
            throw new IllegalArgumentException("Account number must be positive.");
        }
        if(accountHolderName == null || accountHolderName.isBlank()){
            throw new IllegalArgumentException("Account holder name is required.");
        }
        if(balance < 0){
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void deposit(int depAmount){
        if(depAmount <= 0){
            System.out.println("Deposit amount must be positive");
            return;
        }
        balance += depAmount;
        System.out.println("Deposit Successful. New Balance: "+ balance);
    }
    void withdraw(int withAmount){
        if(withAmount <= 0){
            System.out.println("withdraw amount must be positive.");
            return;
        }
        if(withAmount > balance){
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= withAmount;
        System.out.println("withdraw Successful. New Balance: " + balance);
    }
    int getAccountNumber(){
        return accountNumber;
    }
    String getAccountHolderName(){
        return accountHolderName;
    }
    int getBalance(){
        return balance;
    }
}
