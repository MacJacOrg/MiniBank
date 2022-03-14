public class Account {

    private int accountNo;
    private String accountName;
    private String accountSurname;
    private long balance;

    public Account(int accountNo, String accountName, String accountSurname, long balance){
      this.accountNo = accountNo;
      this.accountName = accountName;
      this.accountSurname = accountSurname;
      this.balance = balance;
    }

    public Account(){

    };


    public int getAccountNo(){
        return accountNo;
    }


    public void setAccountNo(int accountNo){
        this.accountNo = accountNo;
    }

}
