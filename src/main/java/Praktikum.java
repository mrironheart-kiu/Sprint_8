public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        // Позитив
        Account acct1 = new Account("Пёрт Иванов");
        Account acct2 = new Account("П т");
        Account acct3 = new Account("Пёрт Иванов14567896");

        // Негатив
        Account acct4 = new Account("П ");
        Account acct5 = new Account("Пёрт Иванов145678967");
        Account acct6 = new Account("Пёрт  Иванов");
        Account acct7 = new Account(" ПёртИванов");
        Account acct8 = new Account("ПёртИванов ");
        Account acct9 = new Account("ПёртИванов");
        Account acct10 = new Account("");
        Account acct11 = new Account(null);

        acct1.checkNameToEmboss();
        acct2.checkNameToEmboss();
        acct3.checkNameToEmboss();
        acct4.checkNameToEmboss();
        acct5.checkNameToEmboss();
        acct6.checkNameToEmboss();
        acct7.checkNameToEmboss();
        acct8.checkNameToEmboss();
        acct9.checkNameToEmboss();
        acct10.checkNameToEmboss();
        acct11.checkNameToEmboss();
    }

}