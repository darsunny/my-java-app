package lesson6;

import java.util.Scanner;

public class MainCards {
    public static void main(String[] args) {
        //Создание кредитных карточек
        CreditCard FirstCard = new CreditCard(234567, 1000.0);
        CreditCard SecondCard = new CreditCard(984635854, 55456.34);
        CreditCard ThirdCard = new CreditCard(458677623, 78455.90);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавьте сумму: ");
        double Value1 = scanner.nextDouble();

        System.out.println("Сумма для снятия: ");
        double Value2 = scanner.nextDouble();
        scanner.close();

        FirstCard.addMoney(Value1);
        SecondCard.addMoney(Value1);
        ThirdCard.withdrawMoney(Value2);

        /* System.out.println("Новый баланс на первой карте: " + FirstCard.AccountValue);
        System.out.println("Новый баланс на второй карте: " + SecondCard.AccountValue);
        System.out.println("Новый баланс на третьей карте: " + ThirdCard.AccountValue);
        System.out.println();*/

        System.out.println("Информация о первой карте. " + FirstCard.getAllInfoAboutCreditCard());
        System.out.println("Информация о второй карте. " + SecondCard.getAllInfoAboutCreditCard());
        System.out.println("Информация о третьей карте. " + ThirdCard.getAllInfoAboutCreditCard());
    }
}