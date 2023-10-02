package interviewQuestions;

public class Fibonacci {
    public static int recursion(int n) {
        if (n <= 1) {
            return n;
        }
        return recursion(n - 1) + recursion(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        int result = recursion(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
