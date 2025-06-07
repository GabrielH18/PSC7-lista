import java.util.Scanner;

public class SalarioVendedores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] contadores = new int[9]; // 9 faixas salariais

        while (true) {
            System.out.print("Digite o valor das vendas brutas do vendedor (-1 para encerrar): ");
            double vendas = scanner.nextDouble();
            if (vendas == -1) break;

            double salario = 200 + (0.09 * vendas);
            int faixa;

            if (salario >= 1000) {
                faixa = 8;
            } else {
                faixa = (int) (salario / 100) - 2;
                if (faixa < 0) faixa = 0;
            }

            contadores[faixa]++;
        }

        System.out.println("\nDistribuição dos salários:");
        String[] faixas = {
            "$200 - $299", "$300 - $399", "$400 - $499", "$500 - $599",
            "$600 - $699", "$700 - $799", "$800 - $899", "$900 - $999",
            "$1000 em diante"
        };

        for (int i = 0; i < contadores.length; i++) {
            System.out.println(faixas[i] + ": " + contadores[i] + " vendedores");
        }

        scanner.close();
    }
}