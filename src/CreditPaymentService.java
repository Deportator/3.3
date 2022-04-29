public class CreditPaymentService {
    public void monthlyPayment(double amount, double years, double percent) {
        double months = years * 12;
        double i = percent / 100 / months; //Процентная ставка в месяц
        double x = 1 + i;
        double r = months * (-1);
        double y = Math.pow(x, r);
        double z = 1 - y;
        double a = i / z;
        double b = amount * a;
        System.out.println(Math.round(b));
    }
}

