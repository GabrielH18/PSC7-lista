import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NotasDinamicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();
        int valor;

        while (true) {
            System.out.print("Digite uma nota (-1 para sair): ");
            valor = scanner.nextInt();
            if (valor == -1) break;
            notas.add(valor);
        }

        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }

        double media = (notas.size() > 0) ? (double) soma / notas.size() : 0;

        System.out.println("\nQuantidade de valores lidos: " + notas.size());
        System.out.println("Valores na ordem informada: " + notas);
        
        Collections.reverse(notas);
        System.out.println("Valores na ordem inversa: " + notas);
        Collections.reverse(notas); // Reverter de volta

        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);

        long acimaMedia = notas.stream().filter(n -> n > media).count();
        long abaixoSete = notas.stream().filter(n -> n < 7).count();

        System.out.println("Quantidade de valores acima da média: " + acimaMedia);
        System.out.println("Quantidade de valores abaixo de 7: " + abaixoSete);
        System.out.println("Programa encerrado.");
        
        scanner.close();
    }
}