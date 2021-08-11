public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int remittance = 1100;

        int finalBalance;
        if (remittance > 1000) {
            finalBalance = balance + remittance + remittance / 100;
        } else {
            finalBalance = balance + remittance;
        }
        System.out.println(finalBalance);
    }
}
