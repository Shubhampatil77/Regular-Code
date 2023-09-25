package Day5;

public class FactorialUsingRecurssion {
    static int fact = 1;

    public static void main(String args[]) {
        int n = 5; // Input for factorial calculation
        FactorialUsingRecurssion s = new FactorialUsingRecurssion();
        int res = s.calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + res);
    }

    int calculateFactorial(int no) {
        if (no > 1) {
            fact = fact * no;
            return calculateFactorial(no - 1);
        }
        return fact;
    }
}
