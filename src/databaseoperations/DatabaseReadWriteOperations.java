package databaseoperations;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatabaseReadWriteOperations {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
    private File accountFile = new File("C:\\Users\\William Arustamyan\\IdeaProjects\\jfk_2020\\src\\databaseoperations\\account.txt");

    public Account findAccountByCardNumber(String cardNumber) throws IOException {
        FileReader fileReader = new FileReader(accountFile);
        BufferedReader reader = new BufferedReader(fileReader);
        reader.readLine();
        String line = reader.readLine();

        String foundLine = null;
        while (line != null) {
            if (line.startsWith(cardNumber)) {
                foundLine = line;
                break;
            }
            line = reader.readLine();
        }

        if (foundLine != null) {
            String[] accountData = foundLine.split("\\|");
            Account account = new Account();
            account.setAccountNumber(accountData[0].trim());
            account.setExpDate(LocalDate.parse(accountData[1].trim(), formatter));
            account.setOwnerFirstName(accountData[2].trim());
            account.setOwnerLastName(accountData[3].trim());
            account.setBalance(Double.parseDouble(accountData[4].trim()));
            return account;
        }
        return null;
    }

    public void save(Account account) {

    }
}
