import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilu użytkowników chcesz dodać?");
        int numberOfNewAccount = scanner.nextInt();
        Account tableOfNewAccounts[] = new Account[numberOfNewAccount];

        for (int i = 0; i < tableOfNewAccounts.length; i++){
            tableOfNewAccounts[i] = new Account();
            tableOfNewAccounts[i].openAccount();
        }

        int inputNumber;
        do {
            System.out.println("1 search.2.3.4.5.exit");
            System.out.println("Co chcesz zrobić, wprowadż cyfrę: ");
            inputNumber = scanner.nextInt();
            switch (inputNumber){
                case  1:
                    System.out.println("Podaj accountNumber: ");
                    int accountToSearch = scanner.nextInt();
                    boolean found = false;

                     for (int i = 0; i < tableOfNewAccounts.length; i++){
                         found = tableOfNewAccounts[i].search(accountToSearch);
                         tableOfNewAccounts[i].showAccount();

                         if (found){
                             break;
                         }


                     }
                case 5:
                    break;
            }
        } while (inputNumber != 5);

    }

}