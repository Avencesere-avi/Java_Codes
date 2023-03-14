package HashMapDemo;

public class Account {

    public Integer getAccount_No() {
        return Account_No;
    }

    public void setAccount_No(Integer account_No) {
        Account_No = account_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    private Integer Account_No;
    private String name;
    private Double balance;

    @Override
    public String toString() {
        return "Account{" +
                "Account_No=" + Account_No +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Account(int account_No, String name, double balance) {
        Account_No = account_No;
        this.name = name;
        this.balance = balance;
    }
}
