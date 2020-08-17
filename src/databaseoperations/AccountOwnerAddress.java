package databaseoperations;

public class AccountOwnerAddress {

    private int id;

    private int accountId;

    private String address;

    private int appNumber;

    public AccountOwnerAddress(int accountId, String address, int appNumber) {
        this.accountId = accountId;
        this.address = address;
        this.appNumber = appNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(int appNumber) {
        this.appNumber = appNumber;
    }

    @Override
    public String toString() {
        return "AccountOwnerAddress{" +
                "address='" + address + '\'' +
                ", appNumber=" + appNumber +
                '}';
    }
}
