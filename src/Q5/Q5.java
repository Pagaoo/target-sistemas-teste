package Q5;

public class Q5 {
    public static void main(String[] args) {
        String palavra = "aleluia?";
        String invertida = inverterString(palavra);

        System.out.println(palavra);
        System.out.println(invertida);
    }

    public static String inverterString(String palavra) {
        char[] caracteres = palavra.toCharArray();
        char[] letras = new char[caracteres.length];
        int letrasIndex = 0;

        for (char c: caracteres) {
            if (Character.isLetter(c)) {
                letras[letrasIndex++] = c;
            }
        }

        for (int i = 0; i < letrasIndex / 2; i++) {
            char aux = letras[i];
            letras[i] = letras[letrasIndex - 1 - i];
            letras[letrasIndex - 1 - i] = aux;
        }

        StringBuilder builder = new StringBuilder();
        int letraIndex = 0;

        for (char c: caracteres) {
            if (Character.isLetter(c)) {
                builder.append(letras[letraIndex++]);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
