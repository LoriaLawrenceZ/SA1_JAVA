package SA1_JAVA;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Exercicios exercicios = new Exercicios();

        String escolha = "";

        do {
            System.out.println("\n------------------------------------------------------------------------------------\nEscolha qual exercício deseja ver:\n[1] - Exercício 1\n[2] - Exercício 2\n[3] - Exercício 3\n[S] - SAIR\n[Apenas Números]");

            escolha = in.next();

            switch (escolha) {
                case "1":
                    exercicios.Millenium();
                    break;
    
                case "2":
                    exercicios.Brooklyn();
                    break;
                
                case "3":
                    exercicios.Madruga();
                    break;

                case "S":
                    System.out.println("----====Encerrando Programa====----");
                    escolha = "N";
                    break;
    
                default:
                    System.out.println("Insira um valor válido da próxima vez");
                    escolha = "N";
                    break;
            }

        } while (escolha != "N");

        in.close();
    }
}
