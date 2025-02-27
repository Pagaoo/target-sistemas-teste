package Q2;

public class Q2 {
    public static void main(String[] args) {
        long n = 1;

        if (check_if_in_fibo(n)) {
            System.out.println("Número: " + n + " está na sequência de fibonacci");
        } else {
            System.out.println("Número: " + n + " não está na sequência de fibonacci");
        }
    }

    public static boolean check_if_in_fibo(long n) {
        if (n < 0) {
            return false;
        }

        long n1 = 0;
        long n2 = 1;

        while (n1 <= n) {
            if (n1 == n) {
                return true;
            }
            long proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
        }
        return false;
    }
}
