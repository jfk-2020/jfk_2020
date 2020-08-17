package databaseoperations;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class DatabaseOperationsApplication {

    static int id = 1;

    public static void main(String[] args) throws IOException {
        Account account = new Account();
        account.setId(id++);
        account.setAccountNumber("1234 5678 9123 4567");
        account.setExpDate(LocalDate.now().plusYears(2));
        account.setOwnerFirstName("Jhon");
        account.setOwnerLastName("Doe");
        account.setBalance(1000);
        account.setAddresses(List.of(new AccountOwnerAddress(account.getId(), "Mashtoc", 34),
                new AccountOwnerAddress(account.getId(), "Baxramyan", 43)));
        DatabaseReadWriteOperations operations = new DatabaseReadWriteOperations();
        Account found = operations.findAccountByCardNumber("1234 5678 9123 4537");
        if (found == null) {
            return;
        }
        System.out.println(found);
    }
}
