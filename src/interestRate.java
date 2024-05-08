public class interestRate {
    public static void main(String[] args) {

        for(double interestRate = 7.5;interestRate<=10;interestRate+=0.25){
            System.out.println(calculateInterest(100,interestRate));
        }
    }

    public static double calculateInterest(double amount, double rate){
        return (amount * (rate/100));
    }
}
