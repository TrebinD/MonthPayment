public class Calculate {
    public static double monthPayment(int summa, int month, double percent) {
        double percentMonth = (percent / 12) * 0.01;
        double pow = 1.0 + percentMonth;
        double result = pow;

        for (int i = 1; i < month; i++) {
            result = result * pow;
        }

        double ratioAnnuity = percentMonth + (percentMonth / (result - 1.0));
        double payment = ratioAnnuity * summa;
        return payment;
    }
}
