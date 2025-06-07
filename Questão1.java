import java.util.Scanner;

public class TemperaturaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[12];
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        double soma = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / 12;
        System.out.println("\nTemperaturas acima da média anual (" + media + "°C):");
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > media) {
                System.out.println(meses[i] + ": " + temperaturas[i] + "°C");
            }
        }

        scanner.close();
    }
}