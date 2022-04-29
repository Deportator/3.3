public class Main {

    public static void main(String[] args) {
        CreditPaymentService monthlyPayment = new CreditPaymentService();

        monthlyPayment.monthlyPayment(1000000, 3, 9.99);
    }
}
