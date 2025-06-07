import java.util.Scanner;

public class CrimeInvestigation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };
        int respostasPositivas = 0;

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals("s")) {
                respostasPositivas++;
            }
        }

        if (respostasPositivas == 5) {
            System.out.println("Assassino");
        } else if (respostasPositivas >= 3) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas >= 2) {
            System.out.println("Suspeita");
        } else {
            System.out.println("Inocente");
        }

        scanner.close();
    }
}