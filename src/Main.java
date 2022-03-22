public class Main {
    public static void main(String[] args) {
        Calculate payment = new Calculate();
        int oneYear = (int) payment.monthPayment(1_000_000, 12, 9.99);
        int twoYear = (int) payment.monthPayment(1_000_000, 24, 9.99);
        int threeYear = (int) payment.monthPayment(1_000_000, 36, 9.99);

        System.out.println("При кредите на 1 год, ваш ежемесячный платеж составит " + oneYear + "руб.");
        System.out.println("При кредите на 1 год, ваш ежемесячный платеж составит " + twoYear + "руб.");
        System.out.println("При кредите на 1 год, ваш ежемесячный платеж составит " + threeYear + "руб.");
    }
}
