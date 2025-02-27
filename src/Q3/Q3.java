package Q3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        JSONArray jsonArray;

        JSONParser parser = new JSONParser();

        try {
            jsonArray = (JSONArray) parser.parse(new FileReader("dados.json"));

            List<Double> valores = new ArrayList<>();

           for (Object obj : jsonArray) {
               JSONObject jsonObject = (JSONObject) obj;

               double valor = Double.parseDouble(jsonObject.get("valor").toString());

               if (valor > 0) {
                   valores.add(valor);
               }
           }

           if (valores.isEmpty()) {
               System.out.println("Não houve faturamento no mês");
           }

           double minFaturamento = valores.stream().min(Double::compareTo).get();
           double somaFaturamento = valores.stream().mapToDouble(Double::doubleValue).sum();
           double mediaFaturamento = somaFaturamento / valores.size();

           long diasAcimaDamedia = valores.stream().filter(valor -> valor > mediaFaturamento).count();

            System.out.println("Valor minimo: " + minFaturamento);
            System.out.printf("Valor medio: %.4f\n", mediaFaturamento);
            System.out.println("Número de dias que o valor do faturamento foi acima da média mensal: " + diasAcimaDamedia);

        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
