package lesson6;

class CreditCard {
    //Состояние
    long AccountNum;
    double AccountValue;

    //Поведение (Методы)
    CreditCard(long AccountNum, double AccountValue) {
        this.AccountNum = AccountNum;
        this.AccountValue = AccountValue;
    }

    void addMoney(double sum) {
        AccountValue += sum;
    }

    void withdrawMoney(double sum) {
        AccountValue -= sum;
    }

    String getAllInfoAboutCreditCard() {
        String result = "Номер счета: " + AccountNum + "," +
                " " + "сумма на счете: " + AccountValue;
        return result;
    }
}