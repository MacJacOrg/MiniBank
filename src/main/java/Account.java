import java.util.Scanner;

public class Account {
    private int accountNumber;
    private String accountName;
    private String accountSurname;
    private long balance;

    Scanner scanner= new Scanner(System.in);



    public Account (int accountNumber, String accountName, String accountSurname, long balance){
        this.accountNumber= accountNumber;
        this.accountName= accountName;
        this.accountSurname=accountSurname;
        this.balance=balance;
    }
    public Account (){

    };

    public int getAccountNumber(){
        return accountNumber;

    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;

    }
    public void openAccount(){
        System.out.println("podaj numer ID");
        accountNumber= scanner.nextInt();
        System.out.println(" podaj imie");
        accountName= scanner.next();
        System.out.println("podaj nazwisko");
        accountSurname= scanner.next();
        System.out.println("podaj stan konta");
        balance= scanner.nextInt();
    }
    public void showAccount(){
        System.out.println("Numer klienta: " + accountNumber + " Imię: " + accountName + " Nazwisko: " + accountSurname + " Podaj stan konta: " + balance);
    }

    public boolean search(int accountNumber){
        if (this.accountNumber == accountNumber){
            return true;
        }
        return false;
    }
}
