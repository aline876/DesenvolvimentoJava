import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        int numeroDaSorte = random.nextInt(100) + 1;

        System.out.println("Bem-vindo ao jogo de adivinhação, " + nomeCompleto + "!");
        System.out.println("De 1 a 100, qual é o número da sorte.");
        System.out.println("Você tem 10 tentativas.");

        int tentativas = 0;
        while (true) {
            System.out.print("Tente adivinhar o número: ");
            int chute = scanner.nextInt();

            tentativas++;

            if (chute < numeroDaSorte) {
                System.out.println("O número da sorte é maior que " + chute);
            } else if (chute > numeroDaSorte) {
                System.out.println("O número da sorte é menor que " + chute);
            } else {
                System.out.println("Parabéns! Você acertou o número.");
                // ASCII art for "You Win"
                System.out.println("▒█░░▒█ █▀▀█ █░░█ 　 █░░░█ ░▀░ █▀▀▄"); 
                System.out.println("▒█▄▄▄█ █░░█ █░░█ 　 █▄█▄█ ▀█▀ █░░█"); 
                System.out.println("░░▒█░░ ▀▀▀▀ ░▀▀▀ 　 ░▀░▀░ ▀▀▀ ▀░░▀ ");

                System.out.println("Você acertou o número em " + tentativas + " tentativas!");
                System.out.println("Obrigado por jogar, " + nomeCompleto + "!");

                String resposta;
                System.out.print("Deseja continuar? (s/n): ");
                resposta = scanner.next();

                if (resposta.equalsIgnoreCase("s")) {
                    System.out.println("Vamos jogar novamente!");
                    numeroDaSorte = random.nextInt(100) + 1;
                    tentativas = 0;
                } else {
                    System.out.println("Obrigado por jogar, " + nomeCompleto + "!");
                    return;
                }
            }

            if (tentativas == 10) {
                System.out.println("Você não acertou o número. O número era " + numeroDaSorte);
                // ASCII art for "Game Over"
                System.out.println("█▀▀▀ █▀▀█ █▀▄▀█ █▀▀ 　 █▀▀█ ▀█░█▀ █▀▀ █▀▀█ ");
                System.out.println("█░▀█ █▄▄█ █░▀░█ █▀▀ 　 █░░█ ░█▄█░ █▀▀ █▄▄▀ ");
                System.out.println("▀▀▀▀ ▀░░▀ ▀░░░▀ ▀▀▀ 　 ▀▀▀▀ ░░▀░░ ▀▀▀ ▀░▀▀ ");

                String resposta2;
                System.out.print("Deseja continuar? (s/n): ");
                resposta2 = scanner.next();

                if (resposta2.equalsIgnoreCase("s")) {
                    System.out.println("Vamos jogar novamente!");
                    numeroDaSorte = random.nextInt(100) + 1;
                    tentativas = 0;
                } else {
                    System.out.println("Obrigado por jogar, " + nomeCompleto + "!");
                    return;
                }
            }
        }
    }
}