package Q1;

public class Q1 {
    public static void main(String[] args) {
        int resultado = programa(13, 0 , 0);
        System.out.println("A soma é: " + resultado);
    }

    public static int programa(int indice, int k, int soma) {
        while(k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        return soma;
    }
}
