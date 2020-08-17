package databaseoperations;

import javax.persistence.Column;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Table(name = "accounts")
public class Account {


    private int id;

    @Column(name = "account_number")
    private String accountNumber;

    private String ownerFirstName;

    private String ownerLastName;

    private LocalDate expDate;

    private double balance;

    private List<AccountOwnerAddress> addresses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<AccountOwnerAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AccountOwnerAddress> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ownerFirstName='" + ownerFirstName + '\'' +
                ", ownerLastName='" + ownerLastName + '\'' +
                ", expDate=" + expDate +
                ", balance=" + balance +
                '}';
    }
}
